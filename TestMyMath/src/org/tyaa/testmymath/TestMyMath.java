/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.testmymath;

import org.tyaa.java.mymath.ComplexNumber;
import org.tyaa.java.mymath.Processor;

/**
 *
 * @author student
 */
public class TestMyMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComplexNumber cn1 = new ComplexNumber(12d, 5d);
        ComplexNumber cn2 = new ComplexNumber(10d, -1d);
        
        ComplexNumber cn3 = Processor.subs(cn1, cn2);
        
        System.out.println(cn3.getReal());
        System.out.println(cn3.getImg());
    }
    
}
