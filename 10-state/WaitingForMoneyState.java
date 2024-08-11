public class WaitingForMoneyState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted.");
        vendingMachine.setState(vendingMachine.getMoneyInsertedState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("No money to eject.");
    }

    @Override
    public void selectItem() {
        System.out.println("You need to insert money first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No money inserted.");
    }

}
