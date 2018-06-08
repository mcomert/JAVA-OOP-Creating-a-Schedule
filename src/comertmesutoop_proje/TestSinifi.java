package comertmesutoop_proje;

/**   
 * Nesne Yönelimli Programlama dersi; Ders Programı Oluşturma projesi; Test Sınıfı.
 * @author Comert, Mesut 13.05.2018
 */
public class TestSinifi {

    /**
     * Test sınıfının test metodu.
     * @param args 
     */
    public static void main(String[] args) {
        
        Lab d101 = new Lab("D101", 20, "Elektrik Makinaları", 10);
        Lab d102 = new Lab("D102", 10, "Yenilenebilir Enerji", 3);
        Amfi d103 = new Amfi("D103", 150, 2, 6);
        Amfi d104 = new Amfi("D104", 100, 5, 4);
        Derslik d105 = new Derslik("D105", 50);
        ButikDerslik d201 = new ButikDerslik("D201", 10);
        ButikDerslik d202 = new ButikDerslik("D202", 10);
        Derslik d203 = new Derslik("D203", 50);
        Derslik d204 = new Derslik("D204", 30);
        Derslik d205 = new Derslik("D205", 30);
        Lab d301 = new Lab("D301", 40, "Programlama", 40);
        Lab d302 = new Lab("D302", 20, "Algoritma", 20);
        Lab d303 = new Lab("D303", 20, "Otomasyon", 20);
        Derslik d304 = new Derslik("D304", 30);
        Lab d401 = new Lab("D401", 40, "Programlama", 40);
        Lab d402 = new Lab("D402", 30, "Otomatik Kontrol", 10);
        Lab d403 = new Lab("D403", 15, "Haberlesme", 15);
        Lab d404 = new Lab("D404", 15, "Gomulu Sistemler", 15);
        
        Dersler eem101 = new Dersler("EEM101", "EEM'ne Giris", 2, 0);
        Dersler eem102 = new Dersler("EEM102", "Test ve Olcme",2, 0);
        Dersler eem202 = new Dersler("EEM202", "Elektrik Makinaları",3, 2);
        Dersler eem206 = new Dersler("EEM206", "Gomulu Sistemler",2, 2);
        Dersler eem301 = new Dersler("EEM301", "Otomatik Kontrol",3, 2);
        Dersler eem302 = new Dersler("EEM302", "Otomasyon", 2, 2);
        Dersler eem305 = new Dersler("EEM305", "Haberlesme",3, 2);
        Dersler eem309 = new Dersler("EEM305", "Yenilenebilir Enerji",2, 2);
        Dersler bm101 = new Dersler("BM101", "Algoritmalar", 2, 2);
        Dersler bm102 = new Dersler("BM102", "Programlama",2, 2);
        Dersler fzk101 = new Dersler("FZK101", "Fizik I", 2, 2);
        Dersler fzk102 = new Dersler("FZK102", "Fizik II", 2, 2);
        Dersler mat101 = new Dersler("MAT101", "Matematik I",3, 2);
        Dersler mat102 = new Dersler("MAT102", "Matematik II",3, 2);
        Dersler mat110 = new Dersler("MAT111", "Lineer Cebir", 3, 0);
        
        
        eem101.dersiAc();
        eem102.dersiAc();
        eem202.dersiAc();
        eem206.dersiAc();
        eem301.dersiAc();
        eem302.dersiAc();
        eem305.dersiAc();
        eem309.dersiAc();
        bm101.dersiAc();
        bm102.dersiAc();
        fzk101.dersiAc();
        fzk102.dersiAc();
        mat101.dersiAc();
        mat102.dersiAc();
        mat110.dersiAc();
        
        eem101.setOgrenciSayisi(35);
        eem102.setOgrenciSayisi(35);
        eem202.setOgrenciSayisi(20);
        eem206.setOgrenciSayisi(15);
        eem301.setOgrenciSayisi(30);
        eem302.setOgrenciSayisi(20);
        eem305.setOgrenciSayisi(3);
        eem309.setOgrenciSayisi(10);
        bm101.setOgrenciSayisi(35);
        bm102.setOgrenciSayisi(20);
        fzk101.setOgrenciSayisi(90);
        fzk102.setOgrenciSayisi(120);
        mat101.setOgrenciSayisi(70);
        mat102.setOgrenciSayisi(90);
        mat110.setOgrenciSayisi(30);
        mat101.dersiKapat();
        System.out.println(mat110.getOgrenciSayisi());
        System.out.println(Dersler.toplamOgrenciSayisi());
        System.out.println(Dersler.ortalamaOgrenciSayisi());
        System.out.println(Dersler.acilanDersSayisi());
        Dersler.acilanDersListesi();
        mat101.getDersAcildiMi();
        eem101.getDersAcildiMi();
        fzk101.getDersAcildiMi();
        
        
        eem101.uygunDerslikListele();
        eem101.programaEkle("pzt", 1, d304);
        eem102.uygunDerslikListele();
        eem102.programaEkle("pzt", 3, d304);
        eem202.uygunDerslikListele();
        eem202.programaEkle("sali", 1, d304, d101);
        eem206.uygunDerslikListele();
        eem206.programaEkle("crs", 1, d105, d404);
        eem301.uygunDerslikListele();
        eem301.programaEkle("cuma", 1, d204, d402);
        eem302.uygunDerslikListele();
        eem302.programaEkle("prs", 1, d304,d303);
        
        System.out.println(Dersler.toplamOgrenciSayisi());
        /*
        programiGetir(d304);
        programiGetir(d303);
        programiGetir(d204);
        programiGetir(d105);
     */
    }
    
    /**
     * Test sınıfında oluşturulan ders programını Dersler sınıfının derslikKodu parametresine göre ekrana yazan metod.
     * @param derslikKodu
     */
    public static void programiGetir(Derslik derslikKodu){
    
        boolean onay = false;
        System.out.println("");
        System.out.println(derslikKodu.derslikKodu + " kodlu derslik için ders programı.");
        for (int i = 0; i < 8; i++) {
            
            if(i == 0) System.out.println("Pazartesi");
            
            if(derslikKodu.pzt[i] != null){
                System.out.println(i+1 + ". saat " + derslikKodu.pzt[i]);
                onay = true;
            }
            if(i == 7 && onay == false) System.out.println("Ders eklenmemiştir.");
        }
        System.out.println("");
        onay = false;
        for (int i = 0; i < 8; i++) {
            if(i == 0) System.out.println("Salı");
            
            if(derslikKodu.sali[i] != null){
                System.out.println(i+1 + ". saat " + derslikKodu.sali[i]);
                onay = true;
            }
            if(i == 7 && onay == false) System.out.println("Ders eklenmemiştir.");
        }
        System.out.println("");  
        onay = false;    
        for (int i = 0; i < 8; i++) {
            if(i == 0) System.out.println("Carsamba");
            
            if(derslikKodu.crs[i] != null){
                System.out.println(i+1 + ". saat " + derslikKodu.crs[i]);
                onay = true;
            }
            if(i == 7 && onay == false) System.out.println("Ders eklenmemiştir.");
        }
         System.out.println("");
         onay = false;
        for (int i = 0; i < 8; i++) {
            if(i == 0) System.out.println("Persembe");
            
            if(derslikKodu.prs[i] != null){
                System.out.println(i+1 + ". saat " + derslikKodu.prs[i]);
                onay = true;
            }
            if(i == 7 && onay == false) System.out.println("Ders eklenmemiştir.");
        }
         System.out.println("");
         onay = false;
        for (int i = 0; i < 8; i++) {
            if(i == 0) System.out.println("Cuma");
            
            if(derslikKodu.cuma[i] != null){
                System.out.println(i+1 + ". saat " + derslikKodu.cuma[i]);
                onay = true;
            }
            if(i == 7 && onay == false) System.out.println("Ders eklenmemiştir.");
        } 
                                        
    }
   
}
