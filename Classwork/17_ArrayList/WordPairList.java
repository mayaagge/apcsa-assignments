import java.util.ArrayList;

public class WordPairList
{
	/** The list of word pairs, initialized by the constructor. */
	private ArrayList<WordPair> allPairs;
	
	
	/** Constructs a WordPairList object as described in part (a).
	* Precondition: words.length >= 2
	*/
	public WordPairList(String[] words){
	{ /* to be implemented part (a) */ }
		for (int i = 0; i< words.length;i++){
			for(int j = i+1; j<words.length; j++){
				allPairs.add(new WordPair(words[i],words[j]));
			}
		}
	}
		
	
	
	/** Returns the number of matches as described in part (b).
	*/
	public int numMatches(){
	{ /* to be implemented part (b) */ }
		int count = 0;
		for (WordPair pair: allPairs){
			if ((pair.getFirst()).equals(pair.getSecond())){
				count += 1;
			}
		}
		return count;
	}
}
