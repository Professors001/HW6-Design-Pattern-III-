package Class;

import Class.Duck.*;
import Class.Factory.AbstractDuckFactory;
import Class.Factory.CountingDuckFactory;
import Class.Factory.DuckFactory;
import Class.Factory.PoliteDuckFactory;
import Class.Goose.Goose;
import Class.Goose.GooseAdapter;
import Class.Pigeon.Pigeon;
import Class.Pigeon.PigeonAdapter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory politeDuckFactory = new PoliteDuckFactory();
        simulator.simulate(countingDuckFactory);
//        simulator.simulate(countingDuckFactory);
//        simulator.simulate(politeDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeon);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);

        Flock flockOfNonDucks = new Flock();

        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon1 = new PigeonAdapter(new Pigeon());
        Quackable pigeon2 = new PigeonAdapter(new Pigeon());

        flockOfNonDucks.add(goose);
        flockOfNonDucks.add(pigeon1);
        flockOfNonDucks.add(pigeon2);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nDuck Simulator: Non Duck Flock Simulation");
        simulate(flockOfNonDucks);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}
//6510451085 Aphisit Prasertvesyakorn