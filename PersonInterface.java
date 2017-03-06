public interface PersonInterface <P extends Person>  {
	
	P create(String name, String surname, Integer number);
}
