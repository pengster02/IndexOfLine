import java.util.ArrayList;
public class IndexEntry 
{
  private String word;
  private ArrayList<Integer> numsList;
  
  public IndexEntry(String word)
  {
    word = word.toUpperCase();
    numsList = new ArrayList<Integer>();
  }
  
  //
  void add(int num)
  {
	  if (numsList.contains(num) == false)
		numsList.add(num);
  }
  
  String getWord()
  {
	return word;
  }
  
  public String toString()
  {
	return word + numsList.toString();
  }
}
