package com.qihang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qihang.model.Library;
import com.qihang.service.LibraryService;
import com.qihang.tool.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryService libraryService;


    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public Msg getAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,10);
        List<Library> books=libraryService.getAll();
        PageInfo pageInfo=new PageInfo(books,7);
        return Msg.success().add("pageInfo",pageInfo);
    }
}
