/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios;

import Medicamentos.*;

/**
 *
 * @author wilme
 */
public class Principios {

    /**
     * @param args the command linee arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medicamento[] arrayMedicamentos={
            new Acetaminofen("Bayer", "Acetaminofen", 10, 1452),
            new Omeprazol("LA sante","Omeprazol",20,1458)
        };
        imprimirMedicamentos(arrayMedicamentos);
    }
    public static void imprimirMedicamentos(Medicamento[] arrayMedicamentos){
        for(Medicamento medicamento : arrayMedicamentos){
            System.out.println(medicamento.precioMedicamento());
        }
    }
}
