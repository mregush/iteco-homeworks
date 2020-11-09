package homeworks.state;

public class CopyContext {

    public Integer depositMoney;

    public String selectedDevice;

    public String document;

    public String printDocument;

    public boolean printMore;

    public Integer takeMoney;

    public CopyState state;

    public CopyContext(Integer depositMoney, String selectedDevice, String document, String printDocument, boolean printMore, Integer takeMoney) {
        this.depositMoney = depositMoney;
        this.selectedDevice = selectedDevice;
        this.document = document;
        this.printDocument = printDocument;
        this.printMore = printMore;
        this.takeMoney = takeMoney;
        this.state = new DepositMoneyState();
    }

    public void depositMoney() {
        state.depositMoney(this);
    }

    public void deviceSelection() {
        state.deviceSelection(this);
    }

    public void documentSelection() {
        state.documentSelection(this);
    }

    public void documentPrinting() {
        state.documentPrinting(this);
    }

    public void needPrintMore() {
        state.needPrintMore(this);
    }

    public void takeMoney() {
        state.takeMoney(this);
    }

}
