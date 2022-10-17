/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author user
 */
class Sepeda {
    int kecepatan;
    int gir;
    
    void ubahGir(int penambahanGir){
        gir = gir + penambahanGir;
        System.out.println("Gir : "+gir);
    }
    
    void tambahKecepatan(int pertambahanKecepatan){
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan : "+kecepatan);
    }
}
