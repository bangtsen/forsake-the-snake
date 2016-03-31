package com.example.dobi.test1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;


/**
 * Created by dobi on 3/5/16.
 */

public class Score{

    public String user;
    public int score;

    public void Score(){
        this.user = null;
        this.score= 0;
    }
    public void Score(String user,int score){
        this.user = user;
        this.score= score;
    }
}


public class HighScoresManager extends SQLiteOpenHelper{

    public HighScoresManager(Context context){
        super(context, "high_scores.db",null,1);
    }
    public void addScore(String user,int score){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues wpis = new ContentValues();
        wpis.put("user",user);
        wpis.put("score", score);
        db.insertOrThrow("highscores", null, wpis);
    }
    public Score[] getHighest(int nOfScores){
        Score[] scores= new Score[nOfScores];
        String[] col= {"n","user","score"}
        SQLiteDatabase db = getReadableDatabase();
        Cursor k = db.query("highscores",col,null,null,null,null,null);

        while (k.moveToNext()) {
            if(k.getInt(3) > scores[0]){
                for (int i=nOfScores;i>0;--i) {
                    scores[i]=scores[i-1];
                }
                scores[0].user=k.getString(2);
                scores[0].score=k.getInt(3);
            }
        }
        return scores;
    }


}


    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table highscores(n integer primary key autoincrement," +
                "user text,score integer");
    }
    @Override
    public void onUpdate(SQLiteDatabase db,int Old, int New){}

}
