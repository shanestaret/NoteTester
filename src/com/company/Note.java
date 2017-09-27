package com.company; //the package used for this program

import java.math.BigDecimal;
import java.math.RoundingMode; //all useful imports
import java.util.HashMap;

/**
 * Created by Shane on 9/22/2017.
 */
public class Note {
    String name = "";
    String length = ""; //declaring all relevant variables
    BigDecimal freq;
    double range;
    HashMap<Integer, String> allNotes = new HashMap<Integer, String>() {{
        put(-48,"A0"); //linking the integer value to the name of the note
        put(-47,"A0#");
        put(-46,"B0");
        put(-45,"C1");
        put(-44,"C1#");
        put(-43,"D1");
        put(-42,"D1#");
        put(-41,"E1");
        put(-40,"F1");
        put(-39,"F1#");
        put(-38,"G1");
        put(-37,"G1#");
        put(-36,"A1");
        put(-35,"A1#");
        put(-34,"B1");
        put(-33,"C2");
        put(-32,"C2#");
        put(-31,"D2");
        put(-30,"D2#");
        put(-29,"E2");
        put(-28,"F2");
        put(-27,"F2#");
        put(-26,"G2");
        put(-25,"G2#");
        put(-24,"A2");
        put(-23,"A2#");
        put(-22,"B2");
        put(-21,"C3");
        put(-20,"C3#");
        put(-19,"D3");
        put(-18,"D3#");
        put(-17,"E3");
        put(-16,"F3");
        put(-15,"F3#");
        put(-14,"G3");
        put(-13,"G3#");
        put(-12,"A3");
        put(-11,"A3#");
        put(-10,"B3");
        put(-9,"C4");
        put(-8,"C4#");
        put(-7,"D4");
        put(-6,"D4#");
        put(-5,"E4");
        put(-4,"F4");
        put(-3,"F4#");
        put(-2,"G4");
        put(-1,"G4#");
        put(0,"A4");
        put(1,"A4#");
        put(2,"B4");
        put(3,"C5");
        put(4,"C5#");
        put(5,"D5");
        put(6,"D5#");
        put(7,"E5");
        put(8,"F5");
        put(9,"F5#");
        put(10,"G5");
        put(11,"G5#");
        put(12,"A5");
        put(13,"A5#");
        put(14,"B5");
        put(15,"C6");
        put(16,"C6#");
        put(17,"D6");
        put(18,"D6#");
        put(19,"E6");
        put(20,"F6");
        put(21,"F6#");
        put(22,"G6");
        put(23,"G6#");
        put(24,"A6");
        put(25,"A6#");
        put(26,"B6");
        put(27,"C7");
        put(28,"C7#");
        put(29,"D7");
        put(30,"D7#");
        put(31,"E7");
        put(32,"F7");
        put(33,"F7#");
        put(34,"G7");
        put(35,"G7#");
        put(36,"A7");
        put(37,"A7#");
        put(38,"B7");
        put(39,"C8");
    }
    };

    public Note() { /** @param none */
        range = 0; //setting the variables in this class equal to the default "A4" note
        length = "quarter";
    }
    public String getName() { /** @param none */
        name = allNotes.get((int)range); //grabbing the name of the note associated with the integer value that was given by the user
        return "\033[1m" + name + "\033[0m"; /** @return the name of the note in bold*/
    }
    public String getLength() { /** @param none */
        return "\033[1m" + length + "\033[0m"; /** @return the length of the note in bold*/
    }
    public void setLength(String l) { /** @param none */ //sets the length to a new specified length
        length = l;
        if(!(length.equals("sixteenth")||length.equals("eigth")||length.equals("quarter")||length.equals("half")||length.equals("whole"))) {
            System.out.println("The length '" + length + "' is not a proper note length.");
            System.out.println("Please fix this.");
            System.exit(1);
        }
    }
    public String getRange() { /** @param none */
        return "\033[1m" + (int)range + "\033[0m";/** @return the integer value of the note in bold*/
    }
    public void setRange(double r) { /** @param none */ //sets the integer value to a new specified value, changing the note played
        range = r;
        if(range > 39 || range < -48) {
            System.out.println("\nThe integer value of " + (int)range + " is not linked to a note. You must set an appropriate integer value (-48 to 39).");
            System.out.println("Please fix this issue.");
            System.exit(1);
        }
    }
    public String getFreq() { /** @param none */
        freq = new BigDecimal(440 * Math.pow(2, (range/12))); //making a big decimal object to represent frequency
        freq = freq.setScale(2, RoundingMode.HALF_UP); //set it so the double can only have two decimal places
        return "\033[1m" + freq.doubleValue() + " Hz" + "\033[0m";/**@return the frequency of the given note in bold to two decimal places*/
    }
    public String isNaturalOrSharp() { /** @param none */
        name = allNotes.get((int)range); //grabbing the name of the note associated with the integer value that was given by the user
        if(name.substring(name.length()- 1, name.length()).equals("#")) //if the very last character is "#", then it is sharp. Otherwise, it is a natural note.
            return "\033[1msharp\033[0m"; /**@return whether the note is sharp or natural in bold */
        else
            return "\033[1mnatural\033[0m";
    }
    public int howManySecs() { /** @param none */
        if(length.equals("sixteenth"))
            return 250;
        else if(length.equals("eigth"))
            return 500;
        else if(length.equals("quarter"))
            return 1000;
        else if(length.equals("half"))
            return 2000;
        else if(length.equals("whole"))
            return 4000;
        else return 0; /**@return how long the note should play in milliseconds based off of its length*/
    }
    public String allInfo() { /** @param none */
        String everything = "\n----------------------------------\nThe name of this note is " + getName() + ", it is " + isNaturalOrSharp() + ", and this is a " + getLength() + " note.\n" + "The integer value of this note is " + getRange() + " and the frequency of the note is " + getFreq() + "."; //all revelant info
        return everything;/**@return all of the information formatted nicely */
    }

}
