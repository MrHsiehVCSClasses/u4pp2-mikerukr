package u4pp;
//creates instance variables
public class DefenseMonster extends Monster{
    private int defense;
    //constructor for defense monster
    public DefenseMonster(String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
this.defense = defense;
    }
    //returns amount of defense monster has
    public int getDefense(){
        return defense;
    }
    //method to take damage, if dmg lower than defense wont take any
    public void takeDamage(int damage){
        if(damage<defense || damage == defense){
            setHealth(getHealth());
            System.out.println("The monster's defense was too strong and negated your damage!");
        }else{
            setHealth(getHealth()-(damage-defense));
        }
    }
    //returns stats of defense monster
    public String toString(){
     return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven()+ "\n Defense level: " + getDefense();
    }
}
