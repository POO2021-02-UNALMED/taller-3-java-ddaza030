package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca1, boolean estado1) {
		marca = marca1;
		estado = estado1;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public void setMarca(Marca i) {
		marca = i;
	}
	public Marca getMarca(){
		return marca;
	}
	public void setControl(Control i) {
		control = i;
	}
	public Control getControl() {
		return control;
	}
	public void setVolumen(int i) {
		if(i>=0 && i<=7) {
			volumen = i;
		}
	}
	public int getVolumen() {
		return volumen;
	}
	public void setCanal(int i) {
		if(i>=1 && i<=120) {
			canal = i;
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setPrecio(int i) {
	 precio = i;
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
	public static void setNumTV(int i) {
		numTV=i;
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
