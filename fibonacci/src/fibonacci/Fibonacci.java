/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.math.BigInteger;

/**
 *
 * @author 0040482511005
 */
public class Fibonacci {

    public static void main(String[] args) {
        //        Fibonacci Without BigInteger
        //        long n[] = new long[100];
        //        long ultimo;
        //        long atual;
        //       
        //        n[0] = 0;
        //        n[1] = 1;
        //        for(int i = 2; i < n.length; i++){
        //            
        //            ultimo = n[i-2];
        //            atual = n[i-1];
        //            n[i] = ultimo + atual;
        //            
        //        }
        //        for(int i = 0; i < n.length; i++){
        //            
        //            System.out.println(n[i]);
        //            
        //        }

        BigInteger n[] = new BigInteger[100];
        BigInteger ultimo;
        BigInteger atual;

        n[0] = BigInteger.ZERO;
        n[1] = BigInteger.ONE;

        for (int i = 2; i < n.length; i++) {

            ultimo = n[i - 2];
            atual = n[i - 1];

            n[i] = ultimo.add(atual);
        }

        for (int i = 0; i < n.length; i++) {

            System.out.println(i+1 +": "+ n[i]);
        }
    }

}
