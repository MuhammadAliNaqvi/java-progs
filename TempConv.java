class Demo {
    public static void main(String[] args) {
        //Celsius to Fahrenheit
        double c = 102;
        double x = (double)9/(double)5;
        int y = 32;

        System.out.println((c*x+y) + "°C");

        //Fahrenheit to Celsius
        double f = 215.6;
        double w = (double)5/(double)9;
        int v = 32;

        System.out.println(((f-v)*w) + "°F");
    }
}