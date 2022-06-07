import java.util.Scanner;

public  class App {
    static final Scanner inputScanner = new Scanner(System.in);
    static Calculator calc = new Calculator();

    public static void main(String[] args){
        System.out.println("Welcome to the Calculator!");
        boolean loop = true;

        String response = "";
        String display = "";
        //response = getString( "Put in a long string now");
        //System.out.println(response);

        while(loop){

            double num1 = getDouble("Enter two numbers: ");
            double num2 = getDouble("Enter the next number: ");   
            double result = 0.00;

            
            response = getChar( "What would you like to do? \n add \n subtract \n multiply \n divide");

            switch (response) {
                case "add":
                    result = calc.add(num1, num2);
                    display =  String.format("%.1f +  %.1f = %.1f", num1, num2, result);
                    System.out.println(display);
                    break;
                case "subtract":
                    result = calc.subtract(num1, num2);
                    display =  String.format("%.1f -  %.1f = %.1f", num1, num2, result);
                    System.out.println(display);
                    break;
                case "multiply":
                    result = calc.multiply(num1, num2);
                    display =  String.format("%.1f *  %.1f = %.1f", num1, num2, result);
                    System.out.println(display);
                    break;
                case "divide":
                    if(num2 == 0.0){System.out.println("Divide by zero error!");}
                    else{
                        result = calc.divide(num1, num2);
                        display =  String.format("%.1f /  %.1f = %.1f", num1, num2, result);
                        System.out.println(display);
                        break;
                    }
            
                default:
                    break;
            }                          
            
            response = getChar( "Do you want to continue to perform more calculations? Y/N");
            //System.out.println(response);
            
            //System.out.println("Do you want to continue? ");
            //response = inputScanner.next();

            if(response.equals("Y") || response.equals("y") ) {
                loop = true;
             }
             else{
                System.out.println("Goodbye!");
                loop = false;
             }
            

        }
    }

    private static String getString(String prompt) {
        // fill in the code
        System.out.println(prompt);
        String val =  inputScanner.nextLine();
        return val;
         
    }

    private static String getChar(String prompt) {
        // fill in the code
        System.out.println(prompt);
        String val =  inputScanner.next();
        return val;
         
    }
    
    private static double getDouble(String prompt) {
        // fill in the code
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

}