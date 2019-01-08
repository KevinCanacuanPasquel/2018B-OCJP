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
import java.util.*;
import java.text.*;

class DateTwo {
    public static void main(String[] args){
        Date d = new Date(1119280000000L);
        DateFormat df = DateFormat.getDateInstance(
                        DateFormat.LONG, Locale.GERMANY);
        System.out.println(df.format(d));
    }
}
