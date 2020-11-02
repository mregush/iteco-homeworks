package homeworks.chainofresponsibility.bancomat;


import homeworks.chainofresponsibility.bancomat.banknote.Banknote;
import homeworks.chainofresponsibility.bancomat.banknote.BanknoteHandler;
import homeworks.chainofresponsibility.bancomat.dollar.FiftyDollarHandler;
import homeworks.chainofresponsibility.bancomat.dollar.HundredDollarHandler;
import homeworks.chainofresponsibility.bancomat.dollar.TenDollarHandler;
import homeworks.chainofresponsibility.bancomat.euro.FiveHundredEuroHandler;
import homeworks.chainofresponsibility.bancomat.euro.HundredEuroHandler;
import homeworks.chainofresponsibility.bancomat.euro.ThousandEuroHandler;
import homeworks.chainofresponsibility.bancomat.ruble.TenRubleHandler;
import homeworks.chainofresponsibility.bancomat.ruble.ThousandRubleHandler;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {
    private BanknoteHandler handler;

    public Bancomat() {
        handler = new TenRubleHandler(null);
        handler = new ThousandRubleHandler(handler);
        handler = new TenDollarHandler(handler);
        handler = new FiftyDollarHandler(handler);
        handler = new HundredDollarHandler(handler);
        handler = new HundredEuroHandler(handler);
        handler = new FiveHundredEuroHandler(handler);
        handler = new ThousandEuroHandler(handler);
    }

    public boolean validate(String banknote) {
        return handler.validate(banknote);
    }

    public String getMoney(Banknote banknote) {
        try {
            return handler.getMoney(banknote);
        } catch (NullPointerException e) {
            System.out.println("Невалидная сумма");
        }
        return "Попробуйте снова";
    }

}
