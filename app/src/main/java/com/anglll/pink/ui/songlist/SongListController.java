package com.anglll.pink.ui.songlist;


import com.airbnb.epoxy.TypedEpoxyController;
import com.anglll.pink.data.model.Song;
import com.anglll.pink.data.model.SongList;
import com.anglll.pink.ui.model.MusicItemModel_;

/**
 * Created by yuan on 2017/9/5 0005.
 */

public class SongListController extends TypedEpoxyController<SongList> {

    private final SongListCallback callback;

    SongListController(SongListCallback callback) {
        this.callback = callback;
    }

    @Override
    protected void buildModels(SongList songList) {
        for (int i = 0; i < songList.getPlayList().size(); i++) {
            Song song = songList.getPlayList().get(i);
            add(new MusicItemModel_()
                    .id(song.getId())
                    .index(i)
                    .callback(callback)
                    .song(song));
        }
    }


    public interface SongListCallback {
        void onSongClick(Song song,int index);
    }
}
