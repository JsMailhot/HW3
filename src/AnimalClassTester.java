public class AnimalClassTester {
	public boolean testAnimalObject(Animal animal) {
		if(!(animal.name() instanceof String))
		{
			return false;
		}
		if(!(animal.diet() instanceof String))
		{
			return false;
		}
		if(!(animal.does() instanceof String))
		{
			return false;
		}
		return true;
	}
}
