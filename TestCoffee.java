public class TestCoffee {
    public static void main(String[] args) {

        // Test 1: Plain Black Coffee only
        System.out.println("Order 1:");
        Coffee plain = new BlackCoffee();
        printCoffee(plain);

        // Test 2: Black Coffee with Milk only
        System.out.println("Order 2:");
        Milk milk = new Milk();
        milk.setCoffee(new BlackCoffee());
        printCoffee(milk);

        // Test 3: Black Coffee with Sugar only
        System.out.println("Order 3:");
        Sugar sugar = new Sugar();
        sugar.setCoffee(new BlackCoffee());
        printCoffee(sugar);

        // Test 4: Black Coffee with Caramel Syrup only
        System.out.println("Order 4:");
        CaramelSyrup caramel = new CaramelSyrup();
        caramel.setCoffee(new BlackCoffee());
        printCoffee(caramel);

        // Test 5: Black Coffee with Whipped Cream only
        System.out.println("Order 5:");
        WhippedCream whipped = new WhippedCream();
        whipped.setCoffee(new BlackCoffee());
        printCoffee(whipped);

        // Test 6: Black Coffee with ALL decorators combined
        System.out.println("Order 6:");
        Coffee allDecorated = new BlackCoffee();
        
        Milk milk2 = new Milk();
        milk2.setCoffee(allDecorated);
        
        Sugar sugar2 = new Sugar();
        sugar2.setCoffee(milk2);
        
        CaramelSyrup caramel2 = new CaramelSyrup();
        caramel2.setCoffee(sugar2);
        
        WhippedCream whipped2 = new WhippedCream();
        whipped2.setCoffee(caramel2);
        
        printCoffee(whipped2);
    }

    private static void printCoffee(Coffee coffee) {
        System.out.println("  Description: " + coffee.getDescription());
        System.out.println("  Cost: PHP " + String.format("%.2f", coffee.getCost()));
        System.out.println();
    }
}
