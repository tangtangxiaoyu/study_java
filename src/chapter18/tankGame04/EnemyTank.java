package chapter18.tankGame04;

import java.util.Vector;

public class EnemyTank extends Tank {
    Vector<Shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
