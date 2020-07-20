package SistemaBancario.logica;

import SistemaBancario.dominio.*;

public class SistemaBancarioImpl implements SistemaBancario {
	private ListaPersona listaPersonas;
	private ListaCuenta listaCuentas;
	public SistemaBancarioImpl() {
		listaPersonas=new ListaPersona(100);
		listaCuentas=new ListaCuenta(100);
		
	}
	public boolean ingresarPersona(String rut,String nombre,String apellido,String contraseņa, int matriz[][]) {
		Persona persona=new Persona(rut,nombre,apellido,contraseņa,matriz);
		return listaPersonas.IngresarPersona(persona);
	}
	public boolean ingresarCuentaCorriente(String numeroCuenta,String rutTitular,String contraseņa,long saldo) {
		Cuenta cuentaC=new CuentaCorriente(numeroCuenta,rutTitular,contraseņa,saldo);
		return listaCuentas.IngresarCuenta(cuentaC);
	}
	public boolean ingresarCuentaChequeraElectronica(String numeroCuenta,String rutTitular,String contraseņa,long saldo) {
		Cuenta cuentaChequeraE=new CuentaChequeraElectronica(numeroCuenta,rutTitular,contraseņa,saldo);
		return listaCuentas.IngresarCuenta(cuentaChequeraE);
	}
	public boolean verificarCuentaInicioSesion(String rut ,String contraseņaInicio) {
		Persona persona=listaPersonas.BuscarPersona(rut)
		
	}
	
	

}
