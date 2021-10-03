/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tugas1;

/**
 *
 * @author Putri Merly Deleo Karina
 */

import javax.swing.JOptionPane; 

public class SwitchCase {      

    public static void main(String[] args){
        
        int pilihan;            
        int a;                  
        int b;                  
        int awal=1;             
        int kedua=1;            
        int n;                  
        int banyak;             
        int bil;                
        int hitung = 1;         
        int Un =0;              
        int faktorial =1;       
        
        System.out.println("---------------------------------------------");        
        System.out.println("           PROGRAM DERET MATEMATIKA");                  
        System.out.println("---------------------------------------------\n");      
        
        System.out.println("Pilihan Perhitungan Deret Matematika : "                
                + "\n1. Deret fibonacci\n2. Deret Aritmatika"                       
                + "\n3. Faktorial\n");                                              

        String input = JOptionPane.showInputDialog("Pilihan Perhitungan Deret Matematika : "        
                + "\n1. Deret fibonacci\n2. Deret Aritmatika"                      
                + "\n3. Faktorial\nInput Pilihan : ");                             
        pilihan = Integer.parseInt(input);                                         
        
        switch(pilihan){                                                           
            
            case 1:                                                                
                System.out.println("--------------------------------------------");     
                System.out.println("    Pilihan[1] : Program Deret Fibonacci");         
                System.out.println("--------------------------------------------");     
                input = JOptionPane.showInputDialog("Input Bilangan Pertama : ");       
                awal = Integer.parseInt(input);                                         

                input = JOptionPane.showInputDialog("Input Bilangan Kedua : ");         
                kedua = Integer.parseInt(input);                                        

                input = JOptionPane.showInputDialog("Input Banyak Baris : ");           
                banyak = Integer.parseInt(input);                                       

                System.out.println("\nBilangan Pertama    : "+awal);                    
                System.out.println("Bilangan Kedua      : "+kedua);                     
                System.out.println("Banyak Baris        : "+banyak);                    

                System.out.println();
                System.out.println("Baris Fibonacci : ");                               
                System.out.println();

                for(int i = 0; i< banyak; i++){                                         
                    
                    hitung = awal+kedua;                                      
                    awal = kedua;                                             
                    kedua = hitung;                                           
                    System.out.print(hitung +"\n");                           
                    if(hitung>500){                                           
                        System.out.println("\t\t ==\tNilai > 500");
                    }else if(hitung<0){
                        System.out.println("\t\t ==\tNilai < 0");             
                    }else{
                        System.out.println("\t\t ==\t0 < Nilai < 500");       
                    }
                }
                
                System.out.println("\n");
            break;
            
            case 2:                                                                   
                System.out.println("--------------------------------------------");   
                System.out.println("    Pilihan[2] : Program Deret Aritmatika");      
                System.out.println("--------------------------------------------");            
                input = JOptionPane.showInputDialog("Input Bilangan Pertama : ");     
                a = Integer.parseInt(input);                                          

                input = JOptionPane.showInputDialog("Input Beda Bilangan : ");        
                b = Integer.parseInt(input);                                          

                input = JOptionPane.showInputDialog("Input Banyak Baris : ");         
                n = Integer.parseInt(input);                                          
                
                System.out.println("Bilangan Pertama    : "+a);                       
                System.out.println("Beda bilangan       : "+b);                       
                System.out.println("Banyak Baris        : "+n);                       

                System.out.println();
                System.out.println("Baris Aritmatika : ");                            
                System.out.println();
                
                Un = (a +((n-1)*b));                                                  
                for(int i =0; i< n; i++){                                             
                    System.out.print(a+" ");                                          
                    a+=b;                                                             
                    if((a+b) <= 0){                                                   
                        System.out.println("\t\t ==\tNilai < 0");
                    }
                    else if((a+b) >= 600){                                            
                        System.out.println("\t\t ==\tNilai > 500");
                    }else{                                                            
                        System.out.println("\t\t ==\t0 < Nilai < 500");
                    }
                }
                System.out.println("\n");
                System.out.println("Deret Aritmatika ke - "+n+" : "+Un);              
                
                System.out.println("\n");                
            break;
            
            case 3:                                                                    
                System.out.println("--------------------------------------------");    
                System.out.println("         Pilihan : Program Faktorial");            
                System.out.println("--------------------------------------------");    
                input = JOptionPane.showInputDialog("Input angka : ");                 
                bil = Integer.parseInt(input);                                         
                for(int i=0; i<bil;i++){                                               
                    faktorial += faktorial*i;                                          
                }
                System.out.println("\n");
                System.out.println("Nilai dari " +bil+ " ! = "+ faktorial);            
                System.out.println();
                if(faktorial < 0){                                                     
                    System.out.println("Nilai "+bil+ " ! < 0");
                }else if(faktorial > 500){                                             
                    System.out.println("Nilai "+bil+ " ! > 500");
                }else{                                                               
                    System.out.println(" 0 < Nilai "+bil+ " ! < 500");
                }                
            break;
            
            default:                                                                 
                System.out.println("Inputan Anda salah !!!");
            break;
        }
    }
}
