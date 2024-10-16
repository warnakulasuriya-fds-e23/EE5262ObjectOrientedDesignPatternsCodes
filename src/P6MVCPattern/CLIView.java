package P6MVCPattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CLIView {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Boolean condition = true;
        while (condition){
            System.out.println("Welcome to Car Registering service !");
            System.out.println("Please Select and option");
            System.out.println("1. Add a Car");
            System.out.println("2. Exit");

            String input = myObj.nextLine();

            switch(input) {
                case "1":
                    System.out.println("Option 1 selected");
                    System.out.println("Please enter the Car Name");
                    String carname = myObj.nextLine();
                    System.out.println("Please enter the fuel type");
                    String fuelType = myObj.nextLine();
                    System.out.println("Please enter the horsepower");
                    String horsepower = myObj.nextLine();
                    break;
                case "2":
                        condition = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
