package mainOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @purpose Source code analyzer using Regex comparison. It participates in a
 *          Strategy and Factory pattern.
 * @author Marietta Lazana
 * @version 1.0
 */
public class RegexAnalyzer implements CodeAnalyzer {

	public List<String> anlyze_code(List<String> list) {

		// Variable Initialization
		int noc, nom, nol;
		noc = nom = nol = 0;
		List<String> output_list = new ArrayList<String>();
		List<String> temporary_list = new ArrayList<String>();

		for (String object : list) {

			// Calculates the number of lines in given source code
			if (!object.equals("")
					&& Pattern.matches("^(?![ \\s][ \\s]*}|[ \\s]*//|[ \\s]*/\\*|[ \\s]*\\*).*", object)) {

				nol += 1;
			}

			// Calculates the number of classes in given source code
			if (!object.equals("")
					&& Pattern.matches("(public|protected|private|static|\\s).*\\b(class)\\b.*", object)) {
				noc += 1;
			}

			// Calculates the number of methods in given source code
			if (!object.equals("") && Pattern.matches(
					"(public|protected|private|static|\\s)+[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;])",
					object)) {
				nom += 1;
			}

		}

		temporary_list.add(Integer.toString(nol));
		temporary_list.add(Integer.toString(noc));
		temporary_list.add(Integer.toString(nom));

		String separate = String.join(",", temporary_list);
		output_list.add(0, "nol,noc,lom");
		output_list.add(1, separate);

		return output_list;
	}
}
