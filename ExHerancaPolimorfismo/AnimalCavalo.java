package ExercícioPolimorfismo;

public class AnimalCavalo extends Animal {
	public AnimalCavalo () 
	{
		super ("Cavalo", 0);
		}
	
	@Override
	public void som () 
	{
		System.out.println("Pocotó... Pocotó");
	
	}
	@Override
	public void correr() 
	{
		System.out.println("Este cavalo é de Corrida!!!!");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		System.out.println(" ");
	}
	
}

	

