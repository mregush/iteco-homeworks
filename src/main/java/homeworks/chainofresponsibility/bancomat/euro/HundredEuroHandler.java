package homeworks.chainofresponsibility.bancomat.euro;

import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

public class HundredEuroHandler extends EuroHandlerBase {

    public HundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 100;

    @Override
    protected int getValue() {
        return value;
    }
}
