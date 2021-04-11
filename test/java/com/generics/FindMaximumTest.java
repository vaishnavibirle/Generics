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

    //testing max for float values at position
    @Test
    public void given3Float_whenGiven_ShouldReturnFirstFloatMax(){
        Float findMax = findMaximum.testMax(10.4f,7.2f,5.5f);
        Assertions.assertEquals( 10.4,findMax ,0.001);
    }

    @Test
    public void given3Float_whenGiven_ShouldReturnSecondFloatMax(){
        Float findMax = findMaximum.testMax(5.5f,10.4f,7.2f);
        Assertions.assertEquals( 10.4,findMax ,0.001);

    }

    @Test
    public void given3Float_whenGiven_ShouldReturnThirdFloatMax(){
        Float findMax = findMaximum.testMax(5.5f,7.2f,10.4f);
        Assertions.assertEquals( 10.4f,findMax,0.001);
    }
}
