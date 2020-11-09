package homeworks.state;

public class DepositMoneyState extends CopyStateBase {

    @Override
    public void depositMoney(CopyContext context) {
        System.out.println("Money deposited : " + context.depositMoney);
        context.state = new DeviceSelectionState();
    }

    @Override
    public void deviceSelection(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void documentSelection(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void documentPrinting(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void needPrintMore(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }
}
