import Model.CalculatorModel;
import View.CalculatorView;
import Presenter.CalculatorPresenter;
public class App {
  public static void main(String[] args) {
    CalculatorPresenter presenter = new CalculatorPresenter();
    presenter.start();
  }

}
