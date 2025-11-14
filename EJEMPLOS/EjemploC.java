import java.util.Scanner;
public class EjemploC{
	public static void main(String args[]){
	int arreglito[]= new int[5];
	Scanner sc= new Scanner(System.in);
	for (int i=0; i<5; i++) {
		System.out.println("Introduce un numero entero");
		arreglito[i]= sc.nextInt();
		}
	}
}