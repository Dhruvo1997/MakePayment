package com.example.makepayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView AMT = findViewById(R.id.AMT);
        AMT.setVisibility(View.GONE);
        Button cash = findViewById(R.id.CashPayment);
        Button card = findViewById(R.id.CardPayment);
        Button exit =findViewById(R.id.Exit);

        //if the payment details are valid then it will be 0 in the end
        String Charges_Due = AMT.getText().toString();

        cash.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent downloadIntent = new Intent(getApplicationContext(), CashPayment.class);
                startActivity(downloadIntent);
            }
        });

        card.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent downloadIntent = new Intent(getApplicationContext(), CardPayment.class);
                startActivity(downloadIntent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Intent downloadIntent = new Intent(getApplicationContext(), HomeScreen.class);
                //startActivity(downloadIntent);
            }
        });


    }
}