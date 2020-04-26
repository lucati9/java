package entidades;

public class Administrativo extends Empleado{
	private float hsExtra;
	private float hsMes;
	
	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(float hsExtra) {
		this.hsExtra = hsExtra;
	}
	public float getHsMes() {
		return hsMes;
	}
	public void setHsMes(float hsMes) {
		this.hsMes = hsMes;
	}
	
	public Administrativo(int dni,String nombre,String apellido,float sueldo,float extra,float mes) {
		super.setEmpleado(dni,nombre,apellido,sueldo);
		this.setHsExtra(extra);
		this.setHsMes(mes);
	}
	
	public double calcSueldo() {
		return super.getSueldoBase()*((getHsExtra()*1.5)+getHsMes())/getHsMes();
	}

}
