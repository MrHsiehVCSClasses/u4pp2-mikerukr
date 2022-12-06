package u4pp;
//creates constructor for random monster
public class RandomMonster extends Monster {
    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
    //takes turn to attack, only 50 percent chance attack lands though. other 50 only prints that he missed
    public void takeTurn(Combatant target){
        if(Math.round(Math.random())< 0.5){
            attack(target);
            System.out.println("The monster got lucky and hit you!");
        }else{
            System.out.println("The monster got unlucky and missed...");;
        }
    }
    //returns stats of randommonster
    public String toString(){
        return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven() + "Only has 50% chance of attacking.";
    }
}
