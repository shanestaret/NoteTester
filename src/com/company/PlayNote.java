package com.company; //the package used for this program
import javax.sound.midi.*; //import this to play the notes

/**
 * Created by Shane on 9/23/2017.
 */
public class PlayNote {
    public static void playFreq(Note note) throws javax.sound.midi.MidiUnavailableException { /** @throws MidiUnavailableException so that the program still works if we request a Midi Sound that does not exist **/
    Synthesizer synth = MidiSystem.getSynthesizer(); //creation of synthesizer to make noise
        synth.open(); //opens the synthesizer so we can use it

    MidiChannel[] midiChannel = synth.getChannels(); //finds the available Midi channels
        Instrument[] instruments = synth.getDefaultSoundbank().getInstruments(); //loads an available instrument to play sound
        synth.loadInstrument(instruments[0]); //true when an instrument is loaded, false when there isn't
        try{Thread.sleep(1000);} //wait just a bit
        catch(InterruptedException e)
        {System.out.println(e);
        }
        System.out.println("\nPlaying this note once at 60 BPM");
        midiChannel[0].noteOn(((int)note.range) + 57, 75); //starts playing the note
        try{Thread.sleep(note.howManySecs());} //how long to play the note
        catch(InterruptedException e)
        {System.out.println(e);
        }
        midiChannel[0].noteOff(((int)note.range) + 57, 75); //stops playing the note
        System.out.println("Finished Playing"); //indicates when the note stops playing on console

        try{Thread.sleep(6000);} //how long to wait to play the next note (long so you can read what is output)
        catch(InterruptedException e)
        {System.out.println(e);
        }
    }
}
