package toolDemonstration;

import mainOperations.JavaCodeAnalyzer;
/**
 * @purpose This class implements javaCodeAnalyzer
 * @author Marietta Lazana
 *
 */
public class Client {

	public static void main(String[] args) {
		
		JavaCodeAnalyzer facade = new JavaCodeAnalyzer();
		
		String path = args[0];
		String type = args[1];
		
		facade.code_analyzer(path, type);
	}

}
