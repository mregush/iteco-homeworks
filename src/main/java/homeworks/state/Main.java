package homeworks.state;

public class Main {

    public static void main(String[] args) {

        CopyContext copyContext = new CopyContext(
                100,
                "Wi-fi" ,
                "MyDocument.txt",
                "This is my document",
                false,
                50);
        copyContext.depositMoney();
        copyContext.deviceSelection();
        copyContext.documentSelection();
        copyContext.documentPrinting();
        copyContext.needPrintMore();
        copyContext.takeMoney();
        System.out.println();

        CopyContext copyContextError = new CopyContext(
                100,
                "Wi-fi" ,
                "MyDocument.txt",
                "This is my document",
                false,
                50);
        copyContextError.documentSelection();

    }


}
