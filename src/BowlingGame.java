import java.util.ArrayList;
import java.util.List;

class BowlingGame {

    private int[][] rolls = new int[11][2];
    private int frame = 0;
    private int roll = 0;

    void roll(int pins) {
        if (roll > 1){
            frame++;
            roll=0;
        }
        if(frame > 11)
            throw new IllegalStateException("Cannot roll after game is over");

        rolls[frame][roll] = pins;
        roll++;

        if (pins == 10)
            roll++;
    }

    int score() {


    }
}


