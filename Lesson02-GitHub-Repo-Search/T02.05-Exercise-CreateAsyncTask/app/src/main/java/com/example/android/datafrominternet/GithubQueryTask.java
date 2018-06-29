package com.example.android.datafrominternet;

import android.os.AsyncTask;

import com.example.android.datafrominternet.utilities.NetworkUtils;

import java.io.IOException;
import java.net.URL;

public class GithubQueryTask extends AsyncTask<URL, Void, String> {

    @Override
    protected String doInBackground(URL... urls) {
        String stringResults = null;
        try {
             stringResults = NetworkUtils.getResponseFromHttpUrl(urls[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringResults;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
