package comertmesutoop_proje;

import java.util.ArrayList;

/**
 * Derslik sınıfıntan inheritance edilmiş Lab sınıfı ve türetilecek nesnelerin özelliklerini ve metodlarını içeren sınıf.
 * @author Comert, Mesut 13.05.2018
 */
class Lab extends Derslik{

    String labTuru;
    int labEkipmanSayisi;
    static ArrayList<String> labListesi = new ArrayList();
    static ArrayList<String> labIsimListesi = new ArrayList();
    
    /**
     * Derslik sınıfından inheritance edilmiş Lab sınıfının dört parametreli constructorı.
     * @param derslikKodu
     * @param derslikKapasitesi
     * @param labTuru
     * @param labEkipmanSayisi 
     */
    public Lab(String derslikKodu, int derslikKapasitesi, String labTuru, int labEkipmanSayisi) {
        super(derslikKodu, derslikKapasitesi);
        this.labTuru = labTuru;
        this.labEkipmanSayisi = labEkipmanSayisi;
        Lab.labListesi.add(derslikKodu);
        Lab.labIsimListesi.add(labTuru);
        if(Derslik.derslikListesi.contains(derslikKodu)){
            Derslik.derslikListesi.remove(derslikKodu);
        }
    
    }
    
    /**
     * Lab sınıfı için KapasiteArttır metodu Superclass'ından inheritance olmuştur.
     * Laboratuarlarda bir sıra-masa kombinasyonu için 2 kişilik bir kapasite artışı düşünülmüştür.
     * Dolayısıyla bu metod bu sınıfta Override edilmiştir.
     */
    @Override
    public void KapasiteArttır(){
    
        derslikKapasitesi += 2;
        System.out.println("Yeni derslik kapasitesi: " + derslikKapasitesi);
    }
    
}
