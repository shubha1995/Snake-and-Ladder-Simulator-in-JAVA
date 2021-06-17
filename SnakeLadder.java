import java.util.Scanner;

public class SnakeLadder{
public static void main(String[] args){
	
  int position = 0;
  while(position<=99){
	System.out.println("position is " + position);
	int dice=(int) (Math.random() * 10) % 6+1;
	position = (position + dice);
	System.out.println("dice value is " + dice);
	int check = (int) (Math.random() * 10) % 3+1;
	System.out.println("case number is " + check);
	 switch(check) {
	   case 1:
	   System.out.println( "No Play You are in the same position" );
	   break;
	  
	   case 2:
	   position = (position + dice);
	   if(position>100){
		   position = (position - dice);
		   continue;
	   }
	   System.out.println( "your position after ladder is :" + position );
	   break;
	   
	   case 3: 
	   position = (position - dice);
	  
	  if(position<0){
		  position = 0;
	  }
		 System.out.println( "Your Position after snake is" + position );
	   break;
	   }
	  }
	 }
	}
