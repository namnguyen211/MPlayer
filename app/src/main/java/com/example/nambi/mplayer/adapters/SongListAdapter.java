package com.example.nambi.mplayer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.nambi.mplayer.R;
import com.example.nambi.mplayer.models.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nambi on 5/15/16.
 */
public class SongListAdapter extends BaseAdapter
{
    List<Song> songList;
    Context context;

    public SongListAdapter(Context context) {
        songList = new ArrayList<>();
        this.context = context;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int position) {
        return songList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = View.inflate(context, R.layout.item_song_list,null);

        return convertView;
    }
}
