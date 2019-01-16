

public class Person {
	String name  ;
	String Superpower  ;
	
	String getname() {
		return name;
		
	}
	String getSuperpower() {
		return Superpower;
		
	}
 void setname(String name) {
	 this.name=name;
 }

void setSuperpower(String Superpower) {
	 this.Superpower=Superpower;
}

public String toString() {
	String c = "Name: " + name;
	c += "\nSuperpower: " + Superpower;
	return c;
}

}