package org.example;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> characters = new HashMap<>();


        for(char x : quote.toCharArray()) {
            if(characters.containsKey(x)) {
                characters.put(x, characters.get(x) + 1);
            } else {
                characters.put(x, 1);

            }

        }
        for (char key : characters.keySet()) {
            System.out.println(key + ": " + characters.get(key));
        }

    }
}

