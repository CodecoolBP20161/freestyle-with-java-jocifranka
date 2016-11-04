
public class Weapon extends Tool{

    static int damage;

    public Weapon(String name, int damage) {
        super(name);
        Weapon.damage = damage;
    }
}
