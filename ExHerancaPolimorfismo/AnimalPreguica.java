package Exerc�cioPolimorfismo;

public class AnimalPreguica extends Animal {
	
	public AnimalPreguica () 
	{
		super ("Pregui�a", 0);
		}
	
	@Override
	public void som () 
	{
		System.out.println("Shiiiiiuuuu...Shiiiiuuuu...");
	
	}
	@Override
	public void correr() 
	{
		System.out.println("N�o corro, fico parado, pois sou uma Preguicinha;)");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		System.out.println("Estou subindo a �rvaro, para comer :)");
	}
	
}


