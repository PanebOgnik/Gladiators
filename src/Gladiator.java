public class Gladiator {
    String name;
    private int level = 1;
    int lifePoints;
    int strength;
    int agilty;
    int defence;
    boolean extraAttack;
    int gold;
    Weapon weapon;
    Armor armor;

    public Gladiator(String name, int lifePoints, int strength,int defence, int agilty, int gold, Weapon weapon, Armor armor) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
        this.agilty = agilty;
        this.defence = defence;
        this.gold = gold;
        this.weapon = weapon;
        this.armor = armor;
    }
}


