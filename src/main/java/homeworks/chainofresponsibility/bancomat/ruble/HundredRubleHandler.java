package homeworks.chainofresponsibility.bancomat.ruble;

import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

public class HundredRubleHandler extends RubleHandlerBase {
    protected HundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }


    protected int value = 100;

    @Override
    protected int getValue() {
        return value;
    }
}
