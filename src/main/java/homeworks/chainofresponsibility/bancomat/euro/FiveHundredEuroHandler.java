package homeworks.chainofresponsibility.bancomat.euro;

import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

public class FiveHundredEuroHandler extends EuroHandlerBase {

    public FiveHundredEuroHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    protected int value = 500;

    @Override
    protected int getValue() {
        return value;
    }
}
