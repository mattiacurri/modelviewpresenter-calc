package Model;

import java.math.BigInteger;
import java.util.ArrayList;

public class CalculatorModel {
  public BigInteger sum(ArrayList<BigInteger> numbers) {
    BigInteger output = new BigInteger("0");
    for (BigInteger number : numbers) {
      output = output.add(number);
    }
    return output;
  }

  public BigInteger subtract(BigInteger... numbers) {
    BigInteger output = null;
    try {
      output = new BigInteger(numbers[0].toByteArray());
      for (int i = 1; i < numbers.length; i++) {
        output = output.subtract(numbers[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Nessuna operazione da eseguire");
    }
    return output;
  }

  public BigInteger dot(BigInteger... numbers) {
    BigInteger output = null;
    try {
      output = new BigInteger(numbers[0].toByteArray());
      for (int i = 1; i < numbers.length; i++) {
        output = output.multiply(numbers[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Nessuna operazione da eseguire");
    }
    return output;
  }

  public BigInteger divide(BigInteger numerator, BigInteger denominator) {
    BigInteger output = new BigInteger("0");
    try {
      output = output.add(numerator).divide(denominator);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero");
    }
    return output;
  }

}