package homeworks.chainofresponsibility.bancomat.ruble;


import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public class TenRubleHandler extends RubleHandlerBase {
    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

  protected int value = 10;

    @Override
    protected int getValue() {
        return value;
    }
}
