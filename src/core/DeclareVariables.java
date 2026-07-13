package core;

public class DeclareVariables {
    public static String  customerName;
    public static  int  cupsOfCoffee;
    public static  float  costOfCoffee;
    public static boolean  tip;

    static void main() {
        customerName = "Sasha";
        cupsOfCoffee = 1;
        costOfCoffee = 99.9f;
        tip = true;

        System.out.println(declareVariables());
    }

    public static String declareVariables(){
        float total = cupsOfCoffee * costOfCoffee;
        String response = "";

        response = "Dear " + customerName + ", thank you for supporting our business!"+"\n" +
                "Cups of coffee bought: " +  cupsOfCoffee +"." +"\n"+
                "Cost of " +  cupsOfCoffee + " cup of coffee: " + "$"+ costOfCoffee +"." + "\n" +
                "Your total is: " + "$"+ total + "."+ "\n" +
                "Tip is included? " + tip + ".";

        return response;
    }
}
