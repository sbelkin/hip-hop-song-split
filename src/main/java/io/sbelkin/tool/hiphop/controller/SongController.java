package io.sbelkin.tool.hiphop.controller;

import io.sbelkin.tool.hiphop.model.Song;
import io.sbelkin.tool.hiphop.storage.MemoryStorage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by sabel on 6/29/2017.
 */
@RestController
public class SongController {

    @RequestMapping(value = "/song", method = RequestMethod.GET)
    public Song getSong(@RequestParam(value="name", defaultValue="") String name) {
        Optional o = MemoryStorage.getSong(name);
        if (o.isPresent()) {
            return (Song) o.get();
        } else {
            return new Song();
        }
    }

    @RequestMapping(value = "/song", method = RequestMethod.POST)
    public Song saveSong(Song song) {
        return (Song) MemoryStorage.insert(song);
    }
}
