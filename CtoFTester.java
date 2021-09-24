public class CtoFTester {
  public static void main(String[] args){
    System.out.println(fahrenheitToCelsius( 9.0 ));
    System.out.println(celsiusToFahrenheit(10.0));
  }
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9.0 / 5.0) +32.0;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32.0) * 5.0 / 9.0;
  }
}
