package com.example.android.jsonsandbox;

import android.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks{

    /**
     * Constant value for the movielist loader ID. We can choose any integer.
     * This really only comes into play if you're using multiple loaders.
     */
    private static final int MOVIELIST_LOADER_ID = 1;
    public final static String VIDEOSTRING = "https://api.themoviedb.org/3/movie/335984/videos?api_key=02ff7187d940e5bd15cd5acd2b41b63e";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGetJSONResult = (Button) findViewById(R.id.btnGetJSONResult);

        LoaderManager mLoaderManager = getLoaderManager();


        getLoaderManager().restartLoader(MOVIELIST_LOADER_ID, null, this);

        btnGetJSONResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public android.content.Loader onCreateLoader(int id, Bundle args) {
        Log.i("ONCREATELOADER... ","urlPosterString: " + VIDEOSTRING);

        return null;
    }

    @Override
    public void onLoadFinished(android.content.Loader loader, Object data) {
        Log.i("ONLOADFINISHED... ","urlPosterString: " + VIDEOSTRING);


    }

    @Override
    public void onLoaderReset(android.content.Loader loader) {

    }
}
