/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanOperator;

/**
 *
 * @author user
 */
public class OptLogika {
    public static void main(String[] args){
        System.out.println("Operator AND");
        System.out.println("True && True = "+(true && true));
        System.out.println("True && False = "+(true && false));
        System.out.println("False && True = "+(false && true));
        System.out.println("False && False = "+(false && false));
        
        System.out.println("\nOperator OR");
        System.out.println("True || True = "+(true || true));
        System.out.println("True || False = "+(true || false));
        System.out.println("False || True = "+(false || true));
        System.out.println("False || False = "+(false || false));
        
        System.out.println("\nOperator IOR");
        System.out.println("True ^ True = "+(true ^ true));
        System.out.println("True ^ False = "+(true ^ false));
        System.out.println("False ^ True = "+(false ^ true));
        System.out.println("False ^ False = "+(false ^ false));
        
        System.out.println("\nOperator NOT");
        System.out.println("!True = "+(!true));
        System.out.println("!False = "+(!false));
    }
}
