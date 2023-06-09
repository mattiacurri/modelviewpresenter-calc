package Presenter;

import Model.CalculatorModel;
import View.CalculatorView;

import java.math.BigInteger;
import java.util.ArrayList;

public class CalculatorPresenter {

  CalculatorView view;
  CalculatorModel model;

  public CalculatorPresenter() {
    view = new CalculatorView();
    model = new CalculatorModel();
  }
  public void start() {
    view.showMenu();
    while (true) {
      int choice = view.getUserChoice();
      switch (choice) {
        case 1:
          ArrayList<BigInteger> numbersToCompute = view.getNumbers(1);
          try {
            System.out.println(model.sum(numbersToCompute));
          } catch (NumberFormatException e) {
            System.out.println("Nessuna operazione da eseguire");
          }
        case 5:
          System.exit(0);
      }
    }
  }
}
