package u4pp;

public class DefenseMonster extends Monster{
    private int defense;
    public DefenseMonster(String name, int health, int attack, int exp, int defense){
        super(name, health, attack, exp);
this.defense = defense;
    }
    public int getDefense(){
        return defense;
    }
    public void takeDamage(int damage){
        if(damage<defense || damage == defense){
            setHealth(getHealth());
        }else{
            setHealth(getHealth()-(damage-defense));
        }
    }
    public String toString(){
     return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n EXP: " + getExpGiven()+ "\n Defense level: " + getDefense();
    }
}
