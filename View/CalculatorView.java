package View;

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
  }

  public int getUserChoice() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inserisci la tua scelta: ");
    return scanner.nextInt();
  }
  public static void main(String[] args) {
    CalculatorView cv = new CalculatorView();
    cv.showMenu();
  }
}
