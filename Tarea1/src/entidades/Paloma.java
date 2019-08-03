package entidades;

public class Paloma {
	
	private int medida;
	private String color;
	
	public String volar () {
		return "Vuela vuela";
	}
	
	public Paloma () {
	}
	
	public Paloma (int medida, String color) {
		this.medida = medida;
		this.color = color;
	}
	
	public String toString(){
		return "medida: "+medida+ " y "+ "color: " +color;
	}
	
	public void setMedida (int medida) {
	this.medida = medida;
	}
	
	public int getMedida () {
		return medida;
	}
}	
