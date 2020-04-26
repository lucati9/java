package ui;

import java.util.Scanner;

import entidades.*;


public class Principal {
	
	static Empleado[] empleados=new Empleado[20];
	static int cont=0;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int opc=1;
		System.out.println("Alta empleados");
		
		while(opc!=0) {
			System.out.println();
			System.out.print("1-Administrativo;2-Vendedor;0-Salir: ");
			opc=sc.nextInt();
			System.out.println();
			
			switch(opc) {
			case 1: altaAdm();
					break;
			case 2: altaVnd();
					break;
			case 0: System.out.println("Saliendo...");
					break;
			default: System.out.println("Opcion invalida");
			}
		}
	sc.close();	
	System.out.println();
	mostrar();

	}
	
	public static void altaAdm() {
		System.out.print("Ingrese dni: ");
		int dni=sc.nextInt();
		sc.nextLine();//limpia buffer
		System.out.print("Ingrese nombre: ");
		String nom=sc.nextLine();
		System.out.print("Ingrese apellido: ");
		String ape=sc.nextLine();
		System.out.print("Ingrese sueldo base: ");
		float sb=sc.nextFloat();
		System.out.print("Ingrese hs/mes: ");
		float hm=sc.nextFloat();
		System.out.print("Ingrese hs extra: ");
		float he=sc.nextFloat();
		
		empleados[cont++]=new Administrativo(dni,nom,ape,sb,he,hm);
	}
	
	public static void altaVnd(){
		System.out.print("Ingrese dni: ");
		int dni=sc.nextInt();
		sc.nextLine();//limpia buffer
		System.out.print("Ingrese nombre: ");
		String nom=sc.nextLine();
		System.out.print("Ingrese apellido: ");
		String ape=sc.nextLine();
		System.out.print("Ingrese sueldo base: ");
		float sb=sc.nextFloat();
		System.out.print("Ingrese comision: ");
		float pc=sc.nextFloat();
		System.out.print("Ingrese total: ");
		float tv=sc.nextFloat();
		
		empleados[cont++]=new Vendedores(dni,nom,ape,sb,pc,tv);
	}
	
	public static void mostrar() {
		System.out.println("Listado de empleados");
		System.out.println();
		System.out.println("  Dni  -  Nombre, Apellido  - Sueldo");
		for(int i=0; i<cont; i++) {
			System.out.println();
			System.out.println(empleados[i].getDni()+" - "+empleados[i].getNombre()+", "+
					           empleados[i].getApellido()+" - "+empleados[i].calcSueldo());
		}
	}

}
