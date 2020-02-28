package lab.assignment.afterrefactoring;

public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeMaker starbuzz = new AmericanoMaker();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new MochaMaker();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.prepareCoffee();

    }

}
