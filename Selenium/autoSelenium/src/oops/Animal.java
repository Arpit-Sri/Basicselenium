package oops;


//Parent Animal

class Animal {
	
	
	void eat()
	{
		System.out.println("this animal eats food");
	}

}

//child 

class Dog extends Animal {
	
	void bark() {
		
		System.out.println("the dog barks");
	
}

public class InheritancExample{
	
	public static void main(String args[]) {
		
		Dog myDog=new Dog();  //creating an instance of 'Dog'.
		
		Animal d = new Dog(); //
		
		Animal a= new Animal(); //
		
		//Dog g = new Animal(); 		
		
		
		myDog.eat();  //Inherited method 
		myDog.bark();  //Dog's own method
		d.eat();
		//a.bark();
		a.eat();
		
		Cat myCat = new Cat();
		
	}
	
}
	
	
}

class Cat extends Animal {
	
	
	void meow()
	{
		System.out.println("this animal does meow");
	}

}





