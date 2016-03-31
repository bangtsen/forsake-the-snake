package com.example.dobi.test1;

import android.graphics.Canvas;

/**
 * Created by dobi on 3/6/16.
 */
public interface Renderable {

    public Renderable(Canvas canvas);

    public void Render();
    protected Canvas canvas;
    
}

public class Map implements Renderable{

    private
}

public class SnakeTile implements Renderable{

    protected short direction;
    protected short[]

    public void SetDirection(short dir){
        direction = dir;
    }
    @Override
    public void Render() {

    }
}

public class SnakeHead extends SnakeTile{

}