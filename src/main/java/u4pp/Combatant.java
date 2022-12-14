package u4pp;
// instance variables for combatant
public class Combatant {
private String name = "";
private int maxHealth = 0;
private int attack = 0;
private int health = 0;
//creates combatant with stats in parameter
public Combatant(String name, int maxHealth, int attack){
    this.name = name;
    this.maxHealth = maxHealth;
    this.attack = attack;
    this.health = maxHealth;
    }
    //returns name given 
    public String getName(){
        return name;
    }
    //returns health
    public int getHealth(){
        return health;
    }
    //returns max health
    public int getMaxHealth(){
        return maxHealth;
    }
    //returns attack power
    public int getAttackPower(){
        return attack;
    }
    //sets health
    public void setHealth(int health){
        if(health<=0){
            this.health=0;
        }
        else if(health >= maxHealth){
            this.health = maxHealth;
        }
        else{
            this.health = health;
        }
    }
    //sets max health
    public void setMaxHealth(int health){
        if(health >= maxHealth){
            this.health=maxHealth;
            maxHealth=health;
        }else{
            maxHealth=health;
            this.health=maxHealth;
        }
        if(health<=0){
            maxHealth=1;
            health=1;
        }
    }
    //sets attack power
    public void setAttackPower(int attackPower){
        if(attackPower<0){
            attack = 0;
        }else{
            attack = attackPower;
        }
    }
    //method to reduce health by amount of damage
    public void takeDamage(int damage){
        if(damage<=0){
            setHealth(health);
        }else{
            setHealth(getHealth()-damage);
        }
    }
    //returns whether they can fight based on if hp is not 0
    public boolean canFight(){
        boolean state = true;
        if (health>0){
            return state;
        }else{
            state = false;
            return state;
        }
    }
    //returns stats of combatant
    public String toString(){
        return "Stats: " + name + "\n Health: " + health + "\n Max Health: " + maxHealth + "\n Attack Power: " + attack;
    }
}
