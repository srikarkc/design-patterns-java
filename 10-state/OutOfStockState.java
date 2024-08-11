public class OutOfStockState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine is out of stock. Cannot insert money.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money inserted.");
    }

    @Override
    public void selectItem() {
        System.out.println("Machine is out of stock.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Machine is out of stock. Cannot dispense item.");
    }
}
