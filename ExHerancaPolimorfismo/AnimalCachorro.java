package Exerc�cioPolimorfismo;

public class AnimalCachorro extends Animal {
	
	public AnimalCachorro () 
	{
		super ("Cachorro",0);
		}
	
	@Override
	public void som () 
	{
		System.out.println("auauauauauaua");
	
	}
	@Override
	public void correr() 
	{
		System.out.println("Corro atr�s do Carteiro!!!!");
		System.out.println("Sou um Cachorrinho :)");
	}

	@Override
	public void subir() {
	}
	
}
