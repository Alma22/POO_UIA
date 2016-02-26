import java.io.*;
import java.util.*;

public class Practica2 {
  public static void main(String[] args) throws IOException{


    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(isr);
 };
 System.out.print("Introduzca el texto: ");
    String cadena = leer.readLine();
    StringTokenizer palabras = new StringTokenizer(cadena);


    System.out.println("Ah introducido este numero de caracteres: " + cadena.length());
    System.out.println ("ah introducido este numero de palabras: "+ palabras.countTokens());

}
}