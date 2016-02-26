import java.io.*;
public class Practica1{
  public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);  
    BufferedReader leer = new BufferedReader(isr);            
    System.out.print("Introduzca un texto: ");
    String texto = leer.readLine();
    for (int i = 0; i <= texto.length()-1; i++) { 
      texto = texto.charAt(texto.length()-1) + texto.substring(0, texto.length() - 1); /*El metodo charArt hace que
                                                                                        *la cadena se divida por celdas,
                                                                                        *para sacar los caracteres
                                                                                        */

      System.out.println(texto);
        }
    }
}