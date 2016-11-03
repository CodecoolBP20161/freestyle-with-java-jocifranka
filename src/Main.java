import java.util.Scanner;

public class Main {

    public int getFirstToolInput() {
        Scanner scanInput = new Scanner(System.in);
        while (true)
        {
            System.out.println("Choose your first weapon/shield: {0:Adamantium shield} {1:Iron shield} {2:Wooden shield} ");
            try
            {
                int amount = scanInput.nextInt();
                if  (amount >= 0 && amount <= 8){
                    return amount;
                }
                else {System.out.println(" Invalid option "); continue;}
            }
            catch (Exception e)
            {
                System.out.println(" Invalid option ");
            }
        }
    }

    public int getSecondToolInput() {
        System.out.println("You can choose another weapon/shield: ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int getPlayerName() {
        System.out.println("Choose your character: ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int getOpponentType(Gladiator fighter1) {
        System.out.println("Do you want " + fighter1.name + " to fight an animal or a gladiator? ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int printAnimalMenu(){
//        TO DO: write menu!!
        System.out.println("This is animal menu");

        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int printGladiatorMenu(){
        //        TO DO: write menu!!
        System.out.println("this is gladiator menu");

        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int getOpponentName() {
        System.out.println("Choose your opponent: ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public static void main(String[] args) {
        Arena arena = new Arena();
        arena.createArena();
    }
}
