/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**-
 * 0,
 * 
 *
 * @author mehre
 */
public class Calculator {
    
    public static int increase (int a){
    int b= a+2;
    return b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println("Enter a int and get an other int with 2 addition: ");
        Scanner input= new Scanner(System.in);
        
        int a= input.nextInt();
        int b= increase(a);
        System.out.println(b);

        // TODO code application logic here
       
    }
    public static int decrease(int n){
        return n-(n*100);

    }
    
}
