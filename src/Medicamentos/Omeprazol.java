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
public class Omeprazol extends Medicamento{

    public Omeprazol(String fabricante, String nombreMedicamento, int stock, int codBarras) {
        super(fabricante, nombreMedicamento, stock, codBarras);
    }

    @Override
    public int precioMedicamento() {
       return 5000;
    }
    
}
