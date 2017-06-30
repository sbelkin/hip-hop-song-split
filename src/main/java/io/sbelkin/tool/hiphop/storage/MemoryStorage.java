package io.sbelkin.tool.hiphop.storage;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.model.SongSplitTime;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sabel on 6/29/2017.
 */
public class MemoryStorage {

    private static List<Song> multimapSong = new ArrayList<>();
    private static List<SongSplitTime> multimapSongSplitTime = new ArrayList<>();

    public static Object insert(Object o) {
        if (o instanceof Song) {
            Song s = (Song) o;
            int id = multimapSong.size()+1;
            s.setId(id);
            multimapSong.add(s);
            return s;
        } else if (o instanceof SongSplitTime) {
            SongSplitTime s = (SongSplitTime) o;
            int id = multimapSong.size()+1;
            s.setId(id);
            multimapSongSplitTime.add(s);
            return s;
        } else {
            return new String("Invalid object: " + o.toString());
        }
    }

    public static Optional<Song> getSong(String name) {
        return multimapSong.stream()
                .filter(s -> s.getName() == name)
                .findFirst();
    }

    public static Optional<SongSplitTime> getSongSplitTime(int songId, String description) {
        return multimapSongSplitTime.stream()
                .filter(s -> s.getSong().getId() == songId)
                .filter(s -> s.getDescription() == description)
                .findFirst();
    }
}
