public class MoneyInsertedState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public MoneyInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money returned.");
        vendingMachine.setState(vendingMachine.getWaitingForMoneyState());
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected.");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("No item selected yet.");
    }
}
