package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadDataFromFile {

	public static SlangWordList loadFile() {

		BufferedReader br = null;

		SlangWordList slangWordList = new SlangWordList();
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\eclipse-workspace\\Slang_word\\src\\slang.txt"));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] slang = line.split("`");
				String key = slang[0];
				List<String> definition = new ArrayList<>();
				if (slang.length >= 2) {
					String[] listDefinition = slang[1].split("\\|");
					for (String s : listDefinition) {
						definition.add(s);
					}
				}else {
					definition=null;
				}
				slangWordList.addSlangWord(new SlangWord(slang[0], definition));
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return slangWordList;

	}
}
