package homeworks.state;

public class DocumentPrintingState extends CopyStateBase {

    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void deviceSelection(CopyContext context) {
        throw new RuntimeException("Device selection for printing");
    }

    @Override
    public void documentSelection(CopyContext context) {
        throw new RuntimeException("Select document for printing");
    }

    @Override
    public void documentPrinting(CopyContext context) {
        System.out.println("Document printed :" + context.printDocument);
        context.state = new NeedPrintMoreState();
    }

    @Override
    public void needPrintMore(CopyContext context) {
        throw new RuntimeException("Printed previous document!");
    }
}
