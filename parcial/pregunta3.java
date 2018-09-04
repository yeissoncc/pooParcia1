package parcial;

import java.util.Scanner;

class pregunta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		int HorasT,SueldoH,ExtraH,Sueldo;
		String Nombre;
		
		System.out.print("digite el nombre del empleado: ");
		Nombre = teclado.nextLine();
		System.out.print("ingrese las Horas trabajadas:  ");
		HorasT = teclado.nextInt();
		System.out.print("ingrese el sueldo por hora:  ");
		SueldoH = teclado.nextInt(); 
		System.out.print("ingrese las horas extras: ");
		System.out.println("diunar 1: ");
		System.out.println("nocturna 2: ");
		System.out.println("diunar dominical 3: ");
		System.out.println("nocturna Dominical 4: ");
		
		ExtraH = teclado.nextInt();
		
		if(ExtraH == 1){
			System.out.print("1 : ");
			
			if(ExtraH == 2){
				System.out.print("2 : ");
				
				if(ExtraH == 3){
					System.out.print("3 : ");
					
					if(ExtraH == 4){
						System.out.print("4 : ");
						
						
						
					}
					
				}
				
				
				
			}
			
		}
		
		
		Sueldo = ((HorasT*SueldoH));
		
		
		System.out.println("su sueldo es del empleado "+Nombre+" es de: "+Sueldo);

	}

}
