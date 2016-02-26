public class Ejercicio2 {                                                     // Abrimos nuestra clase. Una clase define nuestros objetos, constructores y métodos. //

    public static void main (String [] args) {                          // Abrimos nuestro método "main". //

        double a = 1, b = 5, c = 2, resultado;                          // Declaración e inicialización de variables tipo double. //
        double var1, var2, var3, var4, var5, resultado, cuadrado;                                    // Declaración sin inicialización de variables tipo double. // 

        cuadrado = b;
        exponente = 2;
        
        cuadrado = cuadrado * b;                                           // Resolución es igual a res (que fue inicializada con el mismo valor que base) por base. //

        var1 = cuadrado;

        var3 = a * c;                                                 // Paso 2: Resolvemos "ac". //

        var2 = 4 * var3;                                                 // Paso 3:  Resolvemos "4ac". //

        var5 = 2 * a;                                                  // Paso 4: Resolvemos "2a". //

        var2 = var1 - var4;                                                 // Paso 5: Resolvemos "b^2 - 4ac". //

        resultado = var2 / var5;                                         // Paso 6: Resolvemos la división del resto de "b^2 - 4ac" entre "2a". //

        System.out.println(resultado);                              // Paso 7: Imprimimos el resultado. //


    }   
}