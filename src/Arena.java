import java.util.Random;

public class Arena {

    private static Animal[] createAnimals(){
        Animal lion = new Animal("Simba", 5, 5);
        Animal walrus = new Animal("Walrus", 5, 5);
        Animal rabbit = new Animal("The rabbit from Monty Python", 999, 999);
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

    private static void addTool(Gladiator fighter, int tool1, int tool2, Tool[] ArenaTools) {
        Tool Tool1 = ArenaTools[tool1];
        Tool Tool2 = ArenaTools[tool2];
        Tool[] Tools = {Tool1, Tool2};
        fighter.tools = Tools;
    }

    private static void addToolPlayer2(Gladiator player2, Tool[] ArenaTools) {
        int idx1 = new Random().nextInt(ArenaTools.length);
        int idx2 = new Random().nextInt(ArenaTools.length);
        Tool Tool1 = ArenaTools[idx1];
        Tool Tool2 = ArenaTools[idx2];
        Tool[] Tools = {Tool1, Tool2};
        player2.tools = Tools;
    }

    private static void ageStatChanger(Gladiator player1){
        if (player1.age <= 14 || player1.age >= 60) {
            player1.stat = 0;
        } else if(15 <= player1.age && player1.age <= 25 || 35 <= player1.age && player1.age >= 50) {
            player1.stat += 3;
        } else if(25 <= player1.age && player1.age<= 35) {
            player1.stat += 5;
        } else {
            player1.stat += 1;
        }
    }


    private static void heightStatChanger(Gladiator player1) {
        if (player1.height > 120 && player1.height <= 150) {
            player1.stat += 2;
        } else if (player1.height > 150 && player1.height <= 170) {
            player1.stat += 3;
        } else if (player1.height > 170) {
            player1.stat += 5;
        }
    }

    private static void toolStatChanger(Gladiator player1, Gladiator player2) {
        Tool tool1 = player1.tools[0];
        Tool tool2 = player1.tools[1];
        if (tool1 instanceof Shield) {
            player1.stat += ((Shield) tool1).protection;
        } else {
            player2.stat -= ((Weapon) tool1).damage;
        }
        if (tool2 instanceof Shield) {
            player1.stat += ((Shield) tool2).protection;
        } else {
            player2.stat -= ((Weapon) tool2).damage;
        }
    }

    private static void statChangerAnimal(Gladiator player1, Animal player2) {
        Tool tool1 = player1.tools[0];
        Tool tool2 = player1.tools[1];
        if (tool1 instanceof Shield) {
            player1.stat += ((Shield) tool1).protection;
        } else {
            player2.stat -= ((Weapon) tool1).damage;
        }        if (tool2 instanceof Shield) {
            player1.stat += ((Shield) tool2).protection;
        } else {
            player2.stat -= ((Weapon) tool2).damage;
        }
        player1.stat -= player2.damage;
        player2.stat += player2.protection;
    }


    private static String fightMan(Gladiator player1, Gladiator player2, Tool[] ArenaTools) {
        String winner;
        addToolPlayer2(player2, ArenaTools);
        ageStatChanger(player1);
        ageStatChanger(player2);
        heightStatChanger(player1);
        heightStatChanger(player2);
        toolStatChanger(player1, player2);
        toolStatChanger(player2, player1);
        if (player1.stat > player2.stat) {
            winner = player1.name;
        } else if (player2.stat > player1.stat) {
            winner = player2.name;
        } else {
            winner = " nobody. Both sides died :( ";
        }
        System.out.println(winner);
        return winner;
    }


    private static String fightAnimal(Gladiator player1, Animal animal) {
        String winner;
        ageStatChanger(player1);
        heightStatChanger(player1);
        statChangerAnimal(player1, animal);
        if (player1.stat > animal.stat) {
            winner = player1.name;
        } else if (animal.stat > player1.stat) {
            winner = animal.name;
        } else {
            winner = "It's a tie. You both died :( ";
        }
        System.out.println(winner);
        return winner;
    }

    private static String winner(View inputs, Gladiator player1, Gladiator[] gladiators, Tool[] ArenaTools) {
        String winner;
        int opponentType = inputs.getOpponentType(player1);
        Animal[] myLittleZoo = createAnimals();

        if (opponentType == 2) {
            int x = inputs.printGladiatorMenu();
            Gladiator player2 = gladiators[x];
            winner = fightMan(player1, player2, ArenaTools);

        } else {
            int y = inputs.printAnimalMenu();
            Animal player2 = myLittleZoo[y];
            winner = fightAnimal(player1, player2);
        }
        return winner;
    }

    public void createArena() {
        Gladiator[] gladiators = createGladiators();
        Tool[] ArenaTools = createTools();
        View inputs = new View();
        Gladiator player1 = gladiators[inputs.getPlayerName()];

        int firstTool = inputs.getFirstToolInput();
        int secondTool = inputs.getSecondToolInput();

        addTool(player1, firstTool, secondTool, ArenaTools);

        String winner = winner(inputs, player1, gladiators, ArenaTools);
        System.out.println("The winner is " + winner);
    }
}
