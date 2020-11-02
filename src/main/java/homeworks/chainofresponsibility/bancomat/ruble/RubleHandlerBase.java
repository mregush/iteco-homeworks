package homeworks.chainofresponsibility.bancomat.ruble;

import homeworks.chainofresponsibility.bancomat.banknote.Banknote;
import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;
import homeworks.chainofresponsibility.bancomat.banknote.CurrencyType;

public abstract class RubleHandlerBase extends BanknoteHandler {
    protected RubleHandlerBase(BanknoteHandler nextHandler) {
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
        if (banknote.getCurrency().equals(CurrencyType.RUB) && value % getValue() == 0) {
            return String.format("Выдаем %s рублей", value);
        }
        return super.getMoney(banknote);
    }

    protected abstract int getValue();
}
