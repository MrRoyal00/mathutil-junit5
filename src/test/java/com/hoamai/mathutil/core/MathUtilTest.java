/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hoamai.mathutil.core;

import static com.hoamai.mathutil.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Manh.D.Nguyen
 */
public class MathUtilTest {
    //Choi DDT
    public static Object[][] initData(){
        return new Integer[][]{
            {1, 1},{2, 2},{3, 6},{5, 120},{6, 20}  
        };
    }
    
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
//    @Test
//    public void testGetFGivenRightArgReturnsWell(){
//        assertEquals(24, getFactorial(4));
//    }
    
    @Test
    public void testGetFGivenWrongArgThrowException(){
        //Cach lam cham
//        Executable exObj = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
        //toan tu lamda
        assertThrows(IllegalArgumentException.class, 
                () -> getFactorial(-5));
    }
}
