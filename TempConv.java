import java.util.Scanner;
class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String unit = new String();
        unit = sc.nextLine();

        if(unit.equals("C")) {
            double c = sc.nextDouble();

            //Celsius to Fahrenheit
            double x = (double)9/(double)5;
            int y = 32;

            System.out.println((c*x+y) + "°F");
        }
        else if(unit.equals("F")) {
            double f = sc.nextDouble();

            //Fahrenheit to Celsius
            double w = (double)5/(double)9;
            int v = 32;

            System.out.println(((f-v)*w) + "°C");
        }
        sc.close();
    }
}