package parcial;

import java.util.Scanner;

class pregunta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		int Dato,F;
		
		teclado = new Scanner(System.in);
		
		System.out.print("ingrese los grados C° que desas transformar a F° : ");
		Dato = teclado.nextInt();
		
		F= (32+(9*Dato/5));
		
		System.out.println("el cambio de C° a F° es de: "+F+"°");
		

	}

}
