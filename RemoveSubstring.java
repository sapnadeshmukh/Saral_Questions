package allQuestion;


public class RemoveSubstring {

	public static void main(String[] args) {
//		To remove particular word from array
		String mainStr1 = "the quick brown fox jumped over the lazy dog. the dog slept over the verandah.";
		String subStr = "over";
		mainStr1=mainStr1.replaceAll(subStr,"");
		System.out.println(mainStr1);
		
//		To replace one word to  word 
		String mainStr = "the quick brown fox jumped over the lazy dog. the dog slept over the verandah.";
		String replaced = mainStr.replace("over", "on");
		System.out.println(replaced);
		


	}

}