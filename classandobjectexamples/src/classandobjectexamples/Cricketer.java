package classandobjectexamples;

public class Cricketer {
	  void Fav(){
		String name= "dhoni";
		int age = 36;
		String role= "batsman";
		String nationality="Indian";
		String RIT= "captain";
		System.out.println("my favorite cricteter is "+ name +" his age was " + age+". He is also an " +RIT+ " with a role of " +role+" and Iam proud of he is a "+nationality);
	}

	public static void main(String[] args) {
		Cricketer dhoni=new Cricketer();
		dhoni.Fav();

	}

}
