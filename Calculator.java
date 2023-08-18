import java.util.Scanner;

class Calculate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String optr = new String();

    //Ask for operator
    System.out.println("Choose an operator: +, -, *, or /");
    optr = sc.nextLine();

    if(!(optr.equals("+") || optr.equals("-") || optr.equals("*") || optr.equals("/"))){
      System.out.println("Invalid operator!");
      
      sc.close();
      return;
    }

    //Ask for first number
    System.out.println("Enter first number");
    double num1 = sc.nextDouble();

    //Ask for second number
    System.out.println("Enter second number");
    double num2 = sc.nextDouble();

    double result = 0.0;

    //Addition
    if(optr.equals("+")) {

      result = (double)num1 + (double)num2;
    }
    //Subtraction
    else if(optr.equals("-")) {

      result = (double)num1 - (double)num2;
    }
    //Multiplication
    else if(optr.equals("*")) {

      result = (double)num1 * (double)num2;
    }
    //Division
    else if(optr.equals("/")) {

      result = (double)num1 / (double)num2;
    }

    System.out.println(num1 + " " + optr + " " + num2 + " = " + result);

    sc.close();
}
}