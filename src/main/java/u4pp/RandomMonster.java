package u4pp;

public class RandomMonster extends Monster {
    public RandomMonster(String name, int health, int attack, int exp){
        super(name, health, attack, exp);
    }
    public void takeTurn(Combatant target){
        if(Math.round(Math.random())< 0.5){
            attack(target);
        }else{
            return ;
        }
    }
    public String toString(){
        return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven() + "Only has 50% chance of attacking.";
    }
}
