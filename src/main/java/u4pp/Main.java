package u4pp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        MonsterFighter play = new MonsterFighter();
        Scanner myScanner = new Scanner(System.in);
        play.play(myScanner);
    }
}