public class MochaDecorator extends CoffeeDecorator {

    public MochaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Mocha";
    }

    public double cost() {
        return decoratedCoffee.cost() + 5.50;
    }
    
}
