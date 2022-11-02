import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bai20 {
    public boolean isValid(String s) {
        List<Character> characters = new ArrayList<>();
        for (int i=0; i< s.length(); i++){
            characters.add(s.charAt(i));
        }
        
        for (int i=0; i< characters.size()-1; i++){
            switch (characters.get(i)){
                case 40:
                    if(characters.get(i+1) == 41){
                        characters.remove(i);
                        characters.remove(i);
                        i=-1;
                    }
                    break;
                case 91:
                    if(characters.get(i+1) == 93){
                        characters.remove(i);
                        characters.remove(i);
                        i=-1;
                    }
                    break;
                case 123:
                    if(characters.get(i+1) == 125){
                        characters.remove(i);
                        characters.remove(i);
                        i=-1;
                    }
                    break;
            }
        }
        return characters.size() == 0;
    }
}
