public class PlugAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public PlugAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugIn() {
        americanPlug.plugIn();
    }
}
