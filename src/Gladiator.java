public class Gladiator {
    String name;
    private int level = 1;
    int lifePoints;
    int strength;
    int agility;
    boolean extraAttack;
    int gold;
    Weapon weapon;
    Armor armor;

    public Gladiator(String name, int lifePoints, int strength, int agility, int gold, Weapon weapon, Armor armor) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
        this.agility = agility;
        this.gold = gold;
        this.weapon = weapon;
        this.armor = armor;
    }
}


