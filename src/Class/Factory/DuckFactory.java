package Class.Factory;

import Class.Duck.*;

public class DuckFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
//6510451085 Aphisit Prasertvesyakorn