package com.politecnica;

import org.junit.Test;

import javax.management.MXBean;

import static org.junit.Assert.assertEquals;

public class OPERATION_TEST {

    @Test
    public void SumGreaterThan10MustReturnSuccesfully(){
        //Given
        operation operation = new operation();

        //When
        int result = operation.suma(10,20);

        //Then
        assertEquals("La suma debe ser 30", 30, result);

    }

    @Test(expected = RuntimeException.class)
    public void SumLessThan10MustThrowException(){
        //Given:
        operation operation = new operation();

        //When:
        int result = operation.suma(1, 3);

        //Must throw an exception for result less than 10
    }

    @Bean
    public operation getOperation(){
        return new operation();
    }

}
