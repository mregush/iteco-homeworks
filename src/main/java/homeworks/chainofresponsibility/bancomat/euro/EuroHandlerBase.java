package homeworks.chainofresponsibility.bancomat.euro;

import homeworks.chainofresponsibility.bancomat.banknote.Banknote;
import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;
import homeworks.chainofresponsibility.bancomat.banknote.CurrencyType;

public abstract class EuroHandlerBase extends BanknoteHandler {
    protected EuroHandlerBase(BanknoteHandler nextHandler) {
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
        if (banknote.getCurrency().equals(CurrencyType.EUR) && value % getValue() == 0) {
            return String.format("Выдаем %s евро", value);
        }
        return super.getMoney(banknote);
    }

    protected abstract int getValue();
}
