package com.qihang;

import com.qihang.dao.LibraryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

public class MybatisTest {
    @Autowired
    LibraryMapper libraryMapper;

    @Test
    public void getAll(){
        System.out.println(libraryMapper.selectByPrimaryKey(1));
    }
}
