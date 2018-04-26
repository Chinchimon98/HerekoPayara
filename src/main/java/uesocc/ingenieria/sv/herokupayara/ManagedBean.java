/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.sv.herokupayara;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
 
@Named
@ViewScoped
public class ManagedBean implements Serializable{
   
    private int number;
 
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}
