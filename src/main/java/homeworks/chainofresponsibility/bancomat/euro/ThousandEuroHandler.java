package homeworks.chainofresponsibility.bancomat.euro;

import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

public class ThousandEuroHandler extends EuroHandlerBase {

    public ThousandEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 1000;

    @Override
    protected int getValue() {
        return value;
    }
}
