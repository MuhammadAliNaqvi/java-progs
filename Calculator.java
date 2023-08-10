import java.util.Scanner;

class Calculate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String optr = new String();

    //Ask for operator
    System.out.println("Choose an operator: +, -, *, or /");
    optr = sc.nextLine();

    //Ask for first number
    System.out.println("Enter first number");
    double num1 = sc.nextDouble();

    //Ask for second number
    System.out.println("Enter second number");
    double num2 = sc.nextDouble();

    //Addition
    if(optr.equals("+")) {

      double sum = (double)num1 + (double)num2;

      System.out.println(num1 + " + " + num2 + " = " + sum);
}
    //Subtraction
    if(optr.equals("-")) {

      double diff = (double)num1 - (double)num2;

      System.out.println(num1 + " - " + num2 + " = " + diff);
}
    //Multiplication
    if(optr.equals("*")) {

      double prod = (double)num1 * (double)num2;

      System.out.println(num1 + " x " + num2 + " = " + prod);
}
    //Division
    if(optr.equals("/")) {

      double quot = (double)num1 / (double)num2;

      System.out.println(num1 + " / " + num2 + " = " + quot);
}
    sc.close();
}
}