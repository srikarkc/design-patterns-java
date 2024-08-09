public class AdapterPatternDemo {
    public static void main(String[] args) {
        AmericanPlug ap = new AmericanPlug();
        EuropeanSocket es = new PlugAdapter(ap);

        es.plugIn();
    }
}