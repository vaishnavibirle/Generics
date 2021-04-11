package com.generics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindMaximumTest {

    FindMaximum findMaximum = new FindMaximum();
    //test case 1.1
    //returning value at position 1
    @Test
    public void given3Integers_whenGiven_ShouldReturnFirstIntegerMax(){
        Integer findMax = findMaximum.testMax(10,7,5);
        Assertions.assertSame( 10,findMax );
    }

    //test case 1.2
    //returning value at position 2
    @Test
    public void given3Integers_whenGiven_ShouldReturnSecondIntegerMax(){
        Integer findMax = findMaximum.testMax(5,10,7);
        Assertions.assertSame( 10,findMax );

    }

    //test case 1.3
    //returning value at position 3
    @Test
    public void given3Integers_whenGiven_ShouldReturnThirdIntegerMax(){
        Integer findMax = findMaximum.testMax(5,7,10);
        Assertions.assertSame( 10,findMax );
    }
}

