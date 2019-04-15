public class Temperature extends Subject  {
    private double value;

    public Temperature(int temp) {
        value = temp;
    }

    public double getValue() {
      return value;
    }
    public void setValue(double value) {
      This.value = value;
      notifyObservers();
    }
  }
  