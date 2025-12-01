public class Sugar implements CoffeeDecorator {
    private Coffee coffee;

    @Override
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.00;
    }
}