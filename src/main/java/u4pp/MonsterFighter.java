package u4pp;
import java.util.Scanner;
public class MonsterFighter {
    
    public MonsterFighter(){
        Monster monster = new Monster("UR MOM", 10, 20, 5);
        DefenseMonster defense = new DefenseMonster("THE ROCK", 20, 10, 10, 3);
        RandomMonster random = new RandomMonster("Passing Stranger", (int)Math.floor(Math.random()*100) , (int)Math.floor(Math.random()*20) , (int)Math.floor(Math.random()*100) );
    }
    public void play(Scanner scanner){
        System.out.println("Welcome to Dungeon Fighter! Create your own character!");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Fighter fighter = new Fighter(name, 100, 1);
        System.out.println("Congrats! Your character has been created. These are its stats: " + fighter.toString());
        //InputHelper.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3);
    }
}
