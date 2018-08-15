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
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
        char c=s.charAt(i);
        int asci=(int)c;
        arr[i]=c;
        }
        for(int i=1;i<arr.length;i++)
        {
           key=arr[i];
           j=i-1;
           while(j>=0&&arr[j]>key)
           {
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++)
        {
            char asc=(char)arr[i];
            System.out.print(asc+" ");
        }
    }
    
}
