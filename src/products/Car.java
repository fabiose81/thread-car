package products;
import java.util.ArrayList;
import java.util.List;

import pieces.*;

public class Car {
	
	private String serie;
	private Motor motor;
	private List<Tire> tire = new ArrayList<Tire>();
	private List<Door> door = new ArrayList<Door>();
	
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public List<Tire> getTire() {
		return tire;
	}
	public void setTire(List<Tire> tire) {
		this.tire = tire;
	}
	public List<Door> getDoor() {
		return door;
	}
	public void setDoor(List<Door> door) {
		this.door = door;
	}
	
}
