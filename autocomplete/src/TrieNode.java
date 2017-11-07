
import java.util.*;

class TrieNode{
	char data;
	LinkedList<TrieNode> children; // Creating one LinkedList with TrieNode fomat
	TrieNode parent;
	boolean isEnd;
	
	/*
		TrieNode structure
	*/
	public TrieNode(char ch){
		data=ch;
		children=new LinkedList<TrieNode>();
		isEnd=false;
	}
	
	/*
		Checking the each child node data.
	*/
	public TrieNode getChild(char ch){
		if(children!=null){
			for(TrieNode eachChild : children){
				if(eachChild.data==ch){
					return eachChild;
				}
			}
		}
		return null;
	}
	
	/*
		Adding the found cities to list and returning the cities list.
	*/
	
	public List<String> getCities(){
		List<String>list=new ArrayList<String>();
		if(isEnd){
			list.add(toString());
		}
		if(children!=null){
			for(int i=0;i<children.size();i++){
				if(children.get(i)!=null){
					list.addAll(children.get(i).getCities());					
				}
			}
		}
		return list;
	}
	
	/*
		Converting the node to string.
	*/
	public String toString(){
		if(parent==null)
			return "";
		else
			return parent.toString()+new String(new char[]{data});
	}
}