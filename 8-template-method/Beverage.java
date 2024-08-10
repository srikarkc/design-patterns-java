public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water.");
    }

    private void pourInCup() {
        System.out.println("Pouring beverage in a cup.");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}
