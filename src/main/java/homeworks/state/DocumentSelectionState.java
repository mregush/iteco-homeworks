package homeworks.state;

public class DocumentSelectionState extends CopyStateBase {
    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void deviceSelection(CopyContext context) {
        throw new RuntimeException("Selected device!");
    }

    @Override
    public void documentSelection(CopyContext context) {
        System.out.println("Selected document : " + context.document);
        context.state = new DocumentPrintingState();
    }

    @Override
    public void documentPrinting(CopyContext context) {
        throw new RuntimeException("Select document for printing!");
    }

    @Override
    public void needPrintMore(CopyContext context) {
        throw new RuntimeException("Select document for printing!");
    }
}
