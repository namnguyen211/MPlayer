package com.example.nambi.mplayer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nambi.mplayer.R;
import com.example.nambi.mplayer.models.BaseListElement;

import java.util.List;

/**
 * Created by nambi on 5/15/16.
 */
public class ElementListAdapter extends BaseAdapter {

    public Context context;
    public List<BaseListElement> listElements;


    public ElementListAdapter(Context context,List<BaseListElement> listElements) {
        this.context = context;
        this.listElements = listElements;
    }

    @Override
    public int getCount() {
        return listElements.size();
    }

    @Override
    public Object getItem(int position) {
        return listElements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView icon;
        TextView name,number;

        convertView = View.inflate(context, R.layout.item_list,null);
        icon = (ImageView) convertView.findViewById(R.id.imv);
        name = (TextView) convertView.findViewById(R.id.tvName);
        number = (TextView) convertView.findViewById(R.id.tvNumber);

        icon.setImageResource(listElements.get(position).getIconResource());
        name.setText(listElements.get(position).getNameList());
        number.setText(String.valueOf(listElements.get(position).getNumber()));


        return convertView;
    }
}
