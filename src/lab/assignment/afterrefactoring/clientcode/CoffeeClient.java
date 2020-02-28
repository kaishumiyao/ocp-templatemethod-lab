package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.AmericanoMaker;
import lab.assignment.afterrefactoring.MochaMaker;
import lab.assignment.afterrefactoring.CapuccinoMaker;

public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeMaker starbuzz = new CoffeeMaker();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new MochaMaker();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.prepareCoffee();

    }

}
