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
public class AlmacenamientoMedicamento {
    void almacenarMedicamento(){
        System.out.println("Almacenando medicamento");
    }
    void eliminarMedicamento(int codBarras){
        System.out.println("Eliminando elemento con codigo de barras " +codBarras);
    }
    void actualizarMedicamento(String medicamento){
        System.out.println("Actualizando medicamento "+ medicamento);
    }
    void consultarMedicamento(int codBarras){
        System.out.println("Medicamento resultante de "+ codBarras);
    }
}
