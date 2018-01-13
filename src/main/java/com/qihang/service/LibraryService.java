package com.qihang.service;

import com.qihang.dao.LibraryMapper;
import com.qihang.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryMapper libraryMapper;

    public Library getAll(){
       return  libraryMapper.selectByPrimaryKey(1);
    }
}
