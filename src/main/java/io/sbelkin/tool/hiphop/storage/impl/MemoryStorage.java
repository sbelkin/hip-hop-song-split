package io.sbelkin.tool.hiphop.storage.impl;

import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.model.SongSplitTime;
import io.sbelkin.tool.hiphop.storage.SongStorage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by sbelkin on 6/29/2017.
 */

@Component
public class MemoryStorage implements SongStorage {

    private List<Song> listSong = new ArrayList<>();
    private List<SongSplitTime> listSongSplitTime = new ArrayList<>();

    @Override
    public Song insert(Song song) {
        int id = listSong.size() + 1;
        song.setId(id);
        song.setDate(new Date());
        listSong.add(song);
        return song;
    }

    @Override
    public SongSplitTime insert(SongSplitTime splitTime) {
        int id = listSongSplitTime.size()+1;
        splitTime.setId(id);
        splitTime.setDate(new Date());
        listSongSplitTime.add(splitTime);
        return splitTime;
    }

    @Override
    public Optional<Song> getSong(String name) {
        return listSong.stream()
                .filter(s -> name.equals(s.getName()))
                .findFirst();
    }

    @Override
    public Optional<SongSplitTime> getSongSplitTime(int songId, String move) {
        return listSongSplitTime.stream()
                .filter(s -> songId == s.getSong().getId())
                .filter(s -> move.equals(s.getMove()))
                .findFirst();
    }
}
