package com.anglll.pink.ui.songlist;


import com.airbnb.epoxy.TypedEpoxyController;
import com.anglll.pink.data.model.Song;
import com.anglll.pink.data.model.SongList;
import com.anglll.pink.ui.songlist.model.MusicItemModel_;

/**
 * Created by yuan on 2017/9/5 0005.
 */

public class SongListController extends TypedEpoxyController<SongList> {

    @Override
    protected void buildModels(SongList songList) {
        for (Song song : songList.playList) {
            add(new MusicItemModel_()
                    .id(song.getId()));
        }
    }
}