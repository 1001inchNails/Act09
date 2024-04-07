# **Actividad 9: Herencia y Polimorfismo**
## *Contornos 1ºCS DAW 23/24*  
*Enunciado:*
>Actividad Taller:
Hacer un taller con super clase Vehiculo y cinco clases hijas (coche, moto, camion, tractor, grua).  
  Cada clase hija tiene que tener 5 piezas como minimo.  
  Debe tener un metodo para reponer/reparar piezas (aplicación de polimorfismo).  
  Se creará un menú para poder registrar vehiculos y salir de la aplicación.   
Requiere herencia y polimorfismo

## *Responde y justifica:*
1. ¿Puede existir una subclase de una subclase en java?

>Si, de una subclase se puede extender otra subclase.

```
 class Uno {
    public void print_uno()
    {
        System.out.println("Uno");
    }
}
 
class Dos extends Uno {
    public void print_dos()
    { 
        System.out.println("Dos"); 
        
    }
}
 
class Tres extends Dos {
    public void print_tres()
    {
        System.out.println("Tres");
    }
}
 

public class Main {
    public static void main(String[] args)
    {
        Tres nuevo = new Tres();
        nuevo.print_uno();
        nuevo.print_dos();
        nuevo.print_tres();
    }
}

//Output:
Uno
Dos
Tres
```

2. ¿Puede existir una clase que herede de dos superclases en java?

>No, la herencia mútiple de clases no está permitida en Java, ya que se consideró que es una práctica poco eficiente y proclive a la ambigüedad.  Sin embargo este tipo de herencia se puede realizar a nivel de interfaces.


## **Funcionamiento básico:**
El programa se divide en nueve clases:
* **Vehiculo:** establece la estructura para la superclase.
* **Coche, Moto, Camion, Grua, Tractor:** establece la estructura para cada subclase.
* **Modelo:** se encarga de realizar las inicializaciones de los datos y de llevar a cabo los registros de información.
* **Registro:** organiza el menú y realiza las llamadas a la clase Modelo.
* **Main:** inicia la aplicación.

## **Anotaciones de interés**

### super.toString()
Se puede añadir el toString de la superclase al de la clase hija añadiendole super.toString() para que saque toda la información por pantalla, ya que por defecto el toString de la derivada no accede a los atributos de la superior.
### Recursos
[Geeks for Geeks](https://www.geeksforgeeks.org/inheritance-in-java/)  
[Stack Overflow](https://es.stackoverflow.com/questions/104165/por-qu%C3%A9-la-herencia-m%C3%BAltiple-no-se-admite-en-java)  
[Arquitectura Java](https://www.arquitecturajava.com/java-herencia-multiple-y-sus-opciones/)

