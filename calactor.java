/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_20190063;

/**
 *
 * @author ahmed
 */
public class Calculator_20190063 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String op = scan.next();
        if (op.equalsIgnoreCase("+")) {
            System.out.println("total = "+(num1 + num2));
        } else if (op.equalsIgnoreCase("-")) {
            System.out.println("total = "+(num1 - num2));
        } else if (op.equalsIgnoreCase("*")) {
            System.out.println("total = "+(num1 * num2));
        } else if (op.equalsIgnoreCase("/")) {
            System.out.println("total = "+(num1 / num2));
        }
    }
    
}
