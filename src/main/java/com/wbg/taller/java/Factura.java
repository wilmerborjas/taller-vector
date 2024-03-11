package com.wbg.taller.java;

public class Factura {

	public double getFactura(String[] productos, double[] valores) {
		System.out.println("producto 0 = " + productos[0] + " valorProducto 0 = " + valores[0]);
		System.out.println("producto 1 = " + productos[1] + " volorProducto 1 =  " + valores[1]);
		System.out.println("Producto 2 = " + productos[2] + " valorProducto 2 = " + valores[2]);

		double subtotal = valores[0] + valores[1] + valores[2];
		System.out.println("subtotal = " + subtotal);
		return subtotal;
		
	 
		}

	}


