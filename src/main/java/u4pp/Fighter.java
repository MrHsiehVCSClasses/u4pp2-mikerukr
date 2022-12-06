package u4pp;
//creates instance variables for fighter
public class Fighter extends Combatant{
    private boolean blook = false;
    private int level = 1;
    private int xp = 0;
    private int focus = 0;
    //constructer for fighter inheriting variables from combatant
    public Fighter(String name, int maxHealth, int attack){
        super(name, maxHealth, attack);
    }
    //returns amount of xp fighter has
    public int getEXP(){
        return xp;
    }
    //returns amount of focus stacks it has
    public int getFocusStacks(){
        return focus;
    }
    //returns level of fighter
    public int getLevel(){
        return level;
    }
    //returns whether fighter is blocking or not
    public boolean getIsBlocking(){
        return blook;
    }
    //method to attack a target, dmg exponentially increased by focus stacks
    public void attack(Combatant target){
    target.takeDamage(getAttackPower()*((int)Math.pow(2, focus)));
    focus=0;
    }
    //method to block next attack
    public void block(){
    blook = true;
    }
    //method to add focus stack in their turn
    public void focus(){
        focus = focus + 1;
    }
    //method to add XP to fighter
    public void gainEXP(int exp){
        xp = xp + exp;
        while(xp >= level){
            xp = xp - level;
            level++;
           this.setMaxHealth(this.getMaxHealth()+5);
           this.setAttackPower(this.getAttackPower()+1);
           this.setHealth(getHealth()+getMaxHealth());
        }
    //method to take damage
    }
    public void takeDamage(int damage){
        if(blook== true){
            this.setHealth(this.getHealth()-((int)Math.floor(damage/2)));
            blook = false;
        }else{
            this.setHealth(this.getHealth()-damage);
        }
    }
    //returns stats of fighter
    public String toString(){
        return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n Level: " + getLevel() + "\n EXP: " + getEXP() + "\n IsBlocking: " + getIsBlocking() + "\n Focus stacks: " + getFocusStacks();
    }
}
