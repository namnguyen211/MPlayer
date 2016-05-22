package com.example.nambi.mplayer.acitivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.nambi.mplayer.R;

public class ListSongActivity extends AppCompatActivity {

    ListView listSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_song);
    }
}
