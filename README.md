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
    alt="Diagrama de clases Medicamento"
    style="display: block; margin-left: auto; margin-right:auto" />

<h2>Principio de sustitución de Liskov</h2>

<p><i>"El principio de sustitución de Liskov dice que si la clase A es de un subtipo de la clase B, entonces deberíamos poder reemplazar B con A sin afectar el comportamiento de nuestro programa."</p></i>

Esto lo podemos ver evidenciado con la herencia de la clase <i>Medicamento</i>. Sus clases subtipo (<i>Omeprazol</i> y <i>Acetaminofen</i>) tienen un metodo común <i>precioMedicamento</i> que definen su comportamiento de forma interna e indovidual sin modificar la firma del metodo. 

```java
    medicamento.precioMedicamento()
```