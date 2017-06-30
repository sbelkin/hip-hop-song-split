package io.sbelkin.tool.hiphop.model;

import java.util.Date;

/**
 * Created by sabel on 6/29/2017.
 */
public class SongSplitTime {

    private long id;
    private Song song;
    private String description;
    private Integer startTime;
    private Integer playTime;
    private Date date;

    public SongSplitTime(Song song, String description, Integer startTime, Integer playTime, Date date) {
        this.song = song;
        this.startTime = startTime;
        this.playTime = playTime;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
