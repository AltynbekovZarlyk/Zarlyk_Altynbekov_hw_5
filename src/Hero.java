public class Hero {
    private int heroDamage;
    private int heroHealth;
    private String heroSuperpower;

    public Hero(int theHealth, int theDamage, String theSuperpower) {
        heroHealth = theHealth;
        heroDamage = theDamage;
        heroSuperpower = theSuperpower;
    }

    public Hero(int health, int damage) {
        this.heroHealth = health;
        this.heroDamage = damage;

    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public String getHeroSuperpower() {
        return heroSuperpower;
    }
}
