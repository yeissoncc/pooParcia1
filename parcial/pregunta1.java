package parcial;

import java.util.Scanner;

class pregunta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado;
		int Dato1,Dato2,Rango,Resultado;
		
		teclado = new Scanner(System.in);
		
		System.out.println("ingrese deseas realizar 1 suma");

		
		System.out.print("introducir primer dato 1: ");
		Dato1 = teclado.nextInt();
		System.out.print("introducir segundo dato 2: ");
		Dato2 = teclado.nextInt();
		System.out.println("ingrese deseas realizar 1 suma");
		System.out.println("ingrese deseas realizar 2 resta");
		System.out.println("ingrese deseas realizar 3 multiplicasion");
		System.out.println("ingrese deseas realizar 4 division");
		
		System.out.print("introducir segundo dato: ");
		Rango = teclado.nextInt();
		
		
		
		if(Rango==1) {
			
			Resultado = Dato1+Dato2;
		
			System.out.println("la suma es de: "+Resultado);
			
		}else {
			if(Rango ==2 ) {
				
				Resultado = Dato1-Dato2;
				
				System.out.println("la resta ");
				
			}else {
				
				if (Rango == 3) {
					
					Resultado = Dato1*Dato2;
					System.out.println("la multiplicasion ");
					
					
					
				}else {
					if(Rango == 4) {
						
						Resultado = Dato1/Dato2;
						
						System.out.println("division ");
						
					}else {
						System.out.println("la operacion no se puede realizar ");
					}
				}
			}
		}

	}

}
