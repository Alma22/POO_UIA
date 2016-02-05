import java.io.*;
class  factorial
{
  public static void main (String arg []) throws IOException
   {int n,a,x;
BufferedReader dat=new BufferedReader (new InputStreamReader(System.in));
  do{
     System.out.print("Ingrese el numero: ");
	n=Integer.parseInt(dat.readLine());
	a=n;x=n;
	if(n>33){System.out.println("ingrese un numero menor a 34");}
    }while(a>33);
  do {n=n-1;
      a=a*n;
     }while(n>1);
	
	System.out.println("la factorial de "+x+" es: " +a);
   }
}