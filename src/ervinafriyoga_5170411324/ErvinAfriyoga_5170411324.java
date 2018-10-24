/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ervinafriyoga_5170411324;

import java.util.Scanner;

/**
 *
 * @author x
 */
public class ErvinAfriyoga_5170411324 {

    /**
     * @param args the command line arguments
     */
     public static void main (String[]args){
        
        int change;
        Scanner s= new Scanner (System.in);
        
        for (change=1; change<=3; change++)
        {
            
            System.out.println("1.Input Data");
            System.out.println("2.Tampilkan Data");
            System.out.println("3.Keluar");
            System.out.print("Pilihan   :"); change=s.nextInt();
        }
    }
}