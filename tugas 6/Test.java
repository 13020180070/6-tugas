
//Class Test untuk mendemonstrasikan polymorphism
public class Test {
 
 public static void main(String[] args) {
  
  //Mendeklarasikan array dengan tipe Manusia.
  //Dengan kata lain sebagai array yang memegang objek dari
  //tipe manusia
  Manusia [] manusia = new Manusia [4];
  
  //Perhatikan, anda bisa menyimpan subclass apa saja dari
  //tipe Manusia di dalam array Manusia.
  manusia[0] = new Siswa();
  manusia[1] = new Karyawan();
  manusia[2] = new Programmer();
  manusia[3] = new Professor();
  
  //Sekarang, ketika anda melakukan loop
  //terhadap array tersebut, dan memanggil method dari class Manusia
  //maka setiap objek akan melakukan hal yang benar atau
  //objek akan menggunakan method yang ada di classnya masing-masing!
  for (int i = 0; i < manusia.length; i++){
   manusia[i].makan();
   manusia[i].tidur();
   manusia[i].bergerak();
   System.out.println();
  }
  
 }
 
}