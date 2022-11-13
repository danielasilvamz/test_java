
package ivafinal;

import java.util.Scanner;

public class IvaFinal {

    //Atributos de contexto global (valida para todos los metodos)
    //precio del producto
    static double precioProducto;
    static double precioconIva;
    
    // metodo principal  --> se que es un metodo y no un clase porque no tiene la palabra class
    //es la ppal porque dice main
    public static void main(String[] args) {
        //se atrapan datos del usuario:
        //atributo de contexto local (valida para metodo en que la declaro)
        String entradaTeclado = ""; //variable que atrapa --> es opcional declarar lo que tiene o sin =
        //es un string porque el dato de retorno de nextLine es string
        //si quiero por ejemplo double cambiar abajo --> nextDouble()o hacer cast luego 
        //Solicitar al usuario datos de entrada
        System.out.println("Por favor introduzca el precio:");
        //nuevo objeto de tipo Scanner
        //para atrapar en java se usa libreria a traves de objetos 
        Scanner entradaEscaner = new Scanner (System.in);
        //se necesita atrapar lo que ingresa el usuario en una variable
        
        //Primera forma con casting
        //el valor que toma Scanner lo guardamos en la variable entradaTeclado
        entradaTeclado = entradaEscaner.nextLine (); //guarda valor string
        System.out.println("El precio que usted ha ingresado es: \"" + entradaTeclado);
        
        //hacer casting para convertir de string a entero
        precioProducto = Integer.parseInt (entradaTeclado);
        //precio producto almacena un entero
        
        //Segunda forma sin cast, atrapando directamente el valor
        //precioProducto = entradaEscaner.nextInt();
        
        
        //Creacion de un objeto de la clase CalculoIva
        CalculoIva obteniendoPrecioIva = new CalculoIva();
        //clase nombredelobjeto = new clase;
        precioconIva = obteniendoPrecioIva.calculoIva(precioProducto);
        //calculoIva --> metodo de la otra clase
        
        System.out.println("El precio con iva es: " + precioconIva + "gracias por preguntar");
    }
}
    
    