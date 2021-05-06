package diceTotal;

public class Die {
	
	//=========================
	//Variables
	//=========================
    private final int DEFAULT_NUM_FACES = 6;
    private int faceValue;
    private int numFaces;

    //=========================
    //Constructors
    //=========================
    
    //Default Constructor that sets die to default at 6
    public Die(){
        this.faceValue = DEFAULT_NUM_FACES;
        this.numFaces = DEFAULT_NUM_FACES;
    }

    //Constructor that initialized the instance variables 
    public Die(int faceValue){
        this.faceValue = faceValue;
        this.numFaces = DEFAULT_NUM_FACES;
    }

    //Constructor that initializes to the parameter values
    public Die(int faceValue, int numFaces){
        this.faceValue = faceValue;
        this.numFaces = numFaces;
    }
	
	//Constructor of the copy variety
    public Die(Die d){
    	faceValue = d.faceValue;
    	numFaces = d.numFaces;
    }
    
    //=========================
	//Getters
    //=========================
	
    public int getFaceValue(){
    	return faceValue;
    }
    
    public int getNumFaces() {
    	return numFaces;
    }
    
    //=========================
    //Setters
    //=========================
    
    public void setFaceValue(int faceValue){
    	this.faceValue = faceValue;
    }
    
    //=========================
    //Methods
    //=========================
	
    public String toString() {
    	return Integer.toString(faceValue);
    }
    
    public void roll(){
    	this.faceValue = (int) ((Math.random()*this.numFaces) + 1);
    	setFaceValue(this.faceValue);
    }
    
    //=========================
    //Main
    //=========================
//	public static void main(String[] args) {
		
//		Die roll1 = new Die();
//		Die roll2 = new Die();
//		int sumOfRolls = 0;
//		int totalOfRolls = 0;
//		
//		for(int i = 0; i< 3; i++) {
//			roll1.roll();
//			roll2.roll();
//			sumOfRolls = roll1.getFaceValue() + roll2.getFaceValue();
//			System.out.println("Toss " +i +": Generated a (" +roll1.toString()
//					+") and a (" +roll2.toString() +") for a total of " +sumOfRolls);
//			totalOfRolls += sumOfRolls;
//		}
//		
//		System.out.println("Total of the three tosses is: " +totalOfRolls);
		
		
//		
//		//=======================================
//		//
//		//	TESTING ZONE
//		//
//		//=======================================
//		
//		//Different types of Die without creating an inherited class
//		//Die classes cannot be created in this project due to guideline requirements
//		//Percentage die not present
//		//Multiple type of die was originally not considered in initial submit.
//		
//		Die d4 = new Die(4, 4);
//		d4.roll();
//		System.out.println(d4.toString());
//		
//		Die d8 = new Die(8, 8);
//		d8.roll();
//		System.out.println(d8.toString());
//		
//		Die d10 = new Die(10,10);
//		d10.roll();
//		System.out.println(d10.toString());
//		
//		Die d12 = new Die(12, 12);
//		d12.roll();
//		System.out.println(d12.toString());
//		
//		Die d20 = new Die(20, 20);
//		d20.roll();
//		System.out.println(d20.toString());
//		

//	}

}
