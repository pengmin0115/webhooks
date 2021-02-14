package com.yue.service;

import com.yue.entity.Note;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * @author pengmin
 * @date 2021/1/31 15:29
 */

public interface NoteService {
    /**
     * 增加note
     * @param theme
     * @param content
     * @param date
     * @param time
     */
    void insertNote(String theme, String content, Date date, Time time);

    /**
     * 查询所有note信息;
     * @return
     */
    List<Note> findAll();
}
