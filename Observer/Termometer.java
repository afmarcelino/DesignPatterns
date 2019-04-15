public class TermometerCelsius implements Observer  {
    public void update(Subject s) {
      double value = ((Temperature) s).getValue();
      System.out.println("Celsius: " + value);
    }
  }

  public class TermometerFahrenheit implements Observer {
    public void update(Subject s) {
      double value = 1.8 * ((Temperature) s).getValue() + 32;
      System.out.println("Fahrenheit: " + value);
    }
  }
  