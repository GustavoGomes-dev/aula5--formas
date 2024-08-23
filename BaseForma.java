package aulao6;

public class BaseForma {
	
	private double base;
	
	private double largura;
	
	private double altura;

	public BaseForma(double base, double largura, double altura) {
		this.base = base;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base * altura / 2;
	}
	
	
	public double calcularArea2() {
		return largura * altura;
	}
	
	public String mostrarinfo() {
		return "Base : " + base + ", Altura: " + altura;
	}
	
	public String mostrarinfo2() {
		return "Largura:" + largura + ", Altura: " + altura;
	}

}
