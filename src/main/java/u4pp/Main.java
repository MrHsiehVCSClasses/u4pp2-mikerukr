package u4pp;
public class Main {
    public static void main(String[] args) {
Fighter attack = new Fighter("attack", 10, 3);
Fighter dum = new Fighter("dum", 10000, 0);

       // for(int i = 0; i < 10; i++) {
       //     dum.setHealth(dum.getMaxHealth());
       //     for(int j = 0; j < i; j++) {
       //         // focus for i times
       //         attack.focus();
       //     }
       attack.focus();
        int    i = 1;
            attack.attack(dum);
            int expectedDamage = attack.getAttackPower() * (int)Math.pow(2, i);
            int actualDamage = dum.getMaxHealth() - dum.getHealth();
            System.out.println(expectedDamage);
            System.out.println(actualDamage);
       // }
       // System.out.println(test.getAttackPower()*((int)Math.pow(2, 0)));

    }
}