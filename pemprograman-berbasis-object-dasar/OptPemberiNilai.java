/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanOperator;

/**
 *
 * @author user
 */
public class OptPemberiNilai {
    public static void main(String[] args){
        int a, c, d, e;
        double b;
        a = 3; b = 5; c = 13; d = 4; e = 6;
        
        // Penggunaan assigment operator
        a *=2;
        b /=2;
        c %=2;
        d +=2;
        e -=2;
        
        System.out.println("Nilai dari a*=2 adalah "+a);
        System.out.println("Nilai dari b/=2 adalah "+b);
        System.out.println("Nilai dari c%=2 adalah "+c);
        System.out.println("Nilai dari d+=2 adalah "+d);
        System.out.println("Nilai dari e-=2 adalah "+e);
    }
}
