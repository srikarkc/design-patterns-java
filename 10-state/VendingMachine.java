public class VendingMachine {
    private VendingMachineState waitingForMoneyState;
    private VendingMachineState moneyInsertedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfStockState;

    private VendingMachineState currentState;
    private int itemCount;

    public VendingMachine(int itemCount) {
        waitingForMoneyState = new WaitingForMoneyState(this);
        moneyInsertedState = new MoneyInsertedState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);

        this.itemCount = itemCount;

        if (itemCount > 0) {
            currentState = waitingForMoneyState;
        } else {
            currentState = outOfStockState;
        }
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void ejectMoney() {
        currentState.ejectMoney();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public VendingMachineState getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getOutOfStockState() {
        return outOfStockState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void releaseItem() {
        if (itemCount > 0) {
            System.out.println("Item is released.");
            itemCount--;
        }
    }
}
