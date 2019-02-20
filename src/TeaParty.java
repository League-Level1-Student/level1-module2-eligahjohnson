
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting = "Hello ";
		if (isWoman == true && isKnighted == true){
			greeting = greeting + "Lady " + name;
			
		}
		else if  (isWoman == false && isKnighted ) { 
			greeting = greeting + " Sir" + name ;
		}
		
		return greeting ;
	}

}
