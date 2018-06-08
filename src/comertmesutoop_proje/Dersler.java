package comertmesutoop_proje;

import java.util.ArrayList;

/**
 * Dersler sınıfı
 * Bu sınıftan türetilecek ilgili ders nesnelerinin özelliklerini ve metodlarını içeren sınıf.
 * @author Comert, Mesut 13.05.2018
 */
public class Dersler {
    
    private final String dersKodu, dersAdi;
    private final int dersTeori, dersUyg;
    private Boolean dersAcildiMi;
    private int ogrenciSayisi;
    private Boolean dersAcilabilirMi = true;
    static ArrayList<String> acilanDersler = new ArrayList();
    static ArrayList<String> ogrenciSayilari = new ArrayList();
    private final ArrayList<String> uygunDerslik = new ArrayList();
    
    /**
     * Dersler sınıfından türetilecek nesnelerin dört parametreli constructurı.
     * @param dersKodu
     * @param dersAdi
     * @param dersTeori
     * @param dersUyg 
     */
    public Dersler(String dersKodu, String dersAdi, int dersTeori, int dersUyg){
        
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
        this.dersTeori = dersTeori;
        this.dersUyg = dersUyg;
    }
    
    /**
     * Dersler sınıfından türetilmiş ilgili ders nesnesine kayıtlı öğrenci sayısını ders açıldıysa set eden,
     * Ve bu sayıları bir ArrayList'e yazan,
     * Eğer öğrenci sayısı 5'ten küçük ise de dersiKapat() metodunu çağırarak bu dersi kapatan void metod.
     * @param ogrenciSayisi 
     */
    public void setOgrenciSayisi(int ogrenciSayisi){
        
        if(getDersAcildiMi()){
            Dersler.ogrenciSayilari.add(Integer.toString(ogrenciSayisi));
            this.ogrenciSayisi = ogrenciSayisi;
        }
        else
            System.out.println("Lütfen önce dersi açınız.");
        
        if(ogrenciSayisi <=5){
            dersAcilabilirMi = false;
            dersiKapat();
        }
    }
    
    /**
     * Dersler sınıfından türetilmiş ilgili ders nesnesine kayıtlı öğrenci sayısını get eden int metod.
     * @return ogrenciSayisi
     */
    public int getOgrenciSayisi(){
        
        return ogrenciSayisi;
    }
    
    /**
     * Açılan ders nesnelerine kayıt olan toplam öğrenci sayısını tutan,
     * ArrayList içerisine kayıtlı sayıların toplamını alan int static metod.
     * @return toplam ogrenci sayisi
     */
    public static int toplamOgrenciSayisi(){
       
        int toplam = 0;
        for (int i = 0; i < Dersler.ogrenciSayilari.size(); i++) {
            toplam += Integer.parseInt(Dersler.ogrenciSayilari.get(i)); 
        }
        return toplam;
    }
    
    /**
     * Ders başına ortalama kaç ogrencı oldugunu gosteren double static metod.
     * @return ortalama ders basına dusen ogrencı sayısı
     */
    public static double ortalamaOgrenciSayisi(){
        
        double toplam;
        toplam = Dersler.toplamOgrenciSayisi();
        double ortalama = toplam/Dersler.ogrenciSayilari.size();
        System.out.print("Ders Basina: ");
        return ortalama;
    }
    
    /**
     * Dersler sınıfından türetilmiş ilgili ders nesnesinin ders kodunu get eden metod
     * @return dersKodu
     */
    public String getDersKodu(){
    
        return dersKodu;
    }
    
    /**
     * Açılacak derslerin ArrayListini oluşturan void metod.
     * Bu dersleri acilanDersler ArrayListine ekler.
     */
    public void dersiAc(){
        
        Dersler.acilanDersler.add(dersKodu);
        System.out.println(dersKodu + " kodlu ders açıldı.");
    }
    
    /**
     * Açılan derslerin bulunduğu ArrayListten ilgili dersi siler.
     */
    public void dersiKapat(){
    
        Dersler.acilanDersler.remove(dersKodu);
        if(dersAcilabilirMi == false) System.out.println(dersKodu + " kodlu ders kontenjan yetersizliginden kapatıldı.");
        else System.out.println(dersKodu + " kodlu ders kapatıldı.");
    }
    
    /**
     * Açılan derslerin sayısını döndüren int static metod.
     * @return acilanDersler.size()
     */
    public static int acilanDersSayisi(){
    
        System.out.print("Acilan Ders Sayisi: ");
        return Dersler.acilanDersler.size();
    }
    
    /**
     * dersAc() metodu ile açılan derslerin listesini ekrana yazdıran static void metod
     */
    public static void acilanDersListesi(){
    
        System.out.println("Acilan Dersler: " + Dersler.acilanDersler);
               
    }
    
    /**
     * Dersler sınıfından türetilmiş ilgili ders nesnesinin açılma durumunu sorgulayan Boolean metod.
     * @return dersAcildiMi
     */
    public Boolean getDersAcildiMi(){
    
        dersAcildiMi = Dersler.acilanDersler.contains(dersKodu);
        if(dersAcildiMi) System.out.println(dersKodu + " kodlu ders acildi.");
        else System.out.println(dersKodu + " kodlu ders acilmadi.");
        
        return dersAcildiMi;
    }
      
    /**
     * İlgili ders nesnesi için kontenjan ve laboratuar bakımından uygun olan derslikleri listeleyen void metod.
     */
    public void uygunDerslikListele(){
        int kayitliOgrenciSayisi = getOgrenciSayisi();
        int labSaati = dersUyg;
        if(kayitliOgrenciSayisi > 50){
            
            uygunDerslik.addAll(Amfi.amfiListesi);
            System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin secilen derslikler: " + uygunDerslik);
            if(labSaati != 0){  
                System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin laboratuar kontenjanı yetersizdir.");
            }
        }
        else if(kayitliOgrenciSayisi <=50 && kayitliOgrenciSayisi>10){
            uygunDerslik.addAll(Derslik.derslikListesi);
            System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin secilebilecek derslikler: " + uygunDerslik);
            if(labSaati!=0){
                if(Lab.labIsimListesi.contains(dersAdi)){
                    int kod = Lab.labIsimListesi.indexOf(dersAdi);
                    System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin secilebilecek laboratuar: [" + Lab.labListesi.get(kod) + "]");
                }
                
            }
        }
        else if(kayitliOgrenciSayisi <=10){
            uygunDerslik.addAll(ButikDerslik.butikDerslikListesi);
            System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin secilebilecek derslikler: " + uygunDerslik);
            if(labSaati!=0){
                System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin laboratuar secimi yapmayi unutmayin.");
                if(Lab.labIsimListesi.contains(dersAdi)){
                    int kod = Lab.labIsimListesi.indexOf(dersAdi);
                    System.out.println(dersKodu + " kodlu " + dersAdi + " adli ders icin secilebilecek laboratuar: [" + Lab.labListesi.get(kod) + "]");
                }
            
            }
        }
    }
    
    /**
     * İlgili ders nesnesini ders programına ekleyen metod. 
     * Laboratuar'ı da bulunan dersler için bu metod Overload edilecektir.
     * @param gun
     * @param saat
     * @param derslikKodu 
     */
    public void programaEkle(String gun, int saat, Derslik derslikKodu){

        if(dersUyg!= 0){ 
            System.out.println("Laboratuar seçmelisiniz."); 
        }
        else{
            
            if(Dersler.acilanDersler.contains(dersKodu)){
                
                if(uygunDerslik.contains(derslikKodu.derslikKodu)){
                
                    if(saat >=1 && saat<=8 ){
                
                        if ((saat+dersTeori+dersUyg)<=8) {
                    
                            if(null == gun)System.out.println("Gun seciminizi pzt, sali, crs, prs ya da cuma olarak yapınız");
                            else switch (gun) {
                            case "pzt": 
                                if(derslikKodu.pzt[saat-1] == null){
                                int sayi = dersTeori + dersUyg;
                                    while(sayi != 0){
                                        derslikKodu.pzt[saat-1+(sayi-1)] = dersKodu;
                                        sayi--;
                                    } 
                                } 
                                else 
                                    System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");                    
                                break;
                   
                            case "sali":
                                if(derslikKodu.sali[saat-1] == null){
                                    int sayi = dersTeori + dersUyg;
                                    while(sayi != 0){
                                        derslikKodu.sali[saat-1+(sayi-1)] = dersKodu;
                                        sayi--;
                                    } 
                                } 
                                else 
                                    System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                break;
                    
                            case "crs":
                                if(derslikKodu.crs[saat-1] == null){
                                    int sayi = dersTeori + dersUyg;
                                    while(sayi != 0){
                                        derslikKodu.crs[saat-1+(sayi-1)] = dersKodu;
                                        sayi--;
                                    } 
                                } 
                                else 
                                    System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                break;
                    
                            case "prs":
                                if(derslikKodu.prs[saat-1] == null){
                                    int sayi = dersTeori + dersUyg;
                                    while(sayi != 0){
                                        derslikKodu.prs[saat-1+(sayi-1)] = dersKodu;
                                        sayi--;
                                    } 
                                } 
                                else 
                                    System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                break;
                   
                            case "cuma":
                                if(derslikKodu.cuma[saat-1] == null){
                                    int sayi = dersTeori + dersUyg;
                                    while(sayi != 0){
                                        derslikKodu.cuma[saat-1+(sayi-1)] = dersKodu;
                                        sayi--;
                                    } 
                                } 
                                else 
                                    System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                break;
                    
                            default:
                                System.out.println("Gun seciminizi pzt, sali, crs, prs ya da cuma olarak yapınız");
                                break;
                            }
                        }
                        else
                            System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                    
                    }    
                    else
                        System.out.println("Saat seciminizi 1 ve 8 arasında rakamlar kullanarak yapınız.");

                }
                else
                    System.out.println(dersKodu + " kodlu ders icin " + derslikKodu.derslikKodu + " dersligi uygun değildir.");
            
            }
            else{
                System.out.println(dersKodu + " kodlu ders açılmamıştır. Lütfen önce dersi açınız.");
            }
        }  
    }
    
    /**
     * İlgili ders nesnesini ders programına ekleyen Overload metod.
     * @param gun
     * @param saat
     * @param derslikKodu
     * @param labKodu
     */
    public void programaEkle(String gun, int saat, Derslik derslikKodu, Derslik labKodu){
        
        if(dersUyg == 0){
            System.out.println("Bu dersin laboratuarı yoktur.");
        }
        else{
            
            if(Dersler.acilanDersler.contains(dersKodu)){
            
            if(uygunDerslik.contains(derslikKodu.derslikKodu)){
                 
                if(Lab.labIsimListesi.contains(dersAdi)){
                    int kod = Lab.labIsimListesi.indexOf(dersAdi);
                    if(Lab.labListesi.get(kod) == labKodu.derslikKodu){
                        
                        if(saat >=1 && saat<=8 ){
                
                            if ((saat+dersTeori+dersUyg)<=8) {
                    
                                if(null == gun)System.out.println("Gun seciminizi pzt, sali, crs, prs ya da cuma olarak yapınız");
                                else switch (gun) {
                                case "pzt": 
                                    if(derslikKodu.pzt[saat-1] == null){
                                        int sayi = dersTeori;
                                        int sayi2 = dersUyg;
                                        while(sayi != 0){
                                            derslikKodu.pzt[saat-1+(sayi-1)] = dersKodu;
                                            sayi--;
                                        }
                                        while(sayi2!=0){
                                            labKodu.pzt[saat-1+(dersTeori+sayi2-1)] = dersKodu;
                                            sayi2--;
                                        }
                                    } 
                                    else 
                                        System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");                    
                                break;
                   
                                case "sali":
                                    if(derslikKodu.sali[saat-1] == null){
                                        int sayi = dersTeori;
                                        int sayi2 = dersUyg;
                                        while(sayi != 0){
                                            derslikKodu.sali[saat-1+(sayi-1)] = dersKodu;
                                            sayi--;
                                        }    
                                        while(sayi2!=0){
                                            labKodu.sali[saat-1+(dersTeori+sayi2-1)] = dersKodu;
                                            sayi2--;
                                        }
                                    } 
                                    else 
                                        System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                    break;
                    
                                case "crs":
                                    if(derslikKodu.crs[saat-1] == null){
                                        int sayi = dersTeori;
                                        int sayi2 = dersUyg;
                                        while(sayi != 0){
                                            derslikKodu.crs[saat-1+(sayi-1)] = dersKodu;
                                            sayi--;
                                        }    
                                        while(sayi2!=0){
                                            labKodu.crs[saat-1+(dersTeori+sayi2-1)] = dersKodu;
                                            sayi2--;
                                        } 
                                    } 
                                    else 
                                        System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                    break;
                    
                                case "prs":
                                    if(derslikKodu.prs[saat-1] == null){
                                        int sayi = dersTeori;
                                        int sayi2 = dersUyg;
                                        while(sayi != 0){
                                            derslikKodu.prs[saat-1+(sayi-1)] = dersKodu;
                                            sayi--;
                                        }    
                                        while(sayi2!=0){
                                            labKodu.prs[saat-1+(dersTeori+sayi2-1)] = dersKodu;
                                            sayi2--;
                                        }
                                    } 
                                    else 
                                        System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                    break;
                   
                                case "cuma":
                                    if(derslikKodu.cuma[saat-1] == null){
                                        int sayi = dersTeori;
                                        int sayi2 = dersUyg;
                                        while(sayi != 0){
                                            derslikKodu.cuma[saat-1+(sayi-1)] = dersKodu;
                                            sayi--;
                                        }    
                                        while(sayi2!=0){
                                            labKodu.cuma[saat-1+(dersTeori+sayi2-1)] = dersKodu;
                                            sayi2--;
                                        }
                                    } 
                                    else 
                                        System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                                    break;
                    
                                default:
                                    System.out.println("Gun seciminizi pzt, sali, crs, prs ya da cuma olarak yapınız");
                                    break;
                                }
                            }
                            else
                                System.out.println(dersKodu + " kodlu ders icin ilgili gun ve saat musait değildir.");
                    
                        }    
                        else
                            System.out.println("Saat seciminizi 1 ve 8 arasında rakamlar kullanarak yapınız.");
                      
                    }
                    else
                        System.out.println(dersKodu + " kodlu ders icin " + labKodu.derslikKodu + " laboratuarımız uygun değildir. " + Lab.labListesi.get(kod) + " uygundur.");
                }
                else
                    System.out.println(dersKodu + " kodlu ders icin " + labKodu.derslikKodu + " laboratuarı uygun değildir.");
            }
            else
                System.out.println(dersKodu + " kodlu ders icin " + derslikKodu.derslikKodu + " dersligi uygun değildir.");
        }
        else
            System.out.println(dersKodu + " kodlu ders açılmamıştır. Lütfen önce dersi açınız.");
        
            
        }
        
          
    }   

}