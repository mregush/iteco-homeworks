package homeworks.state;

public interface CopyState {

    void depositMoney(CopyContext context);

    void deviceSelection(CopyContext context);

    void documentSelection(CopyContext context);

    void documentPrinting(CopyContext context);

    void needPrintMore(CopyContext context);

    void takeMoney(CopyContext context);

}
