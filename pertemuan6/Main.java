package pertemuan6;



import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
@Deprecated

public class Main {
   public static void main(String[] args) {
       File file = new File("C:/Users/M. Audya F/Documents/Java/test.java/src/database/daftarpersegi.txt");
       FileInputStream fis = null;
       BufferedInputStream bis = null;
       DataInputStream dis = null;
       List<persegi> listpersegi = new ArrayList<persegi>();
            
       try {
           fis = new FileInputStream(file);
           bis = new BufferedInputStream(fis);
           dis = new DataInputStream(bis);
           
           while(dis.available() != 0) {
               String line = dis.readLine();
               String[] data = line.split(",");                           
               
               persegi p = new persegi();
               p.setNamap(data[0]);
               int sisi = Integer.parseInt(data[1]);
               p.setsisi(sisi);
               int luas = Integer.parseInt(data[2]);
               p.setluas(luas);
               int keliling = Integer.parseInt(data[3]);
               p.setkeliling(keliling);
               listpersegi.add(p);    
            }
       } catch (Exception e) { //menampilkan business logic tidak dapat dikerjakan
           System.out.println("File "+file.getName()+" tidak ditemukan");
           System.out.println("Error "+e.getMessage());
       }
       
       Bangun b = new Bangun();
           b.setNama("Bangun Datar");
           System.out.println("Menghitung Luas dan Keliling "+b.getNama());

       for(persegi p : listpersegi) {
           System.out.println("===============================");
           System.out.println("Menghitung Luas dan Keliling : "+p.getNamap());
           System.out.println("Sisi                         : "+p.getsisi());
           System.out.println("Luas                         : "+p.getluas());
           System.out.println("Keliling                     : "+p.getkeliling());
       }


       File file2 = new File("C:/Users/M. Audya F/Documents/Java/test.java/src/database/daftarpersegipanjang.txt");
       FileInputStream fis2 = null;
       BufferedInputStream bis2 = null;
       DataInputStream dis2 = null;
       List<persegipanjang> listpersegipanjang = new ArrayList<persegipanjang>();
          
       try {//Memproses busines logic
           fis2 = new FileInputStream(file2);
           bis2 = new BufferedInputStream(fis2);
           dis2 = new DataInputStream(bis2);
           
           while(dis2.available() != 0) {
               String line = dis2.readLine();
               String[] data = line.split(",");
               
               persegipanjang pp = new persegipanjang();
               pp.setNamapp(data[0]);
               int panjang = Integer.parseInt(data[1]);
               pp.setpanjang(panjang);
               int lebar = Integer.parseInt(data[2]);
               pp.setlebar(lebar);
               int Luas = Integer.parseInt(data[3]);
               pp.setLuas(Luas);
               int Keliling = Integer.parseInt(data[4]);
               pp.setKeliling(Keliling);

               
               listpersegipanjang.add(pp);    
             
           }
       } catch (Exception e2) { //menampilkan business logic tidak dapat dikerjakan
           System.out.println("File "+file2.getName()+" tidak ditemukan");
           System.out.println("Error "+e2.getMessage());
       }
       
       System.out.println("\n");
           b.setNama("Bangun Datar");
           System.out.println("Menghitung Luas dan Keliling "+b.getNama());

       for(persegipanjang pp : listpersegipanjang) {
           System.out.println("===============================");
           System.out.println("Menghitung Luas dan Keliling : "+pp.getNamapp());
           System.out.println("Panjang                      : "+pp.getpanjang());
           System.out.println("Lebar                        : "+pp.getlebar());
           System.out.println("Luas                         : "+pp.getLuas());
           System.out.println("Keliling                     : "+pp.getKeliling());
       }
   }
  
}