package SistemaBancario.logica;

public interface SistemaBancario {
	
	
	
	public boolean ingresarPersona(String rut,String nombre,String apellido,String contrase�a, int matriz[][]);
	
	public boolean ingresarCuentaCorriente(String numeroCuenta,String rutTitular,String contrase�a,long saldo);

	public boolean ingresarCuentaChequeraElectronica(String numeroCuenta,String rutTitular,String contrase�a,long saldo);
	
	public boolean verificarCuentaInicioSesion(String rut ,String contrase�aInicio);
	
	public boolean Depositar(long monto,String rut, String numeroCuenta);
	
	public boolean Girar(long monto ,String numeroCuenta ,String contrase�a,String rut);
	
	public long obtenerSaldo(String numeroCuenta);
	
	public boolean Transferir(long monto,String numeroCuentaOrigen, String numeroCuentaDesti,int C1 ,int F1,int numero1,
			int C2 ,int F2,int numero2,int C3 ,int F3,int numero3);
	
	public String ObtenerInformacionCuenta(String rut);
	
	public boolean BloquearCuentas(String rut,String numeroCuenta,String contrase�aInicio ,String contrase�aCuenta);
	
	public boolean ActualizarContrase�aInicioSesion(String rut,String contrase�aActual,String contrase�aNueva);
	
	public boolean ActualizarContrase�aCuenta(String rut,String numeroCuenta,String contrase�aActual,String contrase�aNueva);
	

}
