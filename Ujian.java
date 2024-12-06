
package ujian;

import java.util.Scanner;

public class Ujian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
      
        int[] kehadiran = new int[jumlahSiswa];
        int totalHadir = 0;

        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa siswi ke-" + (i + 1) + ": ");
            kehadiran[i] = scanner.nextInt();
            totalHadir += kehadiran[i]; 
        }
        
     
        double rataRata = (double) totalHadir / jumlahSiswa;
        
       
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: 24 Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }
        
        
        System.out.println("\nRata-rata Kehadiran Siswa: " + rataRata + " hari");
        
       
        System.out.println("\nKesimpulan");
        System.out.println("Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        
        
        System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("- Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }
        
        
        scanner.close();
        int[] papa = {1,2,3};
        System.out.println(papa[1]);
    }
  }
 
