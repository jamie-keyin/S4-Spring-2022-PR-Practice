package david.dice;

import java.util.Random;

public class Dice {
    private int dice1;
    private int dice2;
    private int total;

    public Dice() {
        Random randNum = new Random();
        dice1 = randNum.nextInt(6) + 1;
        dice2 = randNum.nextInt(6) + 1;
    }

    public  Dice(int a, int b) {
        dice1 = a;
        dice2 = b;

    }

    public int getTotal(){
        total = dice1 + dice2;
        return total;
    }
}
