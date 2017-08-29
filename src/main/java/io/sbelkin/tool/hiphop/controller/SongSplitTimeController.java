package io.sbelkin.tool.hiphop.controller;

import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.model.SongSplitTime;
import io.sbelkin.tool.hiphop.storage.SongStorage;
import io.sbelkin.tool.hiphop.storage.impl.MemoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by sbelkin on 6/29/2017.
 */
@RestController
public class SongSplitTimeController {

    @Autowired
    private MemoryStorage songStorage;

    @RequestMapping(value = "/splitTime", method = RequestMethod.GET)
    public Song getSong(@RequestParam(value="name", defaultValue="") int id,
                        @RequestParam(value="move", defaultValue="") String move) {
        Optional o = songStorage.getSongSplitTime(id, move);
        if (o.isPresent()) {
            return (Song) o.get();
        } else {
            return new Song();
        }
    }

    @RequestMapping(value = "/splitTime", method = RequestMethod.POST)
    public SongSplitTime saveSong(@RequestBody SongSplitTime splitTime) {
        return songStorage.insert(splitTime);
    }
}
