package collections;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import products.Car;

public class Stock {
	
	private List<Piece> listMotor = new ArrayList<Piece>();
	private List<Piece> listTire = new ArrayList<Piece>();
	private List<Piece> listDoor = new ArrayList<Piece>();
	private List<Car> listCar = new ArrayList<Car>();
	
	public List<Piece> getListMotor() {
		return listMotor;
	}
	public void setListMotor(List<Piece> listMotor) {
		this.listMotor = listMotor;
	}
	public List<Piece> getListTire() {
		return listTire;
	}
	public void setListTire(List<Piece> listTire) {
		this.listTire = listTire;
	}
	public List<Car> getListCar() {
		return listCar;
	}
	public void setListCar(List<Car> listCar) {
		this.listCar = listCar;
	}
	public List<Piece> getListDoor() {
		return listDoor;
	}
	public void setListDoor(List<Piece> listDoor) {
		this.listDoor = listDoor;
	}

}
