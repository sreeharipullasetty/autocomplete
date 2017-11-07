import java.util.*;

public class AutoSuggest {

	public void AutoSuggestions(Trie objTrie, String start, int atmost) {
		List<String> suggestions = objTrie.getAutoSuggestion(start.toLowerCase());
		if (suggestions.size() != 0) {
			
			/*
				We are checking the suggesions size with required suggestions size.
				If the result suggestions count is below the required suggestions will display all results.
			*/
			int suggestionSize = (atmost > suggestions.size()) ? suggestions.size() : atmost;
			System.out.println("We found below " + suggestionSize + " city(ies) form the cities data.");
			
			/*
				We sorting the suggestions result and displaying the required suggestions to user. 
				Sorting the suggestions using Collection.sort method.
			*/
			Collections.sort(suggestions);
			String suggestion=null;
			for (int i = 0; i < suggestionSize; i++) {
				
				/*
					Replacing the first character in every suggestion and printing the result. 
				*/
				suggestion=suggestions.get(i);
				suggestion=(suggestion.charAt(0)+"").toUpperCase() +suggestion.substring(1, suggestion.length());
				System.out.println(suggestion);
			}
			System.out.println("\nThanks You.");
		} else {
			
			/*
				If we don't get any result we are displaying corresponding message.
			*/
			System.out.println("We did't find any suggestions for the search criteria.\n\nThank You.");
		}
	}
}
