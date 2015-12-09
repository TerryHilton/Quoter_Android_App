package com.terryhilton.quoter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayingQuotesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaying_quotes);

        // Creating an object for each quote_book from the Quotebook class
        String[] quotes = {"When life gives you lemons make lemonaid","Everything and anything is all I never wanted"};

        Quotebook famous_quotes = new Quotebook("Famous","MiniBuzz",quotes);
        Quotebook funny_quotes = new Quotebook("Funny","StarryNight",quotes);
        Quotebook life_quotes = new Quotebook("Life","SunnyDay",quotes);
        Quotebook community_quotes = new Quotebook("Community6","MoonLight",quotes);


        // Layout Data
        TextView bookName = (TextView) findViewById(R.id.bookName);
        TextView quote = (TextView) findViewById(R.id.quote);
        RelativeLayout backGroundImage = (RelativeLayout) findViewById(R.id.backGroundImage);

        //Getting Extra data from intent that started, then grabbing the id of the intent
        //This is so we can run a series of IF statements to display what appears on this screen
        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt("id");

         if(id == 1) {
             Toast.makeText(this, "works", Toast.LENGTH_LONG).show();
             // Getting data from our object and applying it to the fields
             bookName.setText(life_quotes.getBookName());

             //Storing the array inside of a string before applying quote to screen
             String[] quote_book = life_quotes.getQuotes();
             quote.setText(quote_book[1]);


         }







    }



}
