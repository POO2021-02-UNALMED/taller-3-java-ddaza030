package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv1) {
		tv = tv1;
		tv1.setControl(this);
	}
	public void setTv(TV i) {
		tv = i;
		i.setControl(this);
	}
	public TV getTv() {
		return tv;
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal1) {
		tv.setCanal(canal1);
	}
}
