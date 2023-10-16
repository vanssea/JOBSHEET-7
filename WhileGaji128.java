import java.util.Scanner;

public class WhileGaji128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totGajiLembur=0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan= scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) +": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur= scan.nextInt();

          
            if (jabatan.equalsIgnoreCase("direktur")) {
                i++;
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur*100000;
                 i++;

            }else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur =  jumlahJamLembur*75000;  
                i++;
                
            }else{
                System.out.println("Jabatan tidak valid. Silahkan Masukkan jabatan yang valid.");
                continue;
            }
            totGajiLembur+= gajiLembur;


            System.out.println(" Total gaji lembur:  " + totGajiLembur);

            
        }
    }
}
