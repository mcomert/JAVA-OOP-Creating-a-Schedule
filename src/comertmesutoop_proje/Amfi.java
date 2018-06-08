package comertmesutoop_proje;

import java.util.ArrayList;

/**
 * Derslik sınıfıntan inheritance edilmiş Amfi sınıfı ve türetilecek nesnelerin özelliklerini ve metodlarını içeren sınıf.
 * @author Comert, Mesut 13.05.2018
 */
class Amfi extends Derslik{
    
    int amfiSesSistemiSayisi;
    int amfiTahtaSayisi;
    static ArrayList<String> amfiListesi = new ArrayList();
    
    /**
     * Derslik sınıfından inheritance edilmiş Amfi sınıfının dört parametreli constructorı.
     * @param derslikKodu
     * @param derslikKapasitesi
     * @param amfiSesSistemiSayisi
     * @param amfiTahtaSayisi 
     */
    public Amfi(String derslikKodu, int derslikKapasitesi, int amfiSesSistemiSayisi, int amfiTahtaSayisi) {
        super(derslikKodu, derslikKapasitesi);
        this.amfiSesSistemiSayisi = amfiSesSistemiSayisi;
        this.amfiTahtaSayisi = amfiTahtaSayisi;
        Amfi.amfiListesi.add(derslikKodu);
        if(Derslik.derslikListesi.contains(derslikKodu)){
            Derslik.derslikListesi.remove(derslikKodu);
        }
    }
    
    /**
     * Amfi sınıfı için KapasiteArttır metodu Superclass'ından inheritance olmuştur.
     * Amfilerde bir sıra-masa kombinasyonu için 20 kişilik bir kapasite artışı düşünülmüştür.
     * Dolayısıyla bu metod bu sınıfta Override edilmiştir.
     */
    @Override
    public void KapasiteArttır(){
    
        derslikKapasitesi += 20;
        System.out.println("Yeni derslik kapasitesi: " + derslikKapasitesi);
    }
}
