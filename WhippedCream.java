public class WhippedCream implements CoffeeDecorator {
    private Coffee coffee;

    @Override
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 50.00;
    }
}