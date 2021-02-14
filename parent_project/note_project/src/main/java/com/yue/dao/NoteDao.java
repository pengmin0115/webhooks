package com.yue.dao;

import com.yue.entity.Note;

import java.util.List;

/**
 * @author pengmin
 * @date 2021/1/31 15:34
 */

public interface NoteDao {

    /**
     * 插入note;
     * @param note
     */
    void insertNote(Note note);

    /**
     * 查询所有;
     * @return
     */
    List<Note> findAll();
}
