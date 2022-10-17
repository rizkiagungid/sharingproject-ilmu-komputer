/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanOperator;

/**
 *
 * @author user
 */
public class OptPembanding {
    public static void main(String[] args){
        int a, b, c, d, e, f;
        boolean aa, bb, cc, dd, ee, ff;
        a = 5; b = 6; c =3; d = 9; e = 8; f = 2;
        
        aa = a==b;
        bb = b>c;
        cc = c<d;
        dd = d>=e;
        ee = e<=f;
        ff = b!=a;
        
        System.out.println("Apakah "+a+" == "+b+"? Jawabannya adalah "+aa);
        System.out.println("Apakah "+b+" > "+c+"? Jawabannya adalah "+bb);
        System.out.println("Apakah "+c+" < "+d+"? Jawabannya adalah "+cc);
        System.out.println("Apakah "+d+" >= "+e+"? Jawabannya adalah "+dd);
        System.out.println("Apakah "+e+" <= "+f+"? Jawabannya adalah "+ee);
        System.out.println("Apakah "+f+" != "+a+"? Jawabannya adalah "+ff);
    }
}
