public class DispensingState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Please wait, we're already dispensing your item.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Cannot eject money, already dispensing item.");
    }

    @Override
    public void selectItem() {
        System.out.println("Item already selected, dispensing item.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing item...");
        if (vendingMachine.getItemCount() > 0) {
            vendingMachine.releaseItem();
            if (vendingMachine.getItemCount() > 0) {
                vendingMachine.setState(vendingMachine.getWaitingForMoneyState());
            } else {
                System.out.println("Out of stock.");
                vendingMachine.setState(vendingMachine.getOutOfStockState());
            }
        }
    }
}
