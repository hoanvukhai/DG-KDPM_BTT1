/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class mavenproject2Test2 {
    
    Mavenproject2 simpleMath = new Mavenproject2();

    @Test
    public void testAdd() {
        assertEquals(5, simpleMath.add(2, 3));
        assertEquals(-1, simpleMath.add(2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, simpleMath.subtract(2, 3));
        assertEquals(5, simpleMath.subtract(8, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, simpleMath.multiply(2, 3));
        assertEquals(-6, simpleMath.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, simpleMath.divide(6, 3));
        assertEquals(-2.5, simpleMath.divide(-5, 2));
        assertThrows(IllegalArgumentException.class, () -> simpleMath.divide(6, 0));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(5, simpleMath.add(5, 0));
        assertEquals(-3, simpleMath.add(-3, 0));
        assertEquals(10, simpleMath.add(0, 10));
    }
    
}
