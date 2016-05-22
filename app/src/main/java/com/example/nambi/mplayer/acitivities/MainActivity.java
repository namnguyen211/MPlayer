package com.example.nambi.mplayer.acitivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.nambi.mplayer.R;
import com.example.nambi.mplayer.adapters.ElementListAdapter;
import com.example.nambi.mplayer.models.AlbumsElement;
import com.example.nambi.mplayer.models.BaseListElement;
import com.example.nambi.mplayer.models.SongsElement;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ElementListAdapter listAdapter;
    List<BaseListElement> listElements;
    View listHeader,listFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        listElements = new ArrayList<>();
        addElement();
        listView.setAdapter(listAdapter);
        setupHeaderAndFooter();

    }

    public void addElement(){
        listElements.add(new SongsElement(this));
        listElements.add(new AlbumsElement(this));
        listElements.add(new SongsElement(this));
        listElements.add(new AlbumsElement(this));
        listElements.add(new SongsElement(this));
        listElements.add(new AlbumsElement(this));
        listElements.add(new SongsElement(this));
        listElements.add(new AlbumsElement(this));
        listElements.add(new SongsElement(this));
        listElements.add(new AlbumsElement(this));
        listAdapter = new ElementListAdapter(this,listElements);
    }

    public void setupHeaderAndFooter(){
        listHeader = View.inflate(this,R.layout.list_header,null);
        listFooter = View.inflate(this,R.layout.list_footer,null);
        listView.addHeaderView(listHeader);
        listView.addFooterView(listFooter);

    }
}
