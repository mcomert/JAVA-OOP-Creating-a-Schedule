package comertmesutoop_proje;

import java.util.ArrayList;

/**
 * Derslik sınıfı.
 * Bu sınıftan türetilecek olan nesnelerin özelliklerini ve metodlarını içeren sınıf.
 * @author Comert, Mesut 13.05.2018
 */
public class Derslik {
    
    String derslikKodu;
    int derslikKapasitesi;
    String []pzt = {null, null, null, null, null, null, null,null};
    String []sali = {null, null, null, null, null, null, null,null};
    String []crs = {null, null, null, null, null, null, null,null};
    String []prs = {null, null, null, null, null, null, null,null};
    String []cuma = {null, null, null, null, null, null, null,null};
    
    static ArrayList<String> derslikListesi = new ArrayList();
    
    /**
     * Derslik sınıfından türetilecek nesnenin iki parametreli constructorı. 
     * @param derslikKodu
     * @param derslikKapasitesi 
     */
    public Derslik(String derslikKodu, int derslikKapasitesi){
    
        this.derslikKodu = derslikKodu;
        this.derslikKapasitesi = derslikKapasitesi;
        Derslik.derslikListesi.add(derslikKodu);
    }   
    
    /**
     * Derslik sınıfından türetilmiş derslik nesnesinin kapasite değişkenini arttıran metoddur.
     * Dersliklerde bir sıra-masa kombinasyonu için 10 kişilik bir kapasite artışı düşünülmüştür.
     * Ancak bu artış Lab, Amfi ve ButikDerslik sub class'ları için farklı özelliktedir.
     * Bu metod bu sub class'larda Override edilecektir.
     */
    public void KapasiteArttır(){
    
        derslikKapasitesi += 10;
        System.out.println("Yeni derslik kapasitesi: " + derslikKapasitesi);
    }
    
}


