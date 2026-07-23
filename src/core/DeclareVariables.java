package core;

public class DeclareVariables {
    public static String  customerName;
    public static  int  cupsOfCoffee;
    public static  float  costOfCoffee;
    public static boolean  tip;

    public static void main(String[] args) {
        customerName = "Sasha";
        cupsOfCoffee = 1;
        costOfCoffee = 99.9f;
        tip = true;

        System.out.println(declareVariables());
    }

    public static String declareVariables(){
        float total = cupsOfCoffee * costOfCoffee;;
        String response = "Dear %s, thank you for supporting our business!\n" +
                "Cups of coffee bought: %s.\n" +
                "Cost of %s cup of coffee: $%s.\n" +
                "Your total is: $%s.\n" +
                "Tip is included? %s.";

        return String.format(response,customerName, cupsOfCoffee, cupsOfCoffee, costOfCoffee, total, tip);
    }
}
