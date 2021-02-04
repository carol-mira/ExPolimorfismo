package ExercícioPolimorfismo;

public class TesteAnimal {
	public static void main(String[] args) 
	{
		AnimalCachorro cachorro = new AnimalCachorro();
		AnimalCavalo cavalo = new AnimalCavalo();
		AnimalPreguica preguica = new AnimalPreguica();
		
		Animal animal = null;
		
		int n = (int) (Math.random()*3.0); //conta para chamar um número randomico
		System.out.println("Animal escolhido: "+n);
		
		switch (n)
		{
		
		case 0 : animal = cachorro; break;
		case 1: animal = cavalo; break;
		case 2: animal = preguica; break;
		default: System.out.println("Tente novamente :(");
		}
		
		if(animal!=null)
		{
			animal.som();
			animal.correr();
			animal.subir();
			
		}
	}

}
