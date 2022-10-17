/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author user
 */
class hewan{
    public void suara(){
        System.out.println("Hewan Bersuara : ");
    }
}

class kuda extends hewan{
    public void suara(){
        System.out.println("Kuda mengikik...");
    }
}

class kucing extends hewan{
    public void suara(){
        System.out.println("Kucing mengeong...");
    }
}

class ayam extends hewan{
    public void suara(){
        System.out.println("Ayam Berkokok...");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        hewan HEWAN = new hewan();
        kuda KUDA = new kuda();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
    }
}
