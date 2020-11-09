package homeworks.state;

public class NeedPrintMoreState extends CopyStateBase {
    @Override
    public void depositMoney(CopyContext context) {

    }

    @Override
    public void deviceSelection(CopyContext context) {

    }

    @Override
    public void documentSelection(CopyContext context) {

    }

    @Override
    public void documentPrinting(CopyContext context) {

    }

    @Override
    public void needPrintMore(CopyContext context) {
        if (context.printMore) {
            context.state = new DocumentSelectionState();
        } else {
            context.state = new TakeMoneyState();
        }
    }
}
