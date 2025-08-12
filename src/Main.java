public class Main {
    public static void main(String[] args) {
        SuperHero hero1 = new SuperHero("Залізна людина", 30, 10);
        SuperHero hero2 = new SuperHero("Флеш", 25, 15);

        System.out.println("=== ПОЧАТОК БИТВИ ===");

        int round = 1;

        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println("=== Раунд " + round + " ===");

            hero1.attack(hero2);
            if (hero2.isAlive()) {
                hero2.attack(hero1);
            }

            round++;
        }

        System.out.println("=== КІНЕЦЬ БИТВИ ===");
        if (hero1.isAlive() && !hero2.isAlive()) {
            System.out.println(hero1.getName() + " переміг!");
        } else if (!hero1.isAlive() && hero2.isAlive()) {
            System.out.println(hero2.getName() + " переміг!");
        } else {
            System.out.println("Нічия! Обидва герої загинули.");
        }
    }}