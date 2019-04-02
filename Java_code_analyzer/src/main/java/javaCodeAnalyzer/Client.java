package javaCodeAnalyzer;

/**
 * @purpose Analyze Java source code using String or Regex comparison 
 * @author Marietta Lazana
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		JavaCodeAnalyzer analyze = new JavaCodeAnalyzer();
		
		String path = args[0];
		String type = args[1];
		
		analyze.code_analyzer(path, type);
	}

}
