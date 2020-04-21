class Kendaraan{
 boolean mesin; 
int kapasitas;
void jalan(){
 System.out.println("kendaraan dijalankan"); 
}
void berhenti(){}
}
class Mobil extends Kendaraan{ 
void jalan(){
 System.out.println("masukkan kunci"); 
System.out.println("putar kunci"); 
System.out.println("injak gas"); }
public static void main(String args[]){ 
Mobil sedan = new Mobil(); 
sedan.jalan(); 
}
