package u4pp;

public class Combatant {
private String name = "";
private int maxHealth = 0;
private int attack = 0;
private int health = 0;
    public Combatant(String name, int maxHealth, int attack){
    name = "";
    maxHealth = 0;
    attack = 0;
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
        if(health < 0 || health > maxHealth){
            System.out.println("Choose an integer below the max health and above 0.");
        }else{
            this.health = health;
        }
    }
    public void setMaxHealth(int health){
        if(health<=0){
            System.out.println("Choose an integer above 0.");
        }else{
            maxHealth = health;
        }
    }
    public void setAttackPower(int attackPower){
        if(attackPower<0){
            System.out.println("Choose an integer above -1.");
        }else{
            attack = attackPower;
        }
    }
    public void takeDamage(int damage){
        if(damage<=0){
            setHealth(health);
        }else{
            setHealth(health-damage);
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
        System.out.println("Stats:\n" + "Health =" + health +);
    }
}
