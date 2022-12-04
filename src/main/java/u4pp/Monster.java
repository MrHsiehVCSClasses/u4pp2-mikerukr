package u4pp;

public class Monster extends Fighter {
    private int exp = 0;
    public Monster(String name, int health, int attack, int exp){
super(name, health, attack);
this.exp = exp;
    }
public int getExpGiven(){
    if(exp<0){
        return 0;
    }else{
        return exp;
    }
}
public void takeTurn(Combatant target){
    attack(target);
}
public String toString(){
    return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven();
}
}
