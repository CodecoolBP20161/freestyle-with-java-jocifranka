/**
 * Created by jocc on 2016.11.03..
 */

public class Arena {

    public static Animal[] createAnimals(){
        Animal lion = new Animal("Simba", 5, 5);
        Animal walrus = new Animal("Walrus", 5, 5);
        Animal rabbit = new Animal("The rabbit from Monty Python", 999, 999);
        Animal ducky = new Animal("Dagobert", 5, 5);
        Animal[] Animals = {lion, walrus, rabbit, ducky};
        return Animals;
    }

    public static Gladiator[] createGladiators(){
        Gladiator Spartacus = new Gladiator("Spartacus", "Thracian", 30, 178);
        Gladiator Crixus = new Gladiator("Crixus", "Gallic", 34, 170);
        Gladiator Gannicus = new Gladiator("Gannicus", "Celt", 27, 175);
        Gladiator Agron = new Gladiator("Agron", "German", 25, 185);
        Gladiator Miki = new Gladiator("MentorMiki", "Hun", 45, 160);
        Gladiator[] Gladiators = {Spartacus, Crixus, Gannicus, Agron, Miki};
        return Gladiators;
    }

    public static Tool[] createTools(){
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

    public void addTool(Gladiator fighter, int tool1, int tool2, Tool[] ArenaTools) {
        Tool Tool1 = ArenaTools[tool1];
        Tool Tool2 = ArenaTools[tool2];
        Tool[] Tools = {Tool1, Tool2};
        fighter.tools = Tools;
    }

    public void createArena() {
        Animal[] myLittleZoo = createAnimals();
        Gladiator[] gladiators = createGladiators();
        Tool[] ArenaTools = createTools();

        Main inputs = new Main();

        Gladiator player1 = gladiators[inputs.getPlayerName()];
        int firstTool = inputs.getFirstToolInput();
        int secondTool = inputs.getSecondToolInput();

        addTool(player1, firstTool, secondTool, ArenaTools);

        System.out.println(player1.tools[0].name);
        System.out.println(player1.tools[1].name);
        System.out.println(player1.name);

        int opponentType = inputs.getOpponentType(player1);

        if (opponentType == 2) {
            int x = inputs.printGladiatorMenu();
            Gladiator player2 = gladiators[x];
            System.out.println(player2.name);

        } else {
            int y = inputs.printAnimalMenu();
            Animal player2 = myLittleZoo[y];
            System.out.println(player2.name);

        }



    }
}
