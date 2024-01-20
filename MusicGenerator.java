//Import MIDI and Sound 
import java.util.*;
import javax.sound.midi.*;

public class MusicGenerator {
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException {
        // Open MIDI Sequencer
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();


    }
}