package homeworks.state;

public class TakeMoneyState extends CopyStateBase {


    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Take your money and deposit money again!");
    }

    @Override
    public void deviceSelection(CopyContext context) {
        throw new RuntimeException("Take your money and deposit money again!");
    }

    @Override
    public void documentSelection(CopyContext context) {
        throw new RuntimeException("Take your money and deposit money again!");
    }

    @Override
    public void documentPrinting(CopyContext context) {
        throw new RuntimeException("Take your money and deposit money again!");
    }

    @Override
    public void needPrintMore(CopyContext context) {
        throw new RuntimeException("Take your money and deposit money again!");
    }

    @Override
    public void takeMoney(CopyContext context) {
        System.out.println("Take your money : " + context.takeMoney);
        context.state = new DepositMoneyState();
    }
}
