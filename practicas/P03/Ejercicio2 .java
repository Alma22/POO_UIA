public class Ejercicio2 {                                                     // Abrimos nuestra clase. Una clase define nuestros objetos, constructores y métodos. //

    public static void main (String [] args) {                          // Abrimos nuestro método "main". //

        double a = 1, b = 5, c = 2, resultado;                          // Declaración e inicialización de variables tipo double. //
        double x, x1, y1, y, z, res, base, exponente;                                    // Declaración sin inicialización de variables tipo double. // 

        base = b;
        res = base;
        exponente = 2;
        
        for (int i = 1; i < exponente; ++i) {                       // Abrimos un bucle. Nuestro bucle continuará hasta que se haya multiplicado las veces que sean necesarias para llegar al exponente. //  

            res = res * base;                                           // Resolución es igual a res (que fue inicializada con el mismo valor que base) por base. //

        }

        x = res;

        y1 = a * c;                                                 // Paso 2: Resolvemos "ac". //

        y = 4 * y1;                                                 // Paso 3:  Resolvemos "4ac". //

        z = 2 * a;                                                  // Paso 4: Resolvemos "2a". //

        x1 = x - y;                                                 // Paso 5: Resolvemos "b^2 - 4ac". //

        resultado = x1 / z;                                         // Paso 6: Resolvemos la división del resto de "b^2 - 4ac" entre "2a". //

        System.out.println(resultado);                              // Paso 7: Imprimimos el resultado. //


    }   
}