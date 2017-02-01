/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static java.lang.System.out;

/**
 *
 * @author kanst_000
 */
public class RectangleService {
    public double getArea(String l, String w) throws NumberFormatException{
        double length = 0;
        double width = 0;
        try {
        length = Double.parseDouble(l);
        width = Double.parseDouble(w);
        } catch(NumberFormatException e){
            out.print(e);
        }
        return length*width;
    }
}
