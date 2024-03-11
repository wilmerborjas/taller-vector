package com.wbg.taller.java;

public class VectorApp {

	public static void main(String[] args) {
//
		String[] nombres = new String[3];
//
//		int[] numerosEnteros = new int[10];
//
//		double[] numerosDobles = new double[4];

		String[] productos = new String[3];

		double[] valoresProducto = new double[3];
//
		nombres[0] = "Andres";
//		System.out.println("nombre = " + nombres[0]);
//		nombres[1] = "Pablo";
//		System.out.println("nombre = " + nombres[1]);
//		nombres[2] = "Carlos";
//		System.out.println("nombre = " + nombres[2]);
//
//		numerosEnteros[0] = 15;
//		System.out.println("edad = " + numerosEnteros[0]);
//
//		numerosEnteros[1] = 50;
//		System.out.println("años = " + numerosEnteros[1]);

		productos[0] = "Cocacola ";
		productos[1] = " Vino";
		productos[2] = "Trina";

		valoresProducto[0] = 10.50;
		valoresProducto[1] = 3.50;
		valoresProducto[2] = 4.50;

		Factura factura = new Factura();
		factura.getFactura(productos, valoresProducto);

	}

}
