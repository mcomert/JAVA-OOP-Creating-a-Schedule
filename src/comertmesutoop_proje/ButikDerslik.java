package comertmesutoop_proje;

import java.util.ArrayList;

/**
 * Derslik sınıfıntan inheritance edilmiş ButikDerslik sınıfı ve türetilecek nesnelerin özelliklerini ve metodlarını içeren sınıf.
 * @author Comert, Mesut 13.05.2018
 */
public class ButikDerslik extends Derslik{
    
    static ArrayList<String> butikDerslikListesi = new ArrayList();
    
    /**
     * Derslik sınıfından inheritance edilmiş ButikDerslik sınıfının iki parametreli constructorı.
     * @param derslikKodu
     * @param derslikKapasitesi 
     */
    public ButikDerslik(String derslikKodu, int derslikKapasitesi) {
        super(derslikKodu, derslikKapasitesi);
        ButikDerslik.butikDerslikListesi.add(derslikKodu);
        if(Derslik.derslikListesi.contains(derslikKodu)){
            Derslik.derslikListesi.remove(derslikKodu);
        }
    }
    
    /**
     * ButikDerslik sınıfı için KapasiteArttır metodu Superclass'ından inheritance olmuştur.
     * Butikdersliklerde bir sıra-masa kombinasyonu için 4 kişilik bir kapasite artışı düşünülmüştür.
     * Dolayısıyla bu metod bu sınıfta Override edilmiştir.
     */
    @Override
    public void KapasiteArttır(){
        
        derslikKapasitesi += 3;
        System.out.println("Yeni derslik kapasitesi: " + derslikKapasitesi);
    }
  
}
