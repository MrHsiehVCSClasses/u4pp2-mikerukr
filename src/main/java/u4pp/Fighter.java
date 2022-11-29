package u4pp;
public class Fighter extends Combatant{
    //private String name;
  //  private int maxHealth;
  //  private int attack;
  private boolean blook = false;
    private int level = 1;
    private int xp = 0;
    private int focus = 0;
    private boolean blocking=false;
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
        return blocking;
    }
    public void attack(Combatant target){
        if(blook == true){
            target.takeDamage((getAttackPower()*(focus*2))/2);
            blook=false;
        }else{
    target.takeDamage(getAttackPower()*(focus*2));
    }}
    public void block(){
    blook = true;
    }
    public void focus(){
        focus++;
    }
    public void gainEXP(int exp){
        xp += exp;
        if(xp >= level){
            xp -= level;
            level++;
           this.setMaxHealth(this.getMaxHealth()+5);
           this.setAttackPower(this.getAttackPower()+1);
           this.setHealth(this.getMaxHealth());
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
        return "Stats: " + name + "\n Health: " + health + "\n Max Health: " + maxHealth + "\n Attack Power: " + attack;
    }
}
