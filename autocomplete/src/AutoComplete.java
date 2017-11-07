import java.io.IOException;
import java.util.*;

public class AutoComplete {

	public static void main(String userInput[]) throws IOException {

		/*
			Taking user input to userInput[] through command line arguments.
		*/
		
		Validator objValidator = new Validator();
		
		/*
			Calling validator method to check the user input.
		*/
		boolean isValid = objValidator.validateInput(userInput);
		
		
		
		if (isValid) {
			
			String start = userInput[0];
			int atmost = Integer.parseInt(userInput[1]); // converting atmost value to integer format from string format.

			BuildTrie objBuildTrie = new BuildTrie();
			Trie objTrie = objBuildTrie.create(); // calling the create method to create the cities data in the form of Trie data structure.

			AutoSuggest objAutoSuggest = new AutoSuggest();
			objAutoSuggest.AutoSuggestions(objTrie, start, atmost); // Calling AutoSuggestions method with argument start, atmost and root node.

		}
		return;
	}
}