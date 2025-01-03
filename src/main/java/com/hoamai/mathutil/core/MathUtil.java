/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoamai.mathutil.core;

/**
 *
 * @author Manh.D.Nguyen
 */
public class MathUtil {
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 to 20");
        }
        if(n == 0 || n ==1) return 1;
        
        return n * getFactorial(n - 1);
    }
}
