package diccionarioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiccionarioLista {
	static void mostrarMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("1. Introducir un término y su definición");
		System.out.println("2. Mostrar todos los términos (sin definiciones)");
		System.out.println("3. Obtener definición");
		System.out.println("4. Eliminar un término y su definición");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Palabra> diccionario = new ArrayList<>();
		Palabra p=new Palabra();
		int opc;
		String term;
		String def;
		
		do {
			DiccionarioLista.mostrarMenu();
			opc=sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Introduce el término:");
				term=sc.next();
				sc.nextLine();
				System.out.println("Introduce la definición:");
				def=sc.nextLine();
				p=new Palabra(term, def);
				diccionario.add(p);
				break;
			case 2:
				for(Palabra t:diccionario) {
					System.out.print(t.getTermino()+" ");
				}
				System.out.println();
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(opc!=0);
		
	}

}

class Palabra {
	String termino;
	String definicion;

	Palabra(){
		
	}
	
	Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	String getTermino() {
		return termino;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	String getDefinicion() {
		return definicion;
	}

	void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

}