package main;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("John");
		System.out.println("Hello " + p.getNome() + "!!!");
		Animal cachorro = new Animal();
		p.setPet(cachorro);
	}

}
