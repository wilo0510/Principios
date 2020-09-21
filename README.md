# Principios de programacion orientada a objetos 
<h1>Integrantes </h1>
<h3>Juan guaba </h3>
<h3>Wilmer pachón</h3>
<h1>Principios aplicados</h1>
<h2>Principio de responsabilidad única</h2>
<p><i>"Este principio se refiere a la responsabilidad Única que debiera tener cada programa con una tarea bien específica y acotada. Se pretende entonces que nuestro programa haga algo determinado y concreto."</i></p>

En este ejemplo tenemos la clase <i>AlmacenamientoMedicamento</i> es la clase responsable del acceso a la "base de datos". Su responsabilidad es contener los metodos necesarios para realizar operaciones a nivel de base de datos.
```java
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
```
<h2>Principio abierto/cerrado</h2>

<p><i>"El principio de open/closed dice que toda clase, modulo, método, etc. debería estar abierto para extenderse pero debe estar cerrado para modificarse."</p></i>

Para apliar esto tenemos una clase abstracta <i>Medicamento</i> que define la firma y el comportamiento de los metodos basico de los medicamentos y luego extendemos de esta clase otros tipos de medicamentos. 

```java
public abstract class Medicamento {
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
    public abstract int precioMedicamento();
    
}
```
<img src="Class Model.bmp"
     alt="Markdown Monster icon"
     style="float: center; margin-right: 10px;" />