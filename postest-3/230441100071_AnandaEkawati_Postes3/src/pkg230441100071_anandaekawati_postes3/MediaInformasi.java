/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100071_anandaekawati_postes3;
abstract class MediaInformasi extends CetakInfo {
    protected String judul;
    protected String pengarang;
    protected int tahunTerbit;

    public MediaInformasi(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public abstract void displayInfo();
    
    
}