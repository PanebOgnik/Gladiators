public class Opponent {
    String name;
    int level;
    int lifePoints;
    int strength;
    int agilty;
    int defence;
    boolean extraAttack;
    Weapon weapon;
    Armor armor;

    public Opponent(String name, int level, int lifePoints, int strength, int agilty, int defence, boolean extraAttack, Weapon weapon, Armor armor) {
        this.name = name;
        this.level = level;
        this.lifePoints = lifePoints;
        this.strength = strength;
        this.agilty = agilty;
        this.defence = defence;
        this.extraAttack = extraAttack;
        this.weapon = weapon;
        this.armor = armor;
    }
}
