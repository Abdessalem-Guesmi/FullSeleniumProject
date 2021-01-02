package model;

public class Vehicule {
	private int vitesse;

	public Vehicule() {
		System.out.println("my vehicule!!!");
	}

	public Vehicule(int vitess) {
		this.vitesse = vitess;
		System.out.println("my vehicule " + vitess);
	}
}
