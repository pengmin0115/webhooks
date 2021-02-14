package com.yue.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * @author pengmin
 * @date 2021/1/31 15:13
 */

public class Note implements Serializable {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 主题
     */
    private String theme;

    /**
     * 内容
     */
    private String content;

    /**
     * 日期
     */
    private Date date;

    /**
     * 时间
     */
    private Time time;

    public Note() {
    }

    public Note(Integer id, String theme, String content, Date date, Time time) {
        this.id = id;
        this.theme = theme;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
