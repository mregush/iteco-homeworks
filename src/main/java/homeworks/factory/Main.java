package homeworks.factory;

import homeworks.factory.audi.AudiFactory;
import homeworks.factory.bmw.BmwFactory;
import homeworks.factory.lada.LadaFactory;
import homeworks.factory.mercedes.MercedesFactory;


public class Main {
    public static void main(String[] args) {

        CarFactory audiFactory = new AudiFactory();
        Body audiBody = audiFactory.createBody("Hatch", "A6", "Black");
        Engine audiEngine = audiFactory.createEngine(250, "Diesel");
        Interior audiInterior = audiFactory.createInterior("SportInterior", "Red", "Leather");
        System.out.println("Мы построили новую Audi со следующими характеристиками: " + audiBody + audiEngine + audiInterior);

        CarFactory bmwFactory = new BmwFactory();
        Body bmwBody =  bmwFactory.createBody("Sedan", "540", "White");
        Engine bmwEngine = bmwFactory.createEngine(280, "Petrol");
        Interior bmwInterior =  bmwFactory.createInterior("Classic", "Black", "Leather");
        System.out.println("Мы построили новую BMW со следующими характеристиками: " + bmwBody + bmwEngine + bmwInterior);

        CarFactory ladaFactory = new LadaFactory();
        Body ladaBody = ladaFactory.createBody("Sedan", "2107", "Red");
        Engine ladaEngine = audiFactory.createEngine(80, "Petrol");
        Interior ladaInterior = audiFactory.createInterior("Classis", "Black", "Alcantra");
        System.out.println("Мы построили новую Lada со следующими характеристиками: " + ladaBody + ladaEngine + ladaInterior);

        CarFactory mercedesFactory = new MercedesFactory();
        Body mersBody = mercedesFactory.createBody("SUV", "G63", "Black");
        Engine mersEngine = mercedesFactory.createEngine(500, "Petrol");
        Interior mersInterior = mercedesFactory.createInterior("Sport", "Red", "Leather");
        System.out.println("Мы построили новый Mercedes со следующими характеристиками: " + mersBody + mersEngine + mersInterior);
    }
}
