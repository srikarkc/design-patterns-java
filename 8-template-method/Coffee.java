public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through the filter.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }
}
