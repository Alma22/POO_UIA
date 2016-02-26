import java.io.*;
import java.util.*;
public class Practica2 {
  public static void main(String[] args) throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(isr);


    System.out.print("Introduzca un texto: ");
    String texto = leer.readLine();
    StringTokenizer numero = new StringTokenizer(texto);


    System.out.println("Ah intoducido este numero de caracteres: " + texto.length());
    System.out.println ("Ah introducido este numero de palabras : "+ numero.countTokens());

}
}