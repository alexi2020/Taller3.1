package SistemaBancario.dominio;

public class Cuenta {
	private String numeroCuenta;
	private String rutTitular;
	private String contrase�aCuenta;
	private long saldo;
	
	public Cuenta(String numeroCuenta, String rutTitular, String contrase�aCuenta, long saldo) {
		this.numeroCuenta = numeroCuenta;
		this.rutTitular = rutTitular;
		this.contrase�aCuenta = contrase�aCuenta;
		this.saldo = saldo;
		this.estado = estado;
	}
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the rutTitular
	 */
	public String getRutTitular() {
		return rutTitular;
	}
	/**
	 * @param rutTitular the rutTitular to set
	 */
	public void setRutTitular(String rutTitular) {
		this.rutTitular = rutTitular;
	}
	/**
	 * @return the contrase�aCuenta
	 */
	public String getContrase�aCuenta() {
		return contrase�aCuenta;
	}
	/**
	 * @param contrase�aCuenta the contrase�aCuenta to set
	 */
	public void setContrase�aCuenta(String contrase�aCuenta) {
		this.contrase�aCuenta = contrase�aCuenta;
	}
	/**
	 * @return the saldo
	 */
	public long getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the estado
	 */
	
	

}
