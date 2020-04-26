package entidades;

public class Vendedores extends Empleado{
	private float porcCom;
	private float totVentas;
	
	public float getPorcCom() {
		return porcCom;
	}
	public void setPorcCom(float porcCom) {
		this.porcCom = porcCom;
	}
	public float getTotVentas() {
		return totVentas;
	}
	public void setTotVentas(float totVentas) {
		this.totVentas = totVentas;
	}
	
	public Vendedores(int dni,String nombre,String apellido,float sueldo,float com,float tot) {
		super.setEmpleado(dni,nombre,apellido,sueldo);
		this.setPorcCom(com);
		this.setTotVentas(tot);;
	}
	
	public double calcSueldo() {
		return super.getSueldoBase()+(getPorcCom()*getTotVentas()/100);
	}

}
