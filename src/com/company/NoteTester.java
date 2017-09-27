package com.company; //the package used for this program

public class NoteTester { //our main class

    public static void main(String[] args) { //using this to print to console
        System.out.println("The following information is showcasing that certain methods work properly:");
        Note Default = new Note(); //creating a new note that we will purposely keep as the default note "A4"
        System.out.println("getName(): " +Default.getName()); //printing name of note "A4"
        System.out.println("getLength(): " +Default.getLength()); //printing length of note "quarter"
        System.out.println("getFreq(): " +Default.getFreq()); //printing frequency of note "440.0 Hz"
        System.out.println("getRange(): " +Default.getRange()); //printing integer value "0"
        System.out.println("isNaturalOrSharp(): " +Default.isNaturalOrSharp()); //printing whether it is natural or sharp "natural"
        try{Thread.sleep(6000);} //wait just a bit so the user can read
        catch(InterruptedException e)
        {System.out.println(e);
        }
        System.out.println("\nThe following is just an example of specific notes for you to hear. Shows program is working properly.");
        try{Thread.sleep(4000);} //wait just a bit until we show the specific notes
        catch(InterruptedException e)
        {System.out.println(e);
        }
        System.out.println(Default.allInfo()); //printing all relevant information in a formatted string
        try { //playing the note for us to hear
            PlayNote.playFreq(Default);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) { //if the specific note we are asking to hear doesn't exist, an exception is thrown
            System.out.println(exception);
            System.exit(1);
        }

    Note second = new Note(); //instantiating a second note
        second.setLength("sixteenth"); //changing its length from "quarter" to "sixteenth" (this changes its length)
        System.out.println(second.allInfo());
        try { //playing the note for us to hear (same sound as "Default" but less time played)
            PlayNote.playFreq(second);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) { //if the specific note we are asking to hear doesn't exist, an exception is thrown
            System.out.println(exception);
            System.exit(1);
        }

    Note third = new Note(); //instantiating a third note
        third.setRange(-37); //setting the integer value to "-37", effectively changing the note this is (this changes the name, frequency, range, and can change if it is natural or sharp)
        System.out.println(third.allInfo());
        try { //playing the note for us to hear (different note from "Default" but same length played)
            PlayNote.playFreq(third);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) { //if the specific note we are asking to hear doesn't exist, an exception is thrown
            System.out.println(exception);
            System.exit(1);
        }

    Note fourth = new Note(); //instantiating a fourth note
        fourth.setLength("whole"); //changing its length from "quarter" to "whole" (this changes its length)
        fourth.setRange(15); //setting the integer value to "15", effectively changing the note this is (this changes the name, frequency, range, and can change if it is natural or sharp)
        System.out.println(fourth.allInfo()); //printing all relevant information in a formatted string
        try { //playing the note for us to hear (different note from "Default" and different length played)
            PlayNote.playFreq(fourth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) { //if the specific note we are asking to hear doesn't exist, an exception is thrown
            System.out.println(exception);
            System.exit(1);
        }

    Note fifth = new Note(); //instantiating a fifth note
        fifth.setLength("eigth");//changing its length from "quarter" to "eigth" (this changes its length)
        fifth.setRange(-48);//setting the integer value to "-48", effectively changing the note this is (this changes the name, frequency, range, and can change if it is natural or sharp)
        System.out.println(fifth.allInfo()); //printing all relevant information in a formatted string
        try {//playing the note for us to hear (different note from "Default" and different length played)
            PlayNote.playFreq(fifth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) { //if the specific note we are asking to hear doesn't exist, an exception is thrown
            System.out.println(exception);
            System.exit(1);
        }

        //FROM HERE ON I AM NOT GOING TO COMMENT THE CODE BECAUSE I PRETTY MUCH ALREADY EXPLAINED WHAT IS GOING ON

        Note sixth = new Note();
        sixth.setLength("sixteenth");
        sixth.setRange(39);
        System.out.println(sixth.allInfo());
        try {
            PlayNote.playFreq(sixth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) {
            System.out.println(exception);
            System.exit(1);
        }
        Note seventh = new Note();
        seventh.setLength("half");
        seventh.setRange(39);
        System.out.println(seventh.allInfo());
        try {
            PlayNote.playFreq(seventh);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) {
            System.out.println(exception);
            System.exit(1);
        }
        Note eigth = new Note();
        eigth.setLength("sixteenth");
        eigth.setRange(10);
        System.out.println(eigth.allInfo());
        try {
            PlayNote.playFreq(eigth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) {
            System.out.println(exception);
            System.exit(1);
        }
        Note ninth = new Note();
        ninth.setLength("half");
        ninth.setRange(-20);
        System.out.println(ninth.allInfo());
        try {
            PlayNote.playFreq(ninth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) {
            System.out.println(exception);
            System.exit(1);
        }
        Note tenth = new Note();
        tenth.setLength("quarter");
        tenth.setRange(3);
        System.out.println(tenth.allInfo());
        try {
            PlayNote.playFreq(tenth);
        }
        catch (javax.sound.midi.MidiUnavailableException exception) {
            System.out.println(exception);
            System.exit(1);
        }
        System.out.println("\nThat is all! I'll probably make a working GUI for this at some point.");
    }


}
