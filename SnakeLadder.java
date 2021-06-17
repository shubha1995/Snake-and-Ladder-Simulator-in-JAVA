public class SnakeLadder{
public static void main(String[] args){
	int count1 = 0;
	int count = 0;
    int position = 0;
    int position1 = 0;
    while((position<=99)&&(position1<=99)) {
	System.out.println("position is " + position);
	int dice=(int) (Math.random() * 10) % 6+1;
	int dice1=(int) (Math.random() * 10) % 6+1;
		count =(count + 1);
		count1 =(count1 + 1);
		position = (position + dice);
		System.out.println("dice value is " + dice);
		System.out.println("dice value is " + dice1);
	int check=(int) (Math.random() * 10) % 3+1;
	int check1=(int) (Math.random() * 10) % 3+1;

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
	   //2nd player
	  switch(check) {
	   case 1:
	   System.out.println( "No Play You are in the same position" );
	   break;
	  
	   case 2:
	   position1 = (position1 + dice1);
	   if(position1>100){
		   position1 = (position1 - dice1);
		   continue;
	   }
	   System.out.println( "your position after ladder is :" + position1 );
	   break;
	   
	   case 3: 
	   position1 = (position1 - dice1);
	  
	  if(position1<0){
		  position1 = 0;
	  }
		 System.out.println( "Your Position after snake is" + position1 );
	   break;
	   }
	  
	    }
		
		if(position == 100){
		System.out.println( "Player 1 is the Winner!");
		System.out.println( "Dice play number " + count );
		}
			else{
				System.out.println( "Player 2 is the Winner!" );
				System.out.println( "Dice play number " + count1 );
		}
		System.out.println( "Dice Total play number is " + (count1+count));
		}
	     }