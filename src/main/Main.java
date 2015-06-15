package main;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("John");
		Animal cachorro = new Animal();
		p.setPet(cachorro);
		System.out.println("Hello " + p.getNome() + "!!!");
	}

}
