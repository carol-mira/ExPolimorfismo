package ExercícioPolimorfismo;

public class AnimalPreguica extends Animal {
	
	public AnimalPreguica () 
	{
		super ("Preguiça", 0);
		}
	
	@Override
	public void som () 
	{
		System.out.println("Shiiiiiuuuu...Shiiiiuuuu...");
	
	}
	@Override
	public void correr() 
	{
		System.out.println("Não corro, fico parado, pois sou uma Preguicinha;)");
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		System.out.println("Estou subindo a árvaro, para comer :)");
	}
	
}


