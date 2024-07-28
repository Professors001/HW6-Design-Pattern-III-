package Class.Duck;

public class PoliteQuack implements Quackable{
    Quackable duck;
    static int duckCounter;

    public PoliteQuack(Quackable duck) {
        this.duck = duck;
        duckCounter++;
    }

    public void quack() {
        duck.quack();
        System.out.println("Ja");
    }

    public static int getPoliteDuckNumber() {
        return duckCounter;
    }
}
//6510451085 Aphisit Prasertvesyakorn