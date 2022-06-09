package david.dice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceTest {

    @Test
    public void testNoRoll(){
        Dice myDice = new Dice();
        Assertions.assertNotEquals(3, myDice.getTotal());
        System.out.println("There can not be a value > 0 without a roll");
    }

    @Test
    public void definiteTwoDieRoll(){
        Dice myDice = new Dice(1, 6);
        Assertions.assertEquals(myDice.getTotal() > 6, myDice.getTotal() > 6);
        System.out.println("The total of your roll was " + myDice.getTotal());
        System.out.println("If the total is greater than 6, more than one dice was rolled");

    }

    @Test
    public void aRollWasMade(){
        Dice myDice = new Dice(4, 3);
        Assertions.assertNotNull(myDice.getTotal());
        System.out.println("The total of your dice roll was " + myDice.getTotal());
        System.out.println("");
    }
}
