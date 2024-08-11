public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        // Test interactions
        vendingMachine.insertMoney();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        vendingMachine.insertMoney();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        // Try to use the machine when it's out of stock
        vendingMachine.insertMoney();
    }
}
