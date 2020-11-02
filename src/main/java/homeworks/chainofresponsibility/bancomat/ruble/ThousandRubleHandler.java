package homeworks.chainofresponsibility.bancomat.ruble;

import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

public class ThousandRubleHandler extends RubleHandlerBase {

    public ThousandRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 1000;

    @Override
    protected int getValue() {
        return value;
    }
}
