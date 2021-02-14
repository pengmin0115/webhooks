package com.yue.controller;

import com.yue.service.NoteService;
import com.yue.vo.MyResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;

/**
 * @author pengmin
 * @date 2021/1/31 15:17
 */
@RestController
@RequestMapping("/note")
@Api(tags = "noteController", description = "对note信息增删该查")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/findAll")
    public MyResponse findAll(){
        return MyResponse.success(noteService.findAll());
    }

    @PostMapping("/insert")
    @ApiOperation(value = "insert note", response = MyResponse.class, httpMethod = "POST")
    public MyResponse addNote(String theme, String content, Date date, Time time) {
        noteService.insertNote(theme,content,date,time);
        return MyResponse.success();
    }

}
