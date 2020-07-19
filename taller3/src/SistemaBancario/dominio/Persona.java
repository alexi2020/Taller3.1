package SistemaBancario.dominio;
import SistemaBancario.logica.*;

public class Persona {
	private String rut;
	private String nombre;
	private String apellido;
	private String contrase�aInicio;
	private int[][] tarjetaCoordenadas;
	private ListaCuenta listaCuenta;
	public Persona(String rut, String nombre, String apellido, String contrase�aInicio, int[][] tarjetaCoordenadas) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrase�aInicio = contrase�aInicio;
		this.tarjetaCoordenadas = tarjetaCoordenadas;
		listaCuenta=new ListaCuenta(100);
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the contrase�aInicio
	 */
	public String getContrase�aInicio() {
		return contrase�aInicio;
	}
	/**
	 * @param contrase�aInicio the contrase�aInicio to set
	 */
	public void setContrase�aInicio(String contrase�aInicio) {
		this.contrase�aInicio = contrase�aInicio;
	}
	/**
	 * @return the tarjetaCoordenadas
	 */
	public int[][] getTarjetaCoordenadas() {
		return tarjetaCoordenadas;
	}
	/**
	 * @param tarjetaCoordenadas the tarjetaCoordenadas to set
	 */
	public void setTarjetaCoordenadas(int[][] tarjetaCoordenadas) {
		this.tarjetaCoordenadas = tarjetaCoordenadas;
	}
	/**
	 * @return the listaCuenta
	 */
	public ListaCuenta getListaCuenta() {
		return listaCuenta;
	}
	/**
	 * @param listaCuenta the listaCuenta to set
	 */
	public void setListaCuenta(ListaCuenta listaCuenta) {
		this.listaCuenta = listaCuenta;
	}
	public String toString() {
		return"Rut:"+rut+" Nombre:"+nombre+" Apellido:"+apellido+"\n";
		
	}
}
