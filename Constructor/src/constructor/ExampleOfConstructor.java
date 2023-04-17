package constructor;

public class ExampleOfConstructor {
	//Java Program to demonstrate the use of the parameterized constructor.  
	 
	    int id;  
	    String name;    
	    ExampleOfConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }   
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   
	    public static void main(String args[]){  
	      
	    	ExampleOfConstructor s1 = new ExampleOfConstructor(111,"surya");  
	    	ExampleOfConstructor s2 = new ExampleOfConstructor(222,"Arya");  
	      
	    s1.display();  
	    s2.display();  
	   }  

}
