import java.util.Scanner;
class Calculate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String optr = new String();
    optr = sc.nextLine();

    if(optr.equals("+")) {
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();

      double sum = (double)num1 + (double)num2;

      System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
  }
    if(optr.equals("-")) {
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();

      double diff = (double)num1 - (double)num2;

      System.out.println("The difference of " + num1 + " - " + num2 + " is " + diff);
}
    if(optr.equals("*")) {
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();

      double prod = (double)num1 * (double)num2;

      System.out.println("The product of " + num1 + " x " + num2 + " is " + prod);
}
    if(optr.equals("/")) {
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();

      double quot = (double)num1 / (double)num2;

      System.out.println("The quotient of " + num1 + " / " + num2 + " is " + quot);
}
    sc.close();
}
}