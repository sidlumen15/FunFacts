package com.teamtreehouse.funfacts;

import java.util.Random;

public class FactBook {
    //Fields (Member Variables) - Properties anout the object
    private String[] mFacts = new String[]{
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree"
    };

    //Methods - Actions the object can take
    public String getFact(){
        // The button was clicked, so update the fact TextView with a new fact
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        //Two way on conversion int to string
        //fact = randomNumber + ""; //recomended by treehouse
        //fact = Integer.toString(randomNumber);
        fact = mFacts[randomNumber];
        return fact;
    }
}
