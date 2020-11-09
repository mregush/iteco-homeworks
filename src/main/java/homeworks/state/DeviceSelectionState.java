package homeworks.state;

public class DeviceSelectionState extends CopyStateBase {

    @Override
    public void depositMoney(CopyContext context) {
        throw new RuntimeException("Deposit money for printing!");
    }

    @Override
    public void deviceSelection(CopyContext context) {
        System.out.println("Device selected :" + context.selectedDevice);
        context.state = new DocumentSelectionState();
    }

    @Override
    public void documentSelection(CopyContext context) {
        throw new RuntimeException("Select device for printing!");
    }

    @Override
    public void documentPrinting(CopyContext context) {
        throw new RuntimeException("Select device for printing!");
    }

    @Override
    public void needPrintMore(CopyContext context) {
        throw new RuntimeException("Select device for printing!");
    }
}
