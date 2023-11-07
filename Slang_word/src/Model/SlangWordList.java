package Model;
import java.util.*;

public class SlangWordList {
    public HashMap<String, List<String>> listSlang;

    public SlangWordList(){
        this.listSlang = new HashMap<>();
    }

    public void setListSlang(HashMap<String, List<String>> listSlang) {
        this.listSlang = listSlang;
    }

    public void addSlangWord(SlangWord slangWord){
        this.listSlang.put(slangWord.getSlang(), slangWord.getDefinition());
    }

    public void deleteSlangWord(String slangWord){
        this.listSlang.remove(slangWord);
    }

    
    public void setListHashMap(HashMap<String, List<String>> listHashMap) {
        this.listSlang = listHashMap;
    }
    public int getLength() {return listSlang.size();}

    public void addSlangWord(String slang, List<String> definition){
        this.listSlang.put(slang, definition);
    }

	public boolean kiemTraTonTai(SlangWord sw) {
		for (String i : this.listSlang.keySet()) {
			if(sw.getSlang().equals(i)) {
				return true;
			}
		}
		return false;
	}

}