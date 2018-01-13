package com.qihang.controller;

import com.qihang.model.Library;
import com.qihang.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @Autowired
    LibraryService libraryService;


    @RequestMapping("/getbook")
    public Library getAll(){
        return libraryService.getAll();
    }
}
