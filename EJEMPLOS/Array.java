import java.util.Scanner;
class Array{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	int dias [] = new int [12];
	for(int i=0; i<12; i++){
	System.out.println("Los dias del mes " +i+ " son: ");
	dias[i] = sc.nextInt();
	}
	}
}