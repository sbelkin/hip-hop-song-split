package io.sbelkin.tool.hiphop.model;

import java.util.Date;

/**
 * Created by sbelkin on 6/29/2017.
 */
public class SongSplitTime {

    private long id;
    private Song song;
    private String move;
    private Integer startTime;
    private Integer playTime;
    private Date date;

    public SongSplitTime(Song song, String move, Integer startTime, Integer playTime, Date date) {
        this.song = song;
        this.move = move;
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

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
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
