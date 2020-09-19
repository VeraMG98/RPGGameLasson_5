package com.company;

public class Main {

    public static void main(String[] args) {
	    bossCreate();
	    Hero[] heroes = new Hero[3];
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroCreate(i).getHealth() + " " + heroCreate(i).getDamage()
                    + " " + heroCreate(i).getAttackType());
        }
    }

    public static Hero heroCreate(int count) {
        Hero firstHero = new Hero(260, 20, "Physical");
        Hero secondHero = new Hero(250, 25, "Magical");
        Hero thirdHero = new Hero(200, 0);
        Hero[] heroes = new Hero[] {firstHero, secondHero, thirdHero};
        return heroes[count];
    }

    public static void bossCreate() {
        Boss firstBoss = new Boss();
        firstBoss.setHealth(1000);
        firstBoss.setDamage(50);
        firstBoss.setProtectionType("");

        System.out.println("Boss health " + firstBoss.getHealth()
                + ", damage " + firstBoss.getDamage() + ", protection " + firstBoss.getProtectionType());
    }
}
