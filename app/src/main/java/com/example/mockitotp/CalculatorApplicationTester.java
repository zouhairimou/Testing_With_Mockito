package com.example.mockitotp;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.JUnit.MockitoJUnitRunner;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTester {

    @InjectMocks
    CalculatorApplication calculatorApplication = new CalculatorApplication();

    @Mock
    CalculatorService calcService;
    @Test
    public void testAdd(){

        when(calcService.add(10.0,20.0)).thenReturn(30.00);

        Assert.assertEquals(calculatorApplication.add(10.0, 20.0),30.0,0);
    }
}
