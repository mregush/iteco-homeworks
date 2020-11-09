package homeworks.state;

public abstract class CopyStateBase implements CopyState {

    @Override
    public abstract void depositMoney(CopyContext context);

    @Override
    public abstract void deviceSelection(CopyContext context);

    @Override
    public abstract void documentSelection(CopyContext context);

    @Override
    public abstract void documentPrinting(CopyContext context);

    @Override
    public abstract void needPrintMore(CopyContext context);

    @Override
    public void takeMoney(CopyContext context) {
        context.state = new TakeMoneyState();
    }
}
