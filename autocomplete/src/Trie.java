import java.util.*;
class Trie{
	
	
	private TrieNode root;
	public Trie(){
		/*
			Creating the Trie node with empty character.
		*/
		root=new TrieNode(' ');
	}
	
	/*
		Inserting the each character to Trie tree.
		If we fond the character that already inserted in the for same path it will not insert.
		
		Ex: Hyderabad, Bangalore, Bandar, Mirat, Mumbai
		
		Trie Tree
		---------
				  root
			 ________|______ _______
			|				|		|		 
			b               h		m--------
			|				|		|		|
			a				y		r		u
			|				|		|		|
	-------	n				d		a		m
	d		|    			|		|		|
	|		g    			e		t		b
	a		|    			|		|		|
	|		a    			r		END		a
	r		|    			|				|
	|		l    			a				i
	END		o    			|				|
			|    			b				END
			r				|
			|				a
			e				|
			|				d
			END				|
							END
	*/
	public void insert(String city){
		
		// Search if the city is present in the Trie tree or not first.
		if(searchCity(city)==true){
			return;
		}
		
		TrieNode current=root;
		TrieNode pre;
		for(char ch : city.toCharArray()){
			pre=current;
			TrieNode child=current.getChild(ch);
			if(child !=null) {
				current=child;
				child.parent=pre;
			}
			else {
				current.children.add(new TrieNode(ch));
				current=current.getChild(ch);
				current.parent=pre;
			}
		}
		current.isEnd=true;
	}
	
	/* 
		check the city in tree, if city is exist return true otherwise false.
	*/
	public boolean searchCity(String city){
		TrieNode current=root;
		for(char ch:city.toCharArray()){
			if(current.getChild(ch)==null){
				return false;
			}
			else{
				current=current.getChild(ch);
			}
		}
		if(current.isEnd==true){
			return true;
		}
		return false;
	}
	
	/*
		Checking the each character and trying to get the cities list.
	*/
	public List<String> getAutoSuggestion(String prefix){
		TrieNode lastNode=root;
		for(int i=0;i<prefix.length();i++){
			lastNode=lastNode.getChild(prefix.charAt(i));
			if(lastNode==null){
				return new ArrayList<String>();
			}
		}
		return lastNode.getCities();
	}
	
}