package homeworks.chainofresponsibility.bancomat;

import homeworks.chainofresponsibility.bancomat.banknote.Banknote;
import homeworks.chainofresponsibility.bancomat.banknote.CurrencyType;

import java.util.Scanner;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        System.out.println(bancomat.validate("100"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую валюту : RUB, EUR, USD и сумму");
        Banknote banknote = new Banknote(CurrencyType.valueOf(scanner.next()), scanner.next());
        System.out.println(bancomat.getMoney(banknote));

    }
}
