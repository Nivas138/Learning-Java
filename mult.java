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
import java.util.Scanner;
public class mult {
    public static void main(String args[])
    {
    int mat1[][]=new int[50][50];
    int mat2[][]=new int[50][50];
    int res[][]=new int[50][50];
    int i,j,k,r1,c1,r2,c2,temp,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row for matrices1: ");
    r1=sc.nextInt();
    System.out.println("Enter column for matrices1: ");
    c1=sc.nextInt();
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
           System.out.println("Element: "+i+j);
           temp=sc.nextInt();
           mat1[i][j]=temp;
        }
    }
    System.out.println("Enter row for matrices2: ");
    r2=sc.nextInt();
    System.out.println("Enter column for matrices2: ");
    c2=sc.nextInt();
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
           System.out.println("Element: "+i+j);
           temp=sc.nextInt();
           mat2[i][j]=temp;
        }
    }
    sum=0;
    if(r2==c1)
    {
     for(i=0;i<r1;i++)
     {
      for(j=0;j<c2;j++)
      {
       for(k=0;k<r2;k++)
       {
        sum=sum+mat1[i][k]*mat2[k][j];
       }
       res[i][j]=sum;
       sum=0;
      }
     }
    }
    for(i=0;i<r1;i++)
    {
     for(j=0;j<c2;j++)
     {
         System.out.print(" "+res[i][j]+" ");
     }
     System.out.println();
    }
    }  
}
