package SistemaBancario.logica;

import SistemaBancario.dominio.*;

public class SistemaBancarioImpl implements SistemaBancario {
	private ListaPersona listaPersonas;
	private ListaCuenta listaCuentas;
	public SistemaBancarioImpl() {
		listaPersonas=new ListaPersona(100);
		listaCuentas=new ListaCuenta(100);
		
	}
	public boolean ingresarPersona(String rut,String nombre,String apellido,String contrase�a, int matriz[][]) {
		Persona persona=new Persona(rut,nombre,apellido,contrase�a,matriz);
		return listaPersonas.IngresarPersona(persona);
	}
	public boolean ingresarCuentaCorriente(String numeroCuenta,String rutTitular,String contrase�a,long saldo) {
		Cuenta cuentaC=new CuentaCorriente(numeroCuenta,rutTitular,contrase�a,saldo);
		return listaCuentas.IngresarCuenta(cuentaC);
	}
	public boolean ingresarCuentaChequeraElectronica(String numeroCuenta,String rutTitular,String contrase�a,long saldo) {
		Cuenta cuentaChequeraE=new CuentaChequeraElectronica(numeroCuenta,rutTitular,contrase�a,saldo);
		return listaCuentas.IngresarCuenta(cuentaChequeraE);
	}
	public boolean verificarCuentaInicioSesion(String rut ,String contrase�aInicio) {
		Persona persona=listaPersonas.BuscarPersona(rut)
		
	}
	
	

}
