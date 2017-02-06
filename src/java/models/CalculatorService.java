/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author kanst_000
 */
public class CalculatorService {
    public double getRectangleArea(String l, String w) throws NumberFormatException{
        double length = 0;
        double width = 0;
        try {
        length = Double.parseDouble(l);
        width = Double.parseDouble(w);
        } catch(NumberFormatException e){
            throw new NumberFormatException();
        }
        return length*width;
    }
    
    public double getCircleRadius(String type, String size) throws NumberFormatException{
        double s = 0;
        try {
        s = Double.parseDouble(size);
        } catch(NumberFormatException e){
            throw new NumberFormatException();
        }
        
        return "radius".equals(type) ? s : s/2;
    }
    
    public double getCircleArea(String type, String size){
        double s = getCircleRadius(type, size);
        
        return Math.PI * Math.pow(s, 2);
    }
    
    public double getTriangleArea(String l, String w){
        double length = 0;
        double width = 0;
        try {
        length = Double.parseDouble(l);
        width = Double.parseDouble(w);
        } catch(NumberFormatException e){
            throw new NumberFormatException();
        }
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width,2));
    }
}
