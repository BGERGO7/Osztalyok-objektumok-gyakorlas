class Szervezet{
    private String nev;
    private int bevetel;
    private boolean profit;

    public double adotSzamol(double ado){
        return bevetel * ado / 100;
    }

    public void setNev(String n){
        if(!n.equals("")){
            nev = n;
        }
    }

    public String getNev(){
        return nev;
    }

    public void setBevetel(int b){
        if(b >= 0){
            bevetel = b;
        }
    }

    public int getBevetel(){
        return bevetel;
    }

    public void setProfit(boolean p){
        profit = p;
    }

    public boolean getProfit(){
        return profit;
    }
}

class ElelmiszerTermek{
    private String nev;
    private int suly; 
    private int ar; 
    private int adagok_szama; 
    private int kaloria; 

    public double szazGrammAr(){
        return ar / (suly / 100);
    }

    public double szazGrammKaloria(){
        return kaloria / (suly / 100);
    }

    public void setNev(String n){
        if(n != ""){
            nev = n;
        }
    }

    public String getNev(){
        return nev;
    }

    public void setSuly(int s){
        if(s >= 0){
            suly = s;
        }
    }

    public int getSuly(){
        return suly;
    }

    public void setAr(int a){
        if(a >= 0){
            ar = a;
        }
    }

    public int getAr(){
        return ar;
    }

    public void setAdag(int ad){
        if(ad > 0){
            adagok_szama = ad;
        }
    }

    public int getAdag(){
        return adagok_szama;
    }

    public void setKaloria(int k){
        if(k > 0){
            kaloria = k;
        }
    }

    public int getKaloria(){
        return kaloria;
    }
}

public class osztalyok_objektumok_gyakorlas{
    public static void main(String[] args) {
        System.out.println("hello");

        Szervezet Apple = new Szervezet();
        Szervezet Voroskereszt = new Szervezet();

        Apple.setNev("Apple");
        Apple.setBevetel(1000000000);
        Apple.setProfit(true);

        Voroskereszt.setNev("Vöröskereszt");
        Voroskereszt.setBevetel(1200000);
        Voroskereszt.setProfit(false);

        Apple.adotSzamol(10.0);
        Voroskereszt.adotSzamol(2.0);

        System.out.println(Apple.getNev());
        System.out.println(Apple.getBevetel());
        System.out.println(Apple.getProfit());
        
        System.out.println(Voroskereszt.getNev());
        System.out.println(Voroskereszt.getBevetel());
        System.out.println(Voroskereszt.getProfit());

        ElelmiszerTermek szeletelBarack = new ElelmiszerTermek();
        ElelmiszerTermek kenyer = new ElelmiszerTermek();

        szeletelBarack.setNev("szeletelt barack");
        szeletelBarack.setSuly(500);
        szeletelBarack.setAr(530);
        szeletelBarack.setAdag(4);
        szeletelBarack.setKaloria(70);

        kenyer.setNev("kenyer");
        kenyer.setSuly(200);
        kenyer.setAr(100);
        kenyer.setAdag(1);
        kenyer.setKaloria(300);

        szeletelBarack.szazGrammAr();
        szeletelBarack.szazGrammKaloria();
        
        kenyer.szazGrammAr();
        kenyer.szazGrammKaloria();

        System.out.println(szeletelBarack.getNev());
        System.out.println(szeletelBarack.getSuly());
        System.out.println(szeletelBarack.getAr());
        System.out.println(szeletelBarack.getAdag());
        System.out.println(szeletelBarack.getKaloria());
        
        System.out.println(kenyer.getNev());
        System.out.println(kenyer.getSuly());
        System.out.println(kenyer.getAr());
        System.out.println(kenyer.getAdag());
        System.out.println(kenyer.getKaloria());
    }
}
