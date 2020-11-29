/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan61.bangunruang;

/**
 *
 * @author korik
 */
public class Bola extends BangunRuang {
    
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
       return (4 * 3.14 * r * r * r * r) / 3;
    }
    
}