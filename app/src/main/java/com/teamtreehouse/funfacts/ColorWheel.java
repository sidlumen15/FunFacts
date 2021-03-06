package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    //Fields (Member Variables) - Properties anout the object
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#8b4513",  // bronze
            "#ddca8b"  // gold colors
    };

    //Methods - Actions the object can take
    public int getColor(){
        // The button was clicked, so update the fact TextView with a new fact
        String color;
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        //Two way on conversion int to string
        //fact = randomNumber + ""; //recomended by treehouse
        //fact = Integer.toString(randomNumber);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
