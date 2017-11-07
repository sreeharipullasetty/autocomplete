import java.io.IOException;
import java.util.*;
public class BuildTrie {
	public static Trie create() throws IOException{
		
		Trie objTrie=new Trie();
		List<String>cities=new ArrayList<String>(); //variable to hold the cities data in list.
		DataSetup objDataSetup=new DataSetup();
		cities=objDataSetup.storeCitiesData(); // calling StoreCitiesData to get data from the file and store into cities.
		
		for(int i=0;i<cities.size();i++){
			objTrie.insert(cities.get(i).toLowerCase()); // Inserting the each city name into Trie tree.
		}
		return objTrie;
	}
}
