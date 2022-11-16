public class Main {


    public static void main(String[] args) {
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero: " + (i + 1) + " Health: " + createHeroes()[i].getHeroHealth() +
                    " Hero: " + (i+1) + " Heroes Damage: " + createHeroes()[i].getHeroDamage() + "Hero: " + (i+1) + " Ultimate Skill: " + createHeroes()[i].getHeroSuperpower());
        }
        Hero heroes = new Hero(200, 20, "Improved protection");
        System.out.println("Hero: " + "Damage: " +heroes.getHeroDamage() + " Health: " + heroes.getHeroHealth() + " Ultimate Skill: " + heroes.getHeroSuperpower());
        Hero heroes2 = new Hero(180, 15);
        System.out.println("Heroes2: " + " Damage: " + heroes2.getHeroDamage() + " Health: " + heroes2.getHeroHealth());


        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(50);
        boss.setProtectionType("Physical protection");
        System.out.println("Boss Health: " + boss.getBossHealth() + "\nBoss Damage: " +
                boss.getBossDamage() + "\nBoss Protection Type: " + boss.getProtectionType());
    }

    public static Hero heroWithPower(int health, int damage, String heroSuperpower) {
        Hero hero = new Hero(health, damage, heroSuperpower);
        return hero;
    }

    public static Hero heroWithoutPower(int health, int damage) {
        Hero hero = new Hero(health, damage);
        return hero;
    }

    public static Hero[] createHeroes() {
        Hero hero1 = heroWithoutPower(200, 20);
        Hero hero2 = heroWithPower(250, 40, "super blow");
        Hero hero3 = heroWithPower(300, 20, "protection");
        Hero[] heroesOfWorld = {hero1, hero2, hero3};
        return heroesOfWorld;
    }


}


