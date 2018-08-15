/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nivas
 */
import java.io.*;
import java.util.Arrays;
public class charsort2 {
   public static void main(String args[])
   {
       String s="SUNDAKAMPALAYAM";
       char[] c=s.toCharArray();
       Arrays.sort(c);
       Arrays.toString(c);
       System.out.println("Sorted: "+String.valueOf(c));
   }
}
