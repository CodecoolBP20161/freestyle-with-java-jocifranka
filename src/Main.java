import java.util.Scanner;

public class Main {

    public int getFirstToolInput() {
        System.out.println("Choose your first weapon/shield: ");
        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
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
        System.out.println("This is animalmenu");

        Scanner scanInput = new Scanner(System.in);
        return scanInput.nextInt();
    }

    public int printGladiatorMenu(){
        //        TO DO: write menu!!
        System.out.println("this is gladiatormenu");

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
