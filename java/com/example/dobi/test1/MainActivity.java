package com.example.dobi.test1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    TextView t1,t2;

    private HighScoresManager hScMan

    public void NewGame(View v){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
    public void HowTo(View v){
        Intent intent = new Intent(this, DisplayHowToActivity.class);
        startActivity(intent);
    }
    public void About(View v){
        Toast.makeText(getApplicationContext(),"hehs v2",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        hScMan = new HighScoresManager(this);
    }

    @Override
    protected void onResume(Bundle savedInstanceState){
        super.onResume(savedInstanceState);
        t2.setText( hScMan.getHighest(3)[1].user + " " +
                hScMan.getHighest(3)[1].score + "\n" +
                hScMan.getHighest(3)[1].user + " " +
                hScMan.getHighest(3)[1].score + "\n" +
                hScMan.getHighest(3)[1].user + " " +
                hScMan.getHighest(3)[1].score);

    }

}
