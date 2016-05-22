package com.example.nambi.mplayer.models;

import android.content.Context;
import android.view.View;

/**
 * Created by nambi on 5/15/16.
 */
public abstract class BaseListElement {

    public Context context;
    private int iconResource;
    private String nameList;
    private int number;

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void UpdateData();

    public abstract View.OnClickListener GetOnClickListener();


}
