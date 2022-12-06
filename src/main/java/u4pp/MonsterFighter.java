package u4pp;
import java.util.Scanner;
//create monsters
    public class MonsterFighter {
    Monster [] monsters = new Monster [3];
    public MonsterFighter(){
        monsters[0]= new Monster("UR MOM", 10, 20, 5);
        monsters[1]= new DefenseMonster("THE ROCK", 20, 10, 10, 3);
        monsters[2]= new RandomMonster("Passing Stranger", (int)Math.floor(Math.random()*100) , (int)Math.floor(Math.random()*20) , (int)Math.floor(Math.random()*100));
    }
    //play function for game, mr. Hsieh I am very sick and worked on this all night. I hope the effort gives me some credit because I even had to go back to InputHelper to fix it and I had so many iterations of this game.
    public void play(Scanner scanner){
        InputHelper help = new InputHelper(scanner);
        System.out.println("Welcome to Dungeon Fighter! Create your own character!");
        System.out.println("Please type your fighter's name to get started!");
        String name = scanner.nextLine();
        Fighter fighter = new Fighter(name, 100, 1);
        System.out.println("Congrats! Your character has been created. These are its stats: " + fighter.toString());
        System.out.println("Entering dungeon..... \n . \n . \n .");
        for (int i = 0; i < monsters.length; i++){
            System.out.println("Huzzah! You have encountered the " + monsters[i].getName() + " here are its stats!" + monsters[i].toString());
            if(help.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3) == 1){
                System.out.println("Attacking");
                fighter.attack(monsters[i]);
                //monsters[i].toString();
            }else if(help.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3) == 2){
                System.out.println("Focusing");
                fighter.focus();
                //fighter.toString();
            }else{
                System.out.println("Blocking next attack");
                fighter.block();
                //fighter.toString();
            }
            System.out.println(name + " stats: " + fighter.toString());
            System.out.println("monster stats: " + monsters[i].toString());
            System.out.println("Their turn, press enter to continue!");
            scanner.nextLine();
            System.out.println(monsters[i].getName() + " is taking their turn.");
            monsters[i].takeTurn(fighter);
            fighter.toString();
            System.out.println("Now it's your turn, press enter to continue!");
            scanner.nextLine();
            if(monsters[i].getHealth() == 0){
                System.out.println("Congrats! You killed it!");
                fighter.gainEXP(monsters[i].getExpGiven());
                System.out.println("Nice your stats have been buffed! ");
                System.out.println(fighter.toString());
            }else{
                if(help.getIntegerInput("Type 1 to Attack, 2 to Focus, and 3 to Block", 1, 3) == 1){
                    System.out.println("Attacking");
                    fighter.attack(monsters[i]);
                    monsters[i].toString();
                }else{
                    System.out.println("Monster's turn.");
                    monsters[i].takeTurn(fighter);
                    fighter.toString();
                }if(monsters[i].getHealth()==0){
                    System.out.println("You killed this motherfalafel!");
                    fighter.gainEXP(monsters[i].getExpGiven());
                    System.out.println(fighter.getName() + " has gained new stats! " + fighter.toString());
                }
            }
            if(fighter.getHealth() > 0){
                continue;
            }else if(i == 2 && fighter.getHealth()>0){
                System.out.println("Nice, I could've done better but you beat them " + fighter.getName() + " so good job... I guess..");
            }else{
                System.out.println("Bruh you died. GGs go next LMEOW.");
                break;
            }

        }
    }
}
