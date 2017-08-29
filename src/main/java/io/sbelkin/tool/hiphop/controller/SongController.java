package io.sbelkin.tool.hiphop.controller;

import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.storage.SongStorage;
import io.sbelkin.tool.hiphop.storage.impl.MemoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by sbelkin on 6/29/2017.
 */
@RestController
public class SongController {

    @Autowired
    private MemoryStorage songStorage;

    @RequestMapping(value = "/song", method = RequestMethod.GET)
    public Song getSong(@RequestParam(value="name", defaultValue="") String name) {
        Optional o = songStorage.getSong(name);
        if (o.isPresent()) {
            return (Song) o.get();
        } else {
            return new Song();
        }
    }

    @RequestMapping(value = "/song", method = RequestMethod.POST)
    public Song saveSong(@RequestBody Song song) {
        return songStorage.insert(song);
    }
}
