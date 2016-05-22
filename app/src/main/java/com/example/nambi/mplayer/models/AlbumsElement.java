package com.example.nambi.mplayer.models;

import android.content.Context;
import android.view.View;

import com.example.nambi.mplayer.R;

/**
 * Created by nambi on 5/15/16.
 */
public class AlbumsElement extends BaseListElement {


    public AlbumsElement(Context context) {
        this.context = context;
        UpdateData();
    }

    @Override
    public void UpdateData() {
        this.setIconResource(R.drawable.ic_search);
        this.setNameList("Album");
        this.setNumber(0);
    }

    @Override
    public View.OnClickListener GetOnClickListener() {
        return null;
    }
}
