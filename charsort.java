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
public class charsort {
    public static void main(String args[])
    {
        String s="SOPANASUNDARI";
        int key,j;
        //int arr[]=new int[s.length()];
        char[] c=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
        
        //int asci=(int)c;
        //arr[i]=c;
        //}
        //for(int i=1;i<arr.length;i++)
        //{
           key=c[i];//arr[i];
           j=i-1;
           while(j>=0&&c[j]>key)
           {
               c[j+1]=c[j];
               j=j-1;
           }
           c[j+1]=(char)key;
        }
        for(int i=0;i<c.length;i++)
        {
            //char asc=(char)arr[i];
            System.out.print(c[i]+" ");
        }
    }
    
}
