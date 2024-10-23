package P7ProxyPattern;

import java.util.Scanner;

public class CLI_DataClient {
    public static void main(String[] args) {
        DataStorageProxy dataStorageProxy = new DataStorageProxy();
        Scanner myObj = new Scanner(System.in);
        Boolean condition = true;
        while (condition){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("//////////////////////// WELCOME ////////////////////////");
            System.out.println("Welcome to the CLI Data Client !");
            System.out.println("Please Select and option");
            System.out.println("1. Add an Entry");
            System.out.println("2. Delete an Entry");
            System.out.println("3. Print all Entries");
            System.out.println("4. Exit");

            String input = myObj.nextLine();

            switch(input) {
                case "1":
                    System.out.println("Option 1 selected");
                    System.out.println("Please enter the data string");
                    String dataEntry = myObj.nextLine();
                    dataStorageProxy.addData(dataEntry);
                    break;
                case "2":
                    System.out.println("Option 2 selected");
                    System.out.println("Please enter the index of the entry");
                    String index = myObj.nextLine();
                    dataStorageProxy.deleteData(Integer.parseInt(index));
                    break;
                case "3":
                    System.out.println("=================================================");
                    System.out.println("=================================================");
                    System.out.println("Option 3 selected");
                    dataStorageProxy.printAll();
                    System.out.println("=================================================");
                    System.out.println("=================================================");
                    break;
                case "4":
                    System.out.println("Program will exit");
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

}
