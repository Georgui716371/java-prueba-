/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas.Estatica;

import java.util.Arrays;

public class ArreglosYMatrices {

    public static void main(String[] args) {
        //array is defined
        Object[] objeto = new Object[3];
        Object[] objetoCopia = new Object[3];

        objeto[0] = "Hello World";
        objeto[1] = "Hola mundo";
        
        // For each
//        for (Object objeto1 : objeto) {
//            System.out.println(objeto1);
//        }


        objetoCopia=objeto.clone();
         for (Object objeto1 : objetoCopia) {
            System.out.println(objeto1);
        } 
                 
         
         if(Arrays.equals(objetoCopia, objeto)){
             System.out.println("Son iguales");
         }
         //                 origen      desde posicion  vector a copiar desde donde a donde 
         System.arraycopy(objeto, 0, objetoCopia, 0, 4);
        
         
        
        
//        int array [][]= new int[3][3];
//        
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//              
//                 int n =(int)(Math.random()*10)+1;
//                 array[j][i]=n;
//            }
//               
//        }
//        
//        for (int[] is : array) {
//            for (int i : is) {
//                System.out.print(i+" ");
//            }
//             System.out.println(" ");
//        }
        
    }
}
