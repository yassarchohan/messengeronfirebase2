package com.example.sayla.messages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class letsgochat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letsgochat);

        Button btn = (Button) findViewById(R.id.send);
        Intent intent = new Intent(this,messaging.class);
        startActivity(intent);
    }
}
