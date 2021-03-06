package mainOperations;


import java.util.ArrayList;
import java.util.List;

import fileUtilities.Utilities;

/**
 * @purpose This class is implemented using Facade design pattern in order to 
 * analyze Java source code
 * @author Marietta Lazana
 *
 */
public class JavaCodeAnalyzer {

	public void code_analyzer(String path, String type) {
		
		List<String> read_list = new ArrayList<String>();
		AnalyzerFactory factory_analyzer = new AnalyzerFactory();
		
		read_list = Utilities.readFile(path);
		String output_path = "output.csv" ;
		
		CodeAnalyzer analyzer = factory_analyzer.choose_analyzer(type);
		List<String> list_content = analyzer.anlyze_code(read_list);
		
		Utilities.writeFile(output_path,list_content);
	}
}
