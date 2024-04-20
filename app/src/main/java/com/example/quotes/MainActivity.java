package com.example.quotes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private TextView quoteTextView;
    private String[] quotes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            quoteTextView = findViewById(R.id.quoteTextView);
            Button generateButton = findViewById(R.id.generateButton);

            // Define quotes directly here
            quotes = getResources().getStringArray(R.array.quotes);

            generateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayRandomQuote();
                }
            });
        }


                private void displayRandomQuote() {
                    Random random = new Random();
                    int index = random.nextInt(quotes.length);
                    quoteTextView.setText("\"" + quotes[index] + "\"");
                }
            }
