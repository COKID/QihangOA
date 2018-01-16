package com.qihang.dao;

import com.qihang.model.Library;
import com.qihang.model.LibraryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryMapper {
    long countByExample(LibraryExample example);

    int deleteByExample(LibraryExample example);

    int deleteByPrimaryKey(String bookname);

    int insert(Library record);

    int insertSelective(Library record);

    List<Library> selectByExample(LibraryExample example);

    Library selectByPrimaryKey(String bookname);

    int updateByExampleSelective(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByExample(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}