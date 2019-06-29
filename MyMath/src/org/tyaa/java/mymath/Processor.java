/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.java.mymath;

/**
 *
 * @author student
 */
public class Processor {
    
    public static ComplexNumber add(ComplexNumber x, ComplexNumber y){
        return new ComplexNumber(x.getReal() + y.getReal(), x.getImg() + y.getImg());
    }
    
    public static ComplexNumber subs(ComplexNumber x, ComplexNumber y){
        return new ComplexNumber(x.getReal() - y.getReal(), x.getImg() - y.getImg());
    }
}
