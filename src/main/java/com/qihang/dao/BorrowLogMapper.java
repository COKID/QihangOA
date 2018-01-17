package com.qihang.dao;

import com.qihang.model.BorrowLog;
import com.qihang.model.BorrowLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowLogMapper {
    long countByExample(BorrowLogExample example);

    int deleteByExample(BorrowLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowLog record);

    int insertSelective(BorrowLog record);

    List<BorrowLog> selectByExample(BorrowLogExample example);

    BorrowLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowLog record, @Param("example") BorrowLogExample example);

    int updateByExample(@Param("record") BorrowLog record, @Param("example") BorrowLogExample example);

    int updateByPrimaryKeySelective(BorrowLog record);

    int updateByPrimaryKey(BorrowLog record);
}