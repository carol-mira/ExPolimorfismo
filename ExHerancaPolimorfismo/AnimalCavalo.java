package Exerc�cioPolimorfismo;

public class AnimalCavalo extends Animal {
	public AnimalCavalo () 
	{
		super ("Cavalo", 0);
		}
	
	@Override
	public void som () 
	{
		System.out.println("Pocot�... Pocot�");
	
	}
	@Override
	public void correr() 
	{
		System.out.println("Este cavalo � de Corrida!!!!");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		System.out.println(" ");
	}
	
}

	

