package fileUtilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @purpose Create a Utility class in order to read and write in text files
 * @author Marietta Lazana
 * @version 1.0
 */
public final class Utilities {

	private Utilities() {

	}

	/*
	 * This method reads its line and puts it into the ArrayList
	 * @param path
	 */
	public static List<String> readFile(String path) {

		BufferedReader reader = null;
		List<String> list = new ArrayList<String>();
		try {
			File file = new File(path);
			reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
			return list;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * This method takes a content and generates a text file in the output given path 
	 * @param path,content
	 */
	public static void writeFile(String path, List<String> content) {

		BufferedWriter bw = null;
		try {

			File file = new File(path);

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < content.size(); i++) {
				System.out.print("mpenei" + content.get(i));
				bw.write(content.get(i));
				bw.write("\n");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				// In case of not exiting the BufferedWriter
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}
}