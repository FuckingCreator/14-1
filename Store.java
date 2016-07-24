import java.util.ArrayList;

public class Store implements Comparable {
	private ArrayList<String> Available;
	
	Store(){
		Available = null;
	}
	Store(ArrayList <String> List){
		Available = List;
	}
	Store(Store Copy){
		Available = Copy.Available;
	}
	public Object clone() 
	{
		try
		{
			return super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			
			e.printStackTrace();
			return null;
		}
	}
	public void setArray(ArrayList<String> NewList){
		for(int i =0; i < Available.size();i++){
			Available.set(i, NewList.get(i));
		}
	}
	public ArrayList<String> getAvailable(){
		if(Available.isEmpty()){
			System.out.println("No available items.");
			return null;
		}
		else{
			return Available;
		}
	}
	public String toString(){
		String List = "";
		for(String Item : Available){
			List+= Item + "\t";
		}
		return List;
	}
	public int getNumberofItems(){
		Available.trimToSize();
		return Available.size();
	}
	public void setItem(String Item, int index){
		Available.set(index, Item);
	}
	public boolean hasElement(String Element){
		return Available.contains(Element);
	}
	public Object[] getArray(){
		return Available.toArray();
	}
	public boolean equals(Object OtherStore){
		if(OtherStore == null){
			return false;
		}
		else if(getClass() != OtherStore.getClass()){
			return false;
		}
		
		else{
			Store NewStore = (Store)OtherStore;
			if(Available.size() != NewStore.Available.size()){
				return false;
			}
			else{
			for(int i = 0; i< Available.size();i++){
				if(Available.get(i)== NewStore.Available.get(i)){
					return true;
				}
				else{
					return false;
				}
			}
		}
	}
		return false;
	}
	public int compareTo(Object Other){
		if(Other == null || getClass() != Other.getClass()){
			return -2; //error
		}
		else{
			Store Compared = (Store)Other;
			Available.trimToSize();
			Compared.Available.trimToSize();
			if(Available.size() > Compared.Available.size()){
				//COmpared is smaller
				return - 1;
			}
			else if(Available.size() < Compared.Available.size()){
				return 1;
				//Compared is bigger
			}
			else if(Available.size() == Compared.Available.size()){
				return 0;
			}
			else{
				return -2; //error
			}
		}
	}
	
	
}
