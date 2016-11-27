import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Omer on 11/26/2016.
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        for(int i = 0 ;i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='+'){
               result.add(s.substring(0,i)+"--"+s.substring(i+2,s.length()));
            }
        }
        return result;
    }
}
