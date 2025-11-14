import java.util.Scanner;
public class EjemploD{
	public static void main(String args[]){
	int arreglito[]= new int[5];
	Scanner sc= new Scanner(System.in);
	for (int j=0; j<5; j++) {
	System.out.println("Dame un numero entero");
	arreglito[j]=sc.nextInt();
	}
		System.out.println("Tus numeros son: ");
		for (int j=0; j<5; j++) {
		System.out.println(arreglito[j]);
		}
	}
}