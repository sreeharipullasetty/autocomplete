import java.util.*;
import java.io.*;

public class DataSetup {
	public List<String> storeCitiesData() throws IOException {
		List<String> cities = new ArrayList<String>();
		File objFile = null;
		String currentDirectory = System.getProperty("user.dir"); // Getting the current directory of the user.
		File f=new File(currentDirectory); 
		String parent=f.getParent(); // Getting the parent directory of the user.
		currentDirectory = parent+"/CitiesData.txt"; // Appending the cities data file name.
		try {
			objFile = new File(currentDirectory);

			BufferedReader br = new BufferedReader(new FileReader(objFile));
			String row = br.readLine();
			/*
				Reading the each city from the data file.
				Storing it into list called cities.
			*/
			while (row != null) {
				cities.add(row);
				row = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
		return cities; // returning the list of cities.
	}
}
