/**
 * Created by jocc on 2016.11.03..
 */

public class Arena {

    private static Animal[] createAnimals(){
        Animal lion = new Animal("Simba", 5, 5);
        Animal walrus = new Animal("Walrus", 5, 5);
        Animal rabbit = new Animal("Blood Bunny", 5, 5);
        Animal ducky = new Animal("Dagobert", 5, 5);
        Animal[] Animals = {lion, walrus, rabbit, ducky};
        return Animals;
    }

    private static Gladiator[] createGladiators(){
        Gladiator Spartacus = new Gladiator("Spartacus", "Thracian", 30, 178);
        Gladiator Crixus = new Gladiator("Crixus", "Gallic", 34, 170);
        Gladiator Gannicus = new Gladiator("Gannicus", "Celt", 27, 175);
        Gladiator Agron = new Gladiator("Agron", "German", 25, 185);
        Gladiator Miki = new Gladiator("MentorMiki", "Hun", 45, 160);
        Gladiator[] Gladiators = {Spartacus, Crixus, Gannicus, Agron, Miki};
        return Gladiators;
    }

    private static Tool[] createTools(){
        Shield shield1 = new Shield("Adamantium shield", 10);
        Shield shield2 = new Shield("Iron shield", 5);
        Shield shield3 = new Shield("Wooden shield", 1);
        Weapon sword = new Weapon("Gladius", 5);
        Weapon spear = new Weapon("Spear", 6);
        Weapon mace = new Weapon("Mace", 7);
        Weapon axe = new Weapon("Axe", 8);
        Weapon banana = new Weapon("Banana", 10);
        Weapon dildo = new Weapon("Dildo", 1);
        Tool[] Tools = {shield1, shield2, shield3, sword, spear, mace, axe, banana, dildo};
        return Tools;
    }

    public void addTool(Gladiator fighter, int tool1, int tool2) {
        Tool[] ArenaTools = createTools();
        Tool Tool1 = ArenaTools[tool1];
        Tool Tool2 = ArenaTools[tool2];
        Tool[] Tools = {Tool1, Tool2};
        fighter.tools = Tools;
        System.out.println(fighter.tools[0].name);
        System.out.println(fighter.tools[0]);
    }

    public static void main(String[] args) {
        Gladiator gladiator1 = new Gladiator("baba", "nigger", 50, 150);
        System.out.println(gladiator1.name);
        Animal lion = new Animal("lion", 5, 5);
        System.out.println(lion.name);
        Animal[] myLittleZoo = createAnimals();
        System.out.println(myLittleZoo[0].damage);
        Gladiator[] gladiators = createGladiators();
        System.out.println(gladiators[0].name);
        Tool[] ArenaTools = createTools();
        Arena arena = new Arena();
        arena.addTool(gladiator1, 1, 2);


    }
}
