package ujianukl2;

public class Ujianukl2 {

    
    public static void hitungTabungan(int bulanPertama, int peningkatanPerBulan, int jumlahBulan) {
        int totalTabungan = 0; 
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
           
            int tabunganBulanIni = bulanPertama + (bulan - 1) * peningkatanPerBulan;

            
            System.out.println("Bulan ke-" + bulan + ": Rp" + tabunganBulanIni);

          
            totalTabungan += tabunganBulanIni;
        }

        
        System.out.println("\nTotal tabungan setelah " + jumlahBulan + " bulan: Rp" + totalTabungan);
    }

    public static void main(String[] args) {
        int bulanPertama = 100000; 
        int peningkatanPerBulan = 50000; 
        int jumlahBulan = 24; 

       
        hitungTabungan(bulanPertama, peningkatanPerBulan, jumlahBulan);
    }
}
