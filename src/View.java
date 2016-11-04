import java.util.Scanner;

public class View {

    public int getFirstToolInput() {
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your first weapon/shield: (0:Adamantium shield 1:Iron shield 2:Wooden shield 3:Gladius 4:Spear 5:Mace 6:Axe 7:Banana 8:Dildo) ");
            try {
                if (scanInput.hasNextInt()) {
                    int amount = scanInput.nextInt();
                    if (amount >= 0 && amount <= 8) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option  ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a number!");
                }


            } catch (Exception e) {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int getSecondToolInput() {
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("You can choose another weapon/shield: (0:Adamantium shield 1:Iron shield 2:Wooden shield 3:Gladius 4:Spear 5:Mace 6:Axe 7:Banana 8:Dildo) ");
            try {
                if (scanInput.hasNextInt()) {
                    int amount = scanInput.nextInt();
                    if (amount >= 0 && amount <= 8) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a number!");
                }
            } catch (Exception e) {
                System.out.println(" Invalid  option ");
            }
        }
    }


    public int getPlayerName() {
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your character: (0:Spartacus  1:Crixus  2:Gannicus  3:Agron  4:MentorMiki");
            try {
                if (scanInput.hasNextInt()) {
                    int amount = scanInput.nextInt();
                    if (amount >= 0 && amount <= 4) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a  number!");
                }


            } catch (Exception e) {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int getOpponentType(Gladiator fighter1) {
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want " + fighter1.name + " to fight an animal or a gladiator? (1:Animal  2:Gladiator) ");
            try {
                if (scanInput.hasNextInt() == true) {
                    int amount = scanInput.nextInt();
                    if (amount > 0 && amount < 3) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a number!");
                }
            } catch (Exception e) {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int printAnimalMenu() {
//        TO DO: write menu!!
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Select from the animals: (0:Simba  1:Walrus  2:The rabbit from Monty Python  3:Dagobert)");
            try {
                if (scanInput.hasNextInt() == true) {
                    int amount = scanInput.nextInt();
                    if (amount >= 0 && amount <= 3) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a number!");
                }
            } catch (Exception e) {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int printGladiatorMenu() {
        //        TO DO: write menu!!
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Select from the Gladiators : (0:Spartacus  1:Crixus  2:Gannicus  3:Agron  4:MentorMiki");
            try {
                if (scanInput.hasNextInt()) {
                    int amount = scanInput.nextInt();
                    if (amount >= 0 && amount <= 4) {
                        return amount;
                    } else {
                        System.out.println(" Invalid option ");
                    }
                } else {
                    scanInput.next();
                    System.out.println("Please enter a number! ");
                }


            } catch (Exception e) {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int getOpponentName() {
        System.out.println("Choose your opponent: ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }
}
