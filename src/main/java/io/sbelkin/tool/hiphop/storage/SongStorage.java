package io.sbelkin.tool.hiphop.storage;

import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.model.SongSplitTime;

import java.io.InvalidObjectException;
import java.util.Optional;

/**
 * Created by sabel on 8/29/2017.
 */
public interface SongStorage {

    default Object insert(Object o) throws InvalidObjectException {
        if (o instanceof Song) {
            return insert((Song) o);
        } else if (o instanceof SongSplitTime) {
            return insert((SongSplitTime) o);
        } else {
            throw new InvalidObjectException("Unsupported object");
        }
    }

    Song insert(Song song);

    SongSplitTime insert(SongSplitTime song);

    Optional<Song> getSong(String name);

    Optional<SongSplitTime> getSongSplitTime(int songId, String move);
}
