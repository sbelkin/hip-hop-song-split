package io.sbelkin.tool.hiphop.model;

import java.util.Date;

/**
 * Created by sabel on 6/29/2017.
 */
public class Song {

    private long id;
    private String name;
    private String link;
    private Date date;

    public Song() {
    }

    public Song(String name, String link, Date date) {
        this.name = name;
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
