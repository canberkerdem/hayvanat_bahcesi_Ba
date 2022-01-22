package com.bilgeadam.hayvanatbahcesi;

public class Kopek extends Hayvan {

    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    //method overriding
    //superclass metodu kendimize özgü yeniden yazıyoruz.
    @Override
    public void sesCikar(){
        System.out.println("Hav Hav");
    }

    @Override
    public String toString() {
        return " Ad:" + getAd() + "\n" +
                " Ağırlık: " + getAgirlik() +"\n" +
                " Uzunluk: " + getUzunluk() +"\n" +
                " Cins: " +getKopekCins();
    }
}
