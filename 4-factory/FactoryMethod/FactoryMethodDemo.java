package FactoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Create a logistics instance for road transport
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        // Create a logistics instance for sea transport
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        // Create a logistics instance for air transport
        Logistics airLogistics = new AirLogistics();
        airLogistics.planDelivery();
    }
}
