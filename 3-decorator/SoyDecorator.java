public class SoyDecorator extends CoffeeDecorator {

    public SoyDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Soy";
    }

    public double cost() {
        return decoratedCoffee.cost() + 3.50;
    }
    
}
