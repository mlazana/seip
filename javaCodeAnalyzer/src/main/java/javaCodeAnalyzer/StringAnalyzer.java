package javaCodeAnalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 * @purpose Source code analyzer using String comparison. It participates in a
 *          Strategy and Factory pattern.
 * @author Marietta Lazana
 * @version 1.0
 */
public class StringAnalyzer implements CodeAnalyzer {

	public List<String> anlyze_code(List<String> list) {

		// Variable Initialization
		int noc, nom, nol;
		noc = nom = nol = 0;
		List<String> output_list = new ArrayList<String>();
		List<String> temporary_list = new ArrayList<String>();

		for (String object : list) {
			object = object.replaceAll("\\s", "");

			// Calculates the number of lines in given source code
			if ((!object.startsWith("//")) && (!object.startsWith("*")) && (!object.startsWith("/*"))
					&& (!object.isEmpty())) {
				nol += 1;
			}

			// Calculates the number of classes in given source code
			if (object.contains("class")) {
				noc += 1;
			}

			// Calculates the number of methods in given source code
			if ((object.contains("public") || object.contains("private") || object.contains("protected")) && object.contains("{")
					&& !object.contains("class")) {
				nom += 1;
			}

		}

		temporary_list.add(Integer.toString(nol));
		temporary_list.add(Integer.toString(noc));
		temporary_list.add(Integer.toString(nom));

		String separate = String.join(",", temporary_list);
		output_list.add(0, "noc,nom,loc");
		output_list.add(1, separate);

		return output_list;
	}

}
