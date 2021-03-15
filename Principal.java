// package promedionotas

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author SAAVE
 */
public class Principal
{
	public static void main(String[] args) {
		double notaA;
		double notaB;
		double notaC;
		double suma;
		double prom;

		Scanner entrada = new Scanner(System.in);

		System.out.println("");
		System.out.print("Por favor digite la primera nota: ");
		notaA = entrada.nextDouble();
		System.out.print("Por favor digite la segunda nota: ");
		notaB = entrada.nextDouble();
		System.out.print("Por favor digite la tercera nota: ");
		notaC = entrada.nextDouble();
		
		suma = (notaA+notaB+notaC);
		prom = suma / 3;
		JOptionPane.showMessageDialog(null, "El promedio del estudiante es: "+prom, "Programar & Aprender", 
			JOptionPane.INFORMATION_MESSAGE);
	}
}