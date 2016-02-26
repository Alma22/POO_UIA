public class Ejercicio1
 {
 	public static void main(String[] args){
int a = 10, b = 3, d, e;
float x, y;
boolean c=true; /* declaramos "c", como boolean, por que estan 
                *utilizando operadores lógicos en la linea 11.
                */
x = a/b;
c = a < b && c; // Aqui opera "c", con operadores lógicos.
d = a + b++;
e = ++a - b;
y = (float)a/b;

  System.out.println(x);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
  System.out.println(y);
}
}