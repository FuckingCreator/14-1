import java.util.ArrayList;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
	boolean done = false;
	while(!done){
	System.out.println("Enter Item Name");
	Scanner key = new Scanner(System.in);
	String Temp = key.nextLine();
	key.nextLine(); 
	ArrayList<String> List = new ArrayList();
	List.add(Temp);
	System.out.println("Did you enter all items?");
	String Answer = key.nextLine();
	key.nextLine();
	if(Answer.equalsIgnoreCase("Yes")){
		
		Store NewStore = new Store(List);
		System.out.println("Items available:");
		System.out.println(NewStore.toString());
		done = true;
		
			}
		}
	
	}

}
