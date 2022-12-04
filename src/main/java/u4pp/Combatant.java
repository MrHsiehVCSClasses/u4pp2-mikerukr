package u4pp;

public class Combatant {
private String name = "";
private int maxHealth = 0;
private int attack = 0;
private int health = 0;

public Combatant(String name, int maxHealth, int attack){
    this.name = name;
    this.maxHealth = maxHealth;
    this.attack = attack;
    this.health = maxHealth;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getAttackPower(){
        return attack;
    }
    public void setHealth(int health){
        if(health < 0){
            this.health = 0;
        }
        if(health>maxHealth){
            this.health = maxHealth;
        }
        if(health>=0 && health < maxHealth){
            this.health=health;
        }
    }
    public void setMaxHealth(int health){
        if(health < 0 || health == 0){
            this.maxHealth = 1;
        }
        else if(health<maxHealth){
            this.maxHealth=health;
            this.health = health;//maxHealth;
        }else{
            this.maxHealth=health;
        }

    }
    public void setAttackPower(int attackPower){
        if(attackPower<0){
            attack = 0;
        }else{
            attack = attackPower;
        }
    }
    public void takeDamage(int damage){
        if(damage<=0){
            setHealth(health);
        }else{
            setHealth(getHealth()-damage);
        }
    }
    public boolean canFight(){
        boolean state = true;
        if (health>0){
            return state;
        }else{
            state = false;
            return state;
        }
    }
    public String toString(){
        return "Stats: " + name + "\n Health: " + health + "\n Max Health: " + maxHealth + "\n Attack Power: " + attack;
    }
}
