package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.formation.autre.Thing;
import com.formation.service.Calculator;

@SpringBootTest
class ApplicationTests {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
         assertEquals(5, calculator.sum(2, 3));
    }
    
    @Test
    public void testN() {
        Thing t = new Thing();
        t.setN(5);
        assertEquals( 5, t.getN());
    }
}