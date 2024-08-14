package P4TemplateMethodPattern;

public class Usage {
    public static void main(String[] args) {
        Tea firstTea = new Tea();
        Coffee coffeeOne = new Coffee();

        firstTea.prepareRecipe();
        System.out.println("Completed Making Tea \n");
        coffeeOne.prepareRecipe();
        System.out.println("Completed Making Coffee \n");
    }
}

