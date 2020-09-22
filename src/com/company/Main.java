package com.company;

public class Main {

    public static void main(String[] args) {
        BossClass boss = new BossClass();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon bossWeapon = new Weapon();
        bossWeapon.setNameWeapon("Sword");
        bossWeapon.setTypeWeapon("Physical");
        boss.setWeapon(bossWeapon);

        System.out.println("Boss health " + boss.getHealth() + ", damage "
                + boss.getDamage() + ", weapon " + boss.getWeapon().getNameWeapon() + " "
                + boss.getWeapon().getTypeWeapon());

        /*bossCreate();
	    Hero[] heroes = heroCreate();
        for (Hero hero : heroes) {
            System.out.println(hero.getHealth() + " " + hero.getDamage()
                    + " " + hero.getAttackType());
        }*/
    }

    /*public static Hero[] heroCreate() {
        Hero firstHero = new Hero(260, 20, "Physical");
        Hero secondHero = new Hero(250, 25, "Magical");
        Hero thirdHero = new Hero(200, 0);
        return new Hero[] {firstHero, secondHero, thirdHero};
    }

    public static void bossCreate() {
        Boss firstBoss = new Boss();
        firstBoss.setHealth(1000);
        firstBoss.setDamage(50);
        firstBoss.setProtectionType("");

        System.out.println("Boss health " + firstBoss.getHealth()
                + ", damage " + firstBoss.getDamage() + ", protection " + firstBoss.getProtectionType());
    }*/
}
