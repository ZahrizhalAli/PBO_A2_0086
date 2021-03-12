package bacadata;


import java.util.Scanner;
public class BacaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Contoh membaca dan menulis ketik nilai integer: \n");
		Scanner masukan = new Scanner(System.in);
		
		a = masukan.nextInt(); 
		
		System.out.println("Nilai yang dibaca: "+ a);
	}

}
