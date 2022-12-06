package u4pp;
import java.util.Scanner;
//create monsters
public class MonsterFighter {
    Monster monster = new Monster("UR MOM", 10, 20, 5);
        DefenseMonster defense = new DefenseMonster("THE ROCK", 20, 10, 10, 3);
        RandomMonster random = new RandomMonster("Passing Stranger", (int)Math.floor(Math.random()*100) , (int)Math.floor(Math.random()*20) , (int)Math.floor(Math.random()*100) );

    public MonsterFighter(){

    }
    //play function for game
    public void play(Scanner scanner){
      //  Monster monster = new Monster("UR MOM", 10, 20, 5);
      //  DefenseMonster defense = new DefenseMonster("THE ROCK", 20, 10, 10, 3);
      //  RandomMonster random = new RandomMonster("Passing Stranger", (int)Math.floor(Math.random()*100) , (int)Math.floor(Math.random()*20) , (int)Math.floor(Math.random()*100) );
        System.out.println("Welcome to Dungeon Fighter! Create your own character!");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Fighter fighter = new Fighter(name, 100, 1);
        System.out.println("Congrats! Your character has been created. These are its stats: " + fighter.toString());
        System.out.println("Entering dungeon..... \n . \n . \n .");
        System.out.println("You've encountered your first monster! This is a normal monster. Stats: " + monster.toString());
        System.out.println("What would you like to do?");
        if(InputHelper.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3)==1 ){
            System.out.println("Attacking");
            fighter.attack(monster);
            System.out.println(name + " stats: " + fighter.toString());
            System.out.println("monster stats: " + monster.toString());
            if(!(fighter.canFight())){
                System.out.println("You died.");
            }else if(!(monster.canFight())){
                System.out.println("You killed the monster! You gained " + monster.getExpGiven() + " exp.");
                fighter.gainEXP(monster.getExpGiven());
                System.out.println(name + " stats: " + fighter.toString());
            }else{
                monster.attack(fighter);
                System.out.println("The monster took his turn and hit you!");
                System.out.println(name + " stats: " + fighter.toString());
                System.out.println("monster stats: " + monster.toString());
            }
            
        }else if(InputHelper.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3) == 2 ){
            System.out.println("Focusing");
            fighter.focus();
            System.out.println(name + " stats: " + fighter.toString());
            if(fighter.getHealth()<=0){
                System.out.println("You died.");
            }else if(monster.getHealth()<=0){
                System.out.println("You killed the monster! You gained " + monster.getExpGiven() + " exp.");
                fighter.gainEXP(monster.getExpGiven());
                System.out.println(name + " stats: " + fighter.toString());
            }else{
                monster.attack(fighter);
                System.out.println("The monster took his turn and hit you!");
                System.out.println(name + " stats: " + fighter.toString());
                System.out.println("monster stats: " + monster.toString());
            }
        }else{
            System.out.println("Blocking next attack");
            fighter.block();
            System.out.println(name + " stats: " + fighter.toString());
            if(fighter.getHealth()<=0){
                System.out.println("You died.");
            }else if(monster.getHealth()<=0){
                System.out.println("You killed the monster! You gained " + monster.getExpGiven() + " exp.");
                fighter.gainEXP(monster.getExpGiven());
                System.out.println(name + " stats: " + fighter.toString());
            }else{
                monster.attack(fighter);
                System.out.println("The monster took his turn and hit you!");
                System.out.println(name + " stats: " + fighter.toString());
                System.out.println("monster stats: " + monster.toString());
            }
        }
        //InputHelper.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3);
    }
}
