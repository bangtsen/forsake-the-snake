package com.example.dobi.test1;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

public class GameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameSystem gameSystem = new GameSystem();

        setContentView(new CanvasView(this));
    }

    class CanvasView extends View{
        public CanvasView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            GameSystem.Render(canvas);

        }

    }

    private class Snake implements Renderable{

        private String user;


        @Override
        public void Render() {


        }
    }

}
