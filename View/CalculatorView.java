package View;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculatorView {
  public void showLogo() {
    String logo = """
          ______     ___       __        ______   ______    __          ___   .___________..______       __    ______  _______\s
         /      |   /   \\     |  |      /      | /  __  \\  |  |        /   \\  |           ||   _  \\     |  |  /      ||   ____|
        |  ,----'  /  ^  \\    |  |     |  ,----'|  |  |  | |  |       /  ^  \\ `---|  |----`|  |_)  |    |  | |  ,----'|  |__  \s
        |  |      /  /_\\  \\   |  |     |  |     |  |  |  | |  |      /  /_\\  \\    |  |     |      /     |  | |  |     |   __| \s
        |  `----./  _____  \\  |  `----.|  `----.|  `--'  | |  `----./  _____  \\   |  |     |  |\\  \\----.|  | |  `----.|  |____\s
         \\______/__/     \\__\\ |_______| \\______| \\______/  |_______/__/     \\__\\  |__|     | _| `._____||__|  \\______||_______|
        """;
    System.out.println(logo);
  }
  public void showMenu() {
    showLogo();
    System.out.println("1. Addizione");
    System.out.println("2. Sottrazione");
    System.out.println("3. Moltiplicazione");
    System.out.println("4. Divisione (tra due numeri)");
    System.out.println("5. Esci");
  }

  public int getUserChoice() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inserisci la tua scelta: ");
    int choice = 0;
    try { choice = scanner.nextInt(); } catch (InputMismatchException e) { System.out.println("Non è stato inserito un numero"); }
    return choice;
  }

  public ArrayList<BigInteger> getNumbers(int choice) throws NumberFormatException {
    Scanner scanner = new Scanner(System.in);
    ArrayList<BigInteger> numbersInput = new ArrayList<BigInteger>();
    if (choice != 4 || choice != 5) {
        System.out.print("Inserire numeri separati da uno spazio: ");
        String[] nextLine = scanner.nextLine().split("\\s");
        for (String i : nextLine) {
          numbersInput.add(new BigInteger(i));
        }
    } else {
      int numbers = 0;
      System.out.print("Inserire primo numero: ");
      numbers = scanner.nextInt();
      numbersInput.add(BigInteger.valueOf(numbers));
      System.out.print("Inserire secondo numero: ");
      numbersInput.add(BigInteger.valueOf(numbers));
    }
    return numbersInput;
  }
}
