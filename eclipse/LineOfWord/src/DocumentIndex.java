import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
  public DocumentIndex()
  {
	super();
  }
  
  public DocumentIndex(int givenCap)
  {
	  super(givenCap);
  }
  
  public void addWord(String word, int num)
  {
	//
	super.get(foundOrInserted(word)).add(num);;
  }
  
  public void addAllWords(String str, int num)
  {
	for (String word: str.split("\\W+"))
	{
      if (str.length() != 0)
    	  addWord(word, num);
	}
  }
  
  public int foundOrInserted(String word)
  {
	if (super.size() == 0)
	{
		IndexEntry firstWord = new IndexEntry(word);
		super.add(0, firstWord);
		return 0;
	}
	
	for (int k = 0; k < super.size(); k++)
	{
	  //If an IndexEntry for word has already been created, it returns the index.
	  if (super.get(k).getWord().equalsIgnoreCase(word))
	    return k;
	  
	  //Finds the position for word so it is in alphabetical order, creates a new IndexEntry for word, returning the index.
	  if (super.get(k).getWord().compareToIgnoreCase(word) < 0)
	  {
		IndexEntry newWord = new IndexEntry(word);
		super.add(k, newWord);
		return k;
	  }
	}
	
	//Word does not fit anywhere in the middle so it goes in last and so a new IndexEntry is created, returning the index.
	IndexEntry endWord = new IndexEntry(word);
	super.add(endWord);
	return super.size() - 1;
  }
  
}
