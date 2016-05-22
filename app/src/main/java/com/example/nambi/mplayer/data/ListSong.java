package com.example.nambi.mplayer.data;

import com.example.nambi.mplayer.models.Song;

import java.util.ArrayList;

/**
 * Created by nambi on 5/15/16.
 */
public class ListSong {

    private static ArrayList<Song> listSong;

    public static ArrayList<Song> getListSong(){
        if(listSong == null){
            listSong = new ArrayList<>();
            listSong.add(new Song("Người Về Nơi Đâu",
                                  "Khắc Việt",
                                  "http://stream2.r17s101.vcdn.vn/fsfsdfdsfdserwrwq3/90434d5429795c1cd6b8e356977026c7/57384b45/2010/11/16/d/a/dad844b4fe3586779a7523e0da757c9a.mp3",
                                  "http://image.mp3.zdn.vn//thumb/240_240/covers/f/5/f53d91bbf820b16528ecf1a5f7165c2b_1289878688.jpg",
                                  "hahaha"));
        }


        return listSong;
    }
}
