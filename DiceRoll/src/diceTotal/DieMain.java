package diceTotal;

public class DieMain {

	public static void main(String[] args) {
		Die roll1 = new Die();
		Die roll2 = new Die();
		int sumOfRolls = 0;
		int totalOfRolls = 0;
		
		for(int i = 0; i< 3; i++) {
			roll1.roll();
			roll2.roll();
			sumOfRolls = roll1.getFaceValue() + roll2.getFaceValue();
			System.out.println("Toss " +i +": Generated a (" +roll1.toString()
					+") and a (" +roll2.toString() +") for a total of " +sumOfRolls);
			totalOfRolls += sumOfRolls;
		}
		
		System.out.println("Total of the three tosses is: " +totalOfRolls);

	}

}
