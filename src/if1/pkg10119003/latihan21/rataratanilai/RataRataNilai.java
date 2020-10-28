/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119003.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung 
 * rata-rata dari nilai serta jumlah mahasiswa
 */
public class RataRataNilai {
    static Scanner scan = new Scanner(System.in);
    int jumlah;
    int nilai[];        
    
    /**
     * @param args the command line arguments
     */    
    
    private void masukkanJumlah(){
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        jumlah = scan.nextInt();            
    }
    
    private void masukkanNilai(){   
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");                        
            nilai[i] = scan.nextInt();
        }
    }
    
    private double hitungRataRata(){
        double hasil = 0;        
        for(int x : nilai){
            hasil += x;            
        }        
        hasil = hasil / nilai.length;
        return hasil;
    }   
    
    private void tampilRataRata(double rata){                
        System.out.println("Rata-rata Nilainya adalah "+rata);
    }        
       
    public static void main(String[] args) {
        // TODO code application logic here      
        RataRataNilai data = new RataRataNilai();        
        data.masukkanJumlah();
        data.masukkanNilai();        
        data.tampilRataRata(data.hitungRataRata());
        System.out.println("Developed by : Ivan Faathirza");        
    }
    
}
