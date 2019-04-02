package javaCodeAnalyzer;

/**
 * @purpose This class is implemented using Factory design pattern in order 
 * to choose the type of analyzer
 * @author Marietta Lazana
 *
 */
public class Factory_analyzer {
	
   public CodeAnalyzer choose_analyzer(String type){
	   
	   if (type.equalsIgnoreCase("regex")){
		   return new RegexAnalyzer();
	   }
	   else if (type.equalsIgnoreCase("string")) {
		   return new StringAnalyzer();
	   }
	   else {
		   throw new java.lang.Error("Wrong type of analisys");
	   }
	   
   }
}
