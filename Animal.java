	import java.util.*;

	class Animal implements Comparable<Animal> {
		String name;
		int age;
		String species;

		public Animal(String species, int age, String name){
			this.name = name;
			this.age = age;
			this.species = species;
		}
		public Animal(){

		}


		
		public void setName(String n){
			this.name = n;
		}
		public void setAge(int a){
			this.age = a;
		}
		public void setSpecies(String s){
			this.species = s;
		}

		public String getName(){
			return this.name;
		}
		public String getSpecies(){
			return this.species;
		}
		public int getAge(){
			return this.age;
		}


	    public int compareTo(Animal a) {
	    	//compares and sorts the animal species names if they are not the same
	    	if(this.species.compareTo(a.species)!=0){
	    		return this.species.compareTo(a.species);
	    	}
	    	//otherwise, sort by comparing the age
	    	else if(this.age - a.age != 0){
	    		return this.age - a.age;
	    	}
	    	// if the age is the same, compare the name
	        return this.name.compareTo(a.name);
	    }

	    public String toString(){
	    	return species+", "+age+", "+name;
	    }


	    public static void main(String[] args){
	    	ArrayList<Animal> animals = new ArrayList<Animal>();
	    	System.out.println("WELCOME TO THE ANIMAL CREATOR. CREATE AN ANIMAL HERE.");
	    	boolean cotd = true;
	    	while(cotd){
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("WHAT IS YOUR SPECIES (CAT, DOG, OR OTHER)");
	    	String input = scan.nextLine().toLowerCase();
	    	if(input.equals("cat")){
	    		System.out.println("WHAT IS THE CATS AGE");
	    		int inputAge = scan.nextInt();
	    		System.out.println("WHAT IS THE CATS NAME");
	    		String buffer = scan.nextLine();
	    		String inputName = scan.nextLine();
	    		System.out.println("ACCEPTED");
	    		animals.add(new Cat(inputName, inputAge));
	    		System.out.println("WOULD YOU LIKE TO ADD ANOTHER ANIMAL? (YES OR NO)");
	    	}
	    	else if(input.equals("dog")){
	    		System.out.println("WHAT IS THE DOGS AGE");
	    		int inputAge = scan.nextInt();
	    		System.out.println("WHAT IS THE DOGS NAME");
	    		String buffer = scan.nextLine();
	    		String inputName = scan.nextLine();
	    		System.out.println("ACCEPTED");
	    		animals.add(new Dog(inputName, inputAge));
	    		System.out.println("WOULD YOU LIKE TO ADD ANOTHER ANIMAL? (YES OR NO)");
	    	}
	    	else {
	    		System.out.println("WHAT IS THE " +input.toUpperCase()+ "'S AGE");
	    		int inputAge = scan.nextInt();
	    		System.out.println("WHAT IS THE " +input.toUpperCase()+ "'S NAME");
	    		String buffer = scan.nextLine();
	    		String inputName = scan.nextLine();
	    		System.out.println("ACCEPTED");
	    		animals.add(new Animal(input,inputAge,inputName));
	    		System.out.println("WOULD YOU LIKE TO ADD ANOTHER ANIMAL? (YES OR NO)");

	    	}
	    	String c = scan.nextLine().toLowerCase();
	    	if(c.equals("yes")||c.equals("yeah")||c.equals("sure")||c.equals("ye")||c.equals("y")){
	    		cotd = true;
	    	}
	    	else{
	    		cotd = false;
	    	}
	    }
	    	Collections.sort(animals);
	    	for(int i =0; i < animals.size(); i++){
	    		System.out.println(animals.get(i).species+ ","+animals.get(i).age+","+ animals.get(i).name);
	    	}
	    }


	}

	class Cat extends Animal {
		
		String species = "Felis Catus";
		public Cat(String name, int age){
			super("Felis Catus",age, name);
		}
	}

	class Dog extends Animal {
		String name;
	
		String species = "Canis Familiaris";
		public Dog(String name, int age){
			super("Canis Familiaris",age, name);

		}
	}