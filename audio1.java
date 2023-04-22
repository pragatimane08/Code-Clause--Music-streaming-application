import java.util.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
public class audio1 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);
        File file1 = new File("ad1.wav");
        File file2 = new File("ad1.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file1);
        Clip clip = AudioSystem.getClip(null);
        clip.open(audiostream);

        String responce = "";
       
        while(!responce.equals("Q")){
            System.out.println("P = Play, s = Start,R = Reset ,Q = Quit");
            System.out.println("Enter your choice:");

            responce = sc.next();
            responce = responce.toUpperCase();

            switch(responce){
                case("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("R"):clip.setMicrosecondPosition(0);
                break;
                case("Q"):clip.close();
                break;
                default:System.out.println("Not a valid Responce !");
            }
        }
        System.out.println("Byeee !!");
    }
}
