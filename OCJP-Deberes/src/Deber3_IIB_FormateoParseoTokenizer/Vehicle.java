/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber3_IIB_FormateoParseoTokenizer;

/**
 *
 * @author kfc0_
 */
import java.io.*;
class Vehicle { }  
class Wheels { } 
class Car extends Vehicle implements Serializable {  } 
class Ford extends Car { } 
class Dodge extends Car { 
    Wheels w = new Wheels();
}
