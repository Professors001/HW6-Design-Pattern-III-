package Class.Factory;

import Class.Duck.*;

public class PoliteDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new PoliteQuack(new MallardDuck());
    }

    public Quackable createRubberDuck() {
        return new PoliteQuack(new RubberDuck());
    }

    public Quackable createDuckCall() {
        return new PoliteQuack(new DuckCall());
    }

    public Quackable createRedheadDuck() {
        return new PoliteQuack(new RedheadDuck());
    }
}
//6510451085 Aphisit Prasertvesyakorn