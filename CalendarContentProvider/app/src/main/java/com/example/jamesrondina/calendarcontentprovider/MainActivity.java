package com.example.jamesrondina.calendarcontentprovider;

import android.database.Cursor;
import android.provider.CalendarContract;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    CursorAdapter mCursorAdapter;
    public static final int EVENT_LOADER = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        mCursorAdapter = new android.support.v4.widget.SimpleCursorAdapter(
                this, //context
                android.R.layout.simple_list_item_1, //layout
                null,
                new String[]{CalendarContract.Events.TITLE, CalendarContract.Events.DTSTART}, //where data comes from
                new int[]{android.R.id.text1, android.R.id.text2}, //view data is being output to
                0
        );

        getSupportLoaderManager().initLoader(
                EVENT_LOADER,
                null,
                this);

        listView.setAdapter(mCursorAdapter);

        listView.setOnItemLongClickListener();





    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
