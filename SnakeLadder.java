public class SnakeLadder{
	public static void main(String[] args){
	int Position = 0;
	System.out.println("Welcome to Snake and Ladder Simulator");
	System.out.println("Your Starting Position is : " +Position);
	Dice();
	}
	public static void Dice(){
		int Dice = (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("Your Dice Value is : " +Dice);
   }	
}