package com.qihang.tool;

import java.util.Collections;
import java.util.List;

public class ListPageUtil<T> {
    private List<T> list;/**结果集合*/
    //总记录数
    private int total;
    //总页数
    private int pages;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;
    //导航页码数
    private int navigatePages;
    //所有导航页号
    private int[] navigatepageNums;
    //导航条上的第一页
    private int navigateFirstPage;
    //导航条上的最后一页
    private int navigateLastPage;





    public ListPageUtil(List<T> data, int pageNum, int pageSize, int navigatePages) {//数据，当前页，页面大小，导航大小
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("data must be not empty!");
        }
        this.isFirstPage = false;
        this.isLastPage = false;
        this.hasPreviousPage = false;
        this.hasNextPage = false;
//        this.list = data;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = data.size();
        this.pages = (total + pageSize - 1) / pageSize;
        this.prePage = pageNum-1>1? pageNum-1:1;
        this.nextPage = pageNum>=pages? pages: pageNum + 1;
        this.navigatePages = navigatePages;
        this.list=getPagedList(data);
        //计算导航页
        calcNavigatepageNums();
        //计算前后页，第一页，最后一页
        calcPage();
        //判断页面边界
        judgePageBoudary();

    }

    //计算导航页
    private void calcNavigatepageNums() {
        //当总页数小于或等于导航页码数时
        if (pages <= navigatePages) {
            navigatepageNums = new int[pages];
            for (int i = 0; i < pages; i++) {
                navigatepageNums[i] = i + 1;
            }
        } else { //当总页数大于导航页码数时
            navigatepageNums = new int[navigatePages];
            int startNum = pageNum - navigatePages / 2;
            int endNum = pageNum + navigatePages / 2;

            if (startNum < 1) {
                startNum = 1;
                //(最前navigatePages页
                for (int i = 0; i < navigatePages; i++) {
                    navigatepageNums[i] = startNum++;
                }
            } else if (endNum > pages) {
                endNum = pages;
                //最后navigatePages页
                for (int i = navigatePages - 1; i >= 0; i--) {
                    navigatepageNums[i] = endNum--;
                }
            } else {
                //所有中间页
                for (int i = 0; i < navigatePages; i++) {
                    navigatepageNums[i] = startNum++;
                }
            }
        }
    }
    //计算前后页，第一页，最后一页
    private void calcPage() {
        if (navigatepageNums != null && navigatepageNums.length > 0) {
            navigateFirstPage = navigatepageNums[0];
            navigateLastPage = navigatepageNums[navigatepageNums.length - 1];
            if (pageNum > 1) {
                prePage = pageNum - 1;
            }
            if (pageNum < pages) {
                nextPage = pageNum + 1;
            }
        }
    }
    // 判定页面边界
    private void judgePageBoudary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
        hasPreviousPage = pageNum > 1;
        hasNextPage = pageNum < pages;
    }
    //得到分页后的数据
    public List<T> getPagedList(List<T> data) {
        int fromIndex = (pageNum - 1) * pageSize;
        if (fromIndex >= data.size()) {
            return Collections.emptyList();//空数组
        }
        if(fromIndex<0){
            return Collections.emptyList();//空数组
        }
        int toIndex = pageNum * pageSize;
        if (toIndex >= data.size()) {
            toIndex = data.size();
        }
        return data.subList(fromIndex, toIndex);
    }

    public List<T> getList() {
        return list;
    }

    public int getTotal() {
        return total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPrePage() {
        return prePage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getNextPage() {
        return nextPage;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public int[] getNavigatepageNums() {
        return navigatepageNums;
    }

    public int getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public int getNavigateLastPage() {
        return navigateLastPage;
    }

    public int getPages() {
        return pages;
    }

//    public static void main(String[] args) {
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> list = Arrays.asList(array);
//        ListPageUtil<Integer> listPageUtil = new ListPageUtil<Integer>(list,4, 5);
//        List<Integer> pagedList = listPageUtil.getPagedList();
//        System.out.println(pagedList);
//    }
}