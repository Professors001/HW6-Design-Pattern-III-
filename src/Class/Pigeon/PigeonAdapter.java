package Class.Pigeon;

import Class.Duck.Quackable;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
//6510451085 Aphisit Prasertvesyakorn