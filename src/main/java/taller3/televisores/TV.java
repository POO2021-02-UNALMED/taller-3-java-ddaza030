package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca(){
		return marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public Control getControl() {
		return control;
	}
	public void setVolumen(int volumen) {
		if(volumen>=0 && volumen<=7) {
			this.volumen = volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int canal) {
		if(canal>=1 && canal<=120) {
			this.canal = canal;
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setPrecio(int precio) {
	 this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	public boolean getEstado() {
		return estado;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	// prender y apagar el tv
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	
	
	// subir y bajar canal
	public void canalUp() {
		if(canal < 120 && estado == true) {
			canal++;
		}
	}
	public void canalDown() {
		if(canal>1 && estado == true) {
			canal--;
		}
	}
	// subir y bajar el volumen
	public void volumeUp() {
		if(volumen<7 && estado == true) {
			volumen++;
		}
	}
	public void volumeDown() {
		if(volumen>0 && estado == true) {
			volumen--;
		}
	}
	
	

}
