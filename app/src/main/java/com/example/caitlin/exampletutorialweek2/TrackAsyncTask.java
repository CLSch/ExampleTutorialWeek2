package com.example.caitlin.exampletutorialweek2;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Caitlin on 21-02-17.
 */

public class TrackAsyncTask extends AsyncTask<String, Integer, String> {
    Context context;
    MainActivity mainAct;

    public TrackAsyncTask(MainActivity main) {
        this.mainAct = main;
        this.context = this.mainAct.getApplicationContext();
    }

    @Override
    protected void onPreExecute() {
        Toast.makeText(context, "searching for tracks...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected String doInBackground(String... params) {
        return HttpRequestHelper.downloadFromServer("track", params);
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
    }
}


