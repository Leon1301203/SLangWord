package Test;

import java.util.HashMap;
import java.util.List;

import Model.LoadDataFromFile;
import Model.SlangWord;
import Model.SlangWordList;
import View.SlangView;

public class test {
	public static void main(String[] args) {
		new SlangView();
		SlangWordList sw = LoadDataFromFile.loadFile();
		for (String i : sw.listSlang.keySet()) {
			List<String> list = sw.listSlang.get(i);
			if(list!=null) {
				for (String string : list) {
					System.out.print(string+";");
				}
				System.out.println();
			}
		}
	}
}
