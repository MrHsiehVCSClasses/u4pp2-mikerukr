package u4pp;

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter( "Fighter", 100, 3);
        Fighter target = new Fighter("target", 1000000, 1);
        System.out.println(target.toString());
        System.out.println(fighter.toString());

target.setMaxHealth(10000000);

target.block();

System.out.println(fighter.toString());
fighter.attack(target);
System.out.println(target.toString());
    }
}