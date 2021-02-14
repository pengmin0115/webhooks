package com.yue.service.impl;

import com.yue.dao.NoteDao;
import com.yue.entity.Note;
import com.yue.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * @author pengmin
 * @date 2021/1/31 15:30
 */

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    @Override
    public void insertNote(String theme, String content, Date date, Time time) {
        if (date == null) {
            date = new Date();
        }
        if (time == null) {
            time = new Time(date.getTime());
        }
        Note note = new Note(null, theme, content, date, time);
        noteDao.insertNote(note);
    }

    @Override
    public List<Note> findAll() {
        List<Note> list = noteDao.findAll();
        return list;
    }
}
