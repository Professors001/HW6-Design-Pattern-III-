package Class;

import Class.Duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        for(int i = 0; i < quackers.size(); i++) {
            if(i == 0) {
                for(int j = 0; j < 3 ; j++) {
                    quackers.get(i).quack();
                }
            } else {
                quackers.get(i).quack();
            }
        }
    }

}
//6510451085 Aphisit Prasertvesyakorn