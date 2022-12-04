package u4pp;
public class Fighter extends Combatant{
    //private String name;
  //  private int maxHealth;
  //  private int attack;
  private boolean blook = false;
    private int level = 1;
    private int xp = 0;
    private int focus = 0;
    public Fighter(String name, int maxHealth, int attack){
super(name, maxHealth, attack);
    }
    public int getEXP(){
        return xp;
    }
    public int getFocusStacks(){
return focus;
    }
    public int getLevel(){
        return level;
    }
    public boolean getIsBlocking(){
        return blook;
    }
    public void attack(Combatant target){
        if(blook == true){
            target.takeDamage((int)Math.floor(getAttackPower()*((int)Math.pow(2, focus))));
            blook=false;
            focus = 0;
        }else{
    target.takeDamage(getAttackPower()*((int)Math.pow(2, focus)));
    focus=0;
    }}
    public void block(){
    blook = true;
    }
    public void focus(){
        focus = focus + 1;
    }
    public void gainEXP(int exp){
        xp = xp + exp;
        while(xp >= level){
            xp = xp - level;
            level++;
           this.setMaxHealth(this.getMaxHealth()+5);
           this.setAttackPower(this.getAttackPower()+1);
           this.setHealth(getHealth()+getMaxHealth());
        }
        
    }
    public void takeDamage(int damage){
        if(blook== true){
            this.setHealth(this.getHealth()-(damage/2));
            blook = false;
        }else{
            this.setHealth(this.getHealth()-damage);
        }
    }
    public String toString(){
        return "Stats: " + getName() + "\n Health: " + getHealth() + "\n Max Health: " + getMaxHealth() + "\n Attack Power: " + getAttackPower() + "\n Level: " + getLevel() + "\n EXP: " + getEXP() + "\n IsBlocking: " + getIsBlocking() + "\n Focus stacks: " + getFocusStacks();
    }
}
