package entidades;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private float sueldoBase;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public void setEmpleado(int dni,String nombre,String apellido,float sueldo) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setSueldoBase(sueldo);
	}
	
	public abstract double calcSueldo();	

}
