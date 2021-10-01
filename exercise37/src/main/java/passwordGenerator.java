/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.ArrayList;
import java.util.List;

public class passwordGenerator {
    private final List<Character> NUMBERS, LETTERS, SPECIALS;

    passwordGenerator(){
        NUMBERS = setNumbers();
        LETTERS = setLetters();
        SPECIALS = setSpecials();
    }

    //Create array of possible numbers
    private static List<Character> setNumbers () {
        List<Character> list = new ArrayList<>();
        for (int x = '0'; x <= '9'; x++)
            list.add((char) (x));
        return list;
    }

    //Create array of possible letters
    private static List<Character> setLetters () {
        List<Character> list = new ArrayList<>();
        for (int x = 'a'; x <= 'z'; x++)
            list.add((char) (x));
        return list;
    }

    //Create array of possible specials
    private static List<Character> setSpecials () {
        List<Character> list = new ArrayList<>();
        for (int x = '#'; x <= '&'; x++)
            list.add((char) (x));
        list.add('@');
        list.add('!');
        return list;
    }

    //Generate password
    public List<Character> getPassword(int numCount, int specialCount, int minLength){
        List<Character> password = new ArrayList<>();
        int letterCount = specialCount + numCount;

        do {
            int type = (int) (Math.random() * 3) + 1;
            switch (type) {
                case 1: {
                    if (password.size() < minLength || letterCount > 0) {
                        password.add(getRandom(LETTERS));
                        letterCount--;
                        break;
                    }
                }
                case 2: {
                    if (numCount > 0) {
                        password.add(getRandom(NUMBERS));
                        numCount--;
                        break;
                    }
                }
                case 3: {
                    if (specialCount > 0) {
                        password.add(getRandom(SPECIALS));
                        specialCount--;
                        break;
                    }
                }
                default: {
                    break;
                }
            }
        } while (specialCount > 0 || letterCount > 0 || numCount > 0 || password.size() < minLength);

        return password;
    }

    //Get random number from one of the list of possibilities
    private static Character getRandom(List<Character> list) {
        int random = (int) (Math.random() * list.size());
        return list.get(random);
    }


}
