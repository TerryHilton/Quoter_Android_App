package com.terryhilton.quoter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        // Buttons For Menu Activity
        Button Famous_Quotes = (Button) findViewById(R.id.FamousQuote);
        Button Funny_Quotes = (Button) findViewById(R.id.FunnyQuotes);
        Button Life_Quotes = (Button) findViewById(R.id.LifeQuotes);
        Button Community_Quotes = (Button) findViewById(R.id.CommunityQuotes);









        // Breaking The Law DRY Soon will incorpate each button with its own class so The code doesnt repeat for each button on the new screen.
        // The code is each button linking to the same activity only the information will be the change.

        Life_Quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(StartMenuActivity.this, DisplayingQuotesActivity.class);
                // Setting an ID so we know what view we are coding for in our display
                intent.putExtra("id", 1);

                startActivity(intent);
            }
        });


    }


}
