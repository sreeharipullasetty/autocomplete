
public class Validator {
	public boolean validateInput(String[] userInput) {
		
		/*
			Checking the input size.
			If size of the input is not 2 then we will show error input message.
		*/
		if (userInput.length != 2) {
			System.out.println(
					"Wrong input, input should be in the format of start atmost,\nEx: java -jar autocomplete.jar che 5");
			return false;
		} else {

			try {
				int atmost=Integer.parseInt(userInput[1]); // Checking the atmost is integer or not.
				
				/*Checking the atmost greter than 0 or not.*/
				if(atmost<=0)
				{
					System.out.println("The atmost value should be greather than 0(Zero).");
					return false;
				}
				return true;

			} catch (NumberFormatException e) {
				// Throwing the error message.
				System.out.println("The atmost value should be number.\nEx: java -jar autocomplete.jar che 5");
				return false;
			}
			
		}

	}
}
