package homeworks.chainofresponsibility.bancomat.banknote;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean validate(String banknote) {
        return nextHandler != null && nextHandler.validate(banknote);
    }

    public String getMoney(Banknote banknote) {
        return nextHandler.getMoney(banknote);
    }
}
