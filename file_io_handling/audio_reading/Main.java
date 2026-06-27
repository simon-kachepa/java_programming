package audio_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * Program to read audio from a file (To play audio)
 */
public class Main {
    
    public static void main(String[] args){
        
        String filePath = "/Users/rutendogono/Desktop/jah_prayzah.wav";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            Scanner scanner = new Scanner(System.in)){
                clip.open(audioStream);

                clip.start();
                scanner.next(); // To keep the clip open until a user enters an input to continue with the program
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Could not locate file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Error: Audio format not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Error: Audio file unavailable");
        }
        catch(IOException e){
            System.out.println("Error: Could not read from file");
        }
    }
}