import java.awt.Component;
import java.awt.List;
import java.lang.System;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class actionList {
	public static 		Scanner  		input     			= new Scanner(System.in)					;
	public static int 					players 				= 1										;

	public static int					player_counter		= 1;
	public static int					randPaul				= 0;
	public static int					numer_Container_XAA00=0;
	public static int					numer_Container_XAA01=0;
	public static int					numer_Container_XAA02=0;
	public static int 							guess = 0;
	public static int					numer_Container_Win	= 1;
	public static java.util.ArrayList<Integer> guessholder = new ArrayList<Integer>();
	private static Object[] ArrayList;
	public static void 	woof(){
		// TODO Auto-generated method stub

	}
	

	public static void branchRun() {
		// TODO Auto-generated method stub
		
		System.out.println("How many players will be making guesses today?");
		players = input.nextInt();
		
		System.out.println("May we have the first players guess?");
		
		sprint();
	}


	public static void try_again() {
		System.out.println("Okay, player " + player_counter + " May we have a guess between 1000 and 2000 if it is not between those numbers you will be prompted again");
		guessholder.remove(ArrayList.length - 1);
	}
	public static int sprint(){	
	while(player_counter <= players ){
		guessholder.get(input.nextLine());
		
	do{
		try_again();
		}while(!(guessholder.get(player_counter) <= 2000 && guessholder.get(player_counter) >= 1000));
		player_counter++;
		
	}
	return(pringDiagnosticData());
	/*while(player_counter == player_counter + 1){
		player_counter++;
		return(findlowestdifferance());
		
	}
*/
	
	}

	public static int findlowestdifferance(){
		int randPaul = generateRandomNumber();
		int i=1;
		
		do{
			do{
				int currentWinnerNumber = guessholder.get(i);
			}while(!(randPaul - ()guess[i]) < (randPaul - guess[i+1]));
		i++;
		}while(i<players);
		
	}
	

	public static int generateRandomNumber(){
		int randomNumber = new Random().nextInt(9000) + 1000;
		return randomNumber;
	}
	public static void compareAndContrast(){
		
	}
	public static int pringDiagnosticData(){
		for(int i=0;i<guessholder.size();i++){
		    return(System.out.println(guessholder.get(i)));
		} 
	}
}
