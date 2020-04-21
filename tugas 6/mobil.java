
public class honda extends mobil {
public void tampilkan(){
     double besarsilinder=5.5;
     String bahanbakar="Pertamax";
     String kategori="Sport";

     mobil m = new mobil();

     m.inputData("CRV", "Hitam", "Mewah", 4);
     m.tampilkandata();

      System.out.println("silinder :"+besarsilinder);
      System.out.println("jenis bahan bakar :"+bahanbakar);
      System.out.println("jenis kategori :"+kategori);
    
}    
}
