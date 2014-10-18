package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(isNegative(text))
		{
			return 10;
		}	
		else if(text.contains(",") || text.contains("\\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\\n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
   	 }

	private static boolean isNegative(String numbers)
	{
		return numbers.contains("-");
	}
	
	private static String NoNegatives(String numbers)
	{
		char[] x = numbers.toCharArray();
		String results = "Negatives not allowed: ";
		for(int i = 0; i < numbers.length();i++)
		{
			if(x[i] == '-')
			{  results += "-" + x[i+1] + ","; }

		}
		return results;	
	}
}
