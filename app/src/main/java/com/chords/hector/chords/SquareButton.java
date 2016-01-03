package com.chords.hector.chords;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class SquareButton extends Button {


    public SquareButton(Context context) {
        super(context);
    }

    public SquareButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setButtonHeight(attrs);
    }

    public SquareButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setButtonHeight(attrs);
    }

    private void setButtonHeight(AttributeSet attrs) {
        //TypedArray a = getContext().obtainStyledAttributes(attrs,R.styleable.NoteButton);
        //int h1 = a.getString(R.styleable.NoteButton_height);
        //setHeight(h1);
        setBackgroundColor(Color.BLUE);
        //Log.d("btheight", getHeight());
        //a.recycle();
    }

}