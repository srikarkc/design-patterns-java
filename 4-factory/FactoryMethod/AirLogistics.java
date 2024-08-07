package FactoryMethod;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
