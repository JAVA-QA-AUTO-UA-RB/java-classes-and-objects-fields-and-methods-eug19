import java.util.Random;

public class SuperHero {
    private String name;
    private int attackPower;
    private int defensePower;
    private int health;
    private Random rand = new Random();

    public SuperHero(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.health = 100;
    }

    public void attack(SuperHero opponent) {
        if (!this.isAlive()) {
            System.out.println(this.name + " не може атакувати, бо мертвий.");
            return;
        }

        int[] possibleHits = {10, 15, 20, 25, 30};
        int randomHit = possibleHits[rand.nextInt(possibleHits.length)];

        System.out.println(this.name + " атакує " + opponent.name + " і завдає " + randomHit + " ушкоджень.");
        opponent.takeDamage(randomHit);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " має залишок здоров'я: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStats() {
        System.out.println("Ім'я: " + name);
        System.out.println("Сила атаки: " + attackPower);
        System.out.println("Сила захисту: " + defensePower);
        System.out.println("Здоров'я: " + health);
        System.out.println("--------------------------");
    }

    public String getName() {
        return name;
    }
}
