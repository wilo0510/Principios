/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamentos;

/**
 *
 * @author wilme
 */
public class Medicamento {
    private String fabricante;
    private String nombreMedicamento;
    private int stock;
    private int codBarras;
    
    public Medicamento(String fabricante, String nombreMedicamento, int stock, int codBarras ){
        this.fabricante=fabricante;
        this.nombreMedicamento=nombreMedicamento;
        this.stock=stock;
        this.codBarras=codBarras;
    }
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }
    
}
