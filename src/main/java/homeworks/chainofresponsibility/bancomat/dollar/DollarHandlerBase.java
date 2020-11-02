package homeworks.chainofresponsibility.bancomat.dollar;


import homeworks.chainofresponsibility.bancomat.banknote.Banknote;
import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;
import homeworks.chainofresponsibility.bancomat.banknote.CurrencyType;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class DollarHandlerBase extends BanknoteHandler {
    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean validate(String banknote) {
        if (banknote.equals(String.valueOf(getValue()))) {
            return true;
        }
        return super.validate(banknote);
    }

    @Override
    public String getMoney(Banknote banknote) {
        int value = Integer.parseInt(banknote.getValue());
        if (banknote.getCurrency().equals(CurrencyType.USD) && value % getValue() == 0) {
            return String.format("Выдаем %s долларов", value);
        }
        return super.getMoney(banknote);
    }

    protected abstract int getValue();
}
