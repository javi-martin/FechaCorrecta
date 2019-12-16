package es.studium.FechaCorrecta;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) 
	{
		int dia, mes, anyo;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
																		
		System.out.println("Indica un número correspondiente al dia");
		dia = teclado.nextInt();
		
		System.out.println("Indica un número correspondiente al mes");
		mes = teclado.nextInt();
		
		System.out.println("Indica un número correspondiente al año");
		anyo = teclado.nextInt();
		
		teclado.close();
		
		if(dia<1 || mes<1 || mes>12 || anyo<1)
		{
			System.out.println("La fecha es incorrecta");
		}
		else 
		{
			switch(mes) 
			{
			case 1:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 3:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 5:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 7:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 8:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 10:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 12:
				if(dia<=31) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 4:
				if(dia<=30) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 6:
				if(dia<=30) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 9:
				if(dia<=30) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 11:
				if(dia<=30) 
				{
					System.out.println("La fecha es correcta");
				}
				else
				{
					System.out.println("La fecha es incorrecta");
				}
				
			case 2:
				if(dia<29) 
				{
					System.out.println("La fecha es correcta");
				}
				else 
				{
					if(dia==29)
					{
						if((anyo%4==0) && (anyo%100!=0) || (anyo%400==0))
						{
							System.out.println("La fecha es correcta");
						}
						else
						{
							System.out.println("La fecha es incorrecta");
						}
					}
				}
			}
		}
	}

}
