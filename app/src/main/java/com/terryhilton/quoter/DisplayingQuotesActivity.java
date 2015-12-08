package com.terryhilton.quoter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayingQuotesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaying_quotes);

        // Creating an object for each quote_book from the Quotebook class
        String[] quotes = {"sudo-code","sudo-code"};

        Quotebook famous_quotes = new Quotebook("famous_quotes","MiniBuzz",quotes);
        Quotebook funny_quotes = new Quotebook("funny_quotes","StarryNight",quotes);
        Quotebook life_quotes = new Quotebook("life_quotes","SunnyDay",quotes);
        Quotebook community_quotes = new Quotebook("community_quotes","MoonLight",quotes);


        // Text View data
        TextView bookName = (TextView) findViewById(R.id.bookName);
        TextView quote = (TextView) findViewById(R.id.quote);


    }



}
