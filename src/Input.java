import java.util.Scanner;

/**
 * Created by jocc on 2016.11.03..
 */
public class Input {

    public int getFirstToolInput() {
        System.out.println("Choose your first weapon/shield: ");
        Scanner scanInput = new Scanner(System.in);
        int number1 = scanInput.nextInt();
        return number1;
    }

    public int getSecondToolInput() {
        System.out.println("You can choose another weapon/shield: ");
        Scanner scanInput = new Scanner(System.in);
        int number2 = scanInput.nextInt();
        return number2;
    }

}
