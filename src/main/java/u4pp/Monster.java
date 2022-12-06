package u4pp;
//creates instance variables for monster
public class Monster extends Fighter {
    private int exp = 0;
    //creates constructor for monster with inherited variables
    public Monster(String name, int health, int attack, int exp){
        super(name, health, attack);
        this.exp = exp;
    }
    //returns amount of xp monster has
    public int getExpGiven(){
        if(exp<0){
            return 0;
        }else{
            return exp;
    }
}
    //monsters turn to attack and attacks
    public void takeTurn(Combatant target){
        attack(target);
}
    //returns stats of monster
    public String toString(){
        return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven();
}
}
