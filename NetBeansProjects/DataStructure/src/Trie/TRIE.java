/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Trie;

/**
 *
 * @author Kunwar
 */
public class TRIE
{
    final static int ALPHABET_SIZE = 26;
    final static int NON_VALUE = -1;
	    
	    class TrieNode{
	        boolean isLeafNode;
	        int value;
	        TrieNode[] children;
	                
	        TrieNode(boolean isLeafNode, int value)
	        {
	            this.value = value;
	            this.isLeafNode = isLeafNode;
	            children = new TrieNode[ALPHABET_SIZE];
	        }
	        
	        public void markAsLeaf(int value)
	        {
	            this.isLeafNode = true;
	            this.value = value;
	        }
	    }
	
	    TrieNode root;
	    TRIE()
	    {
	        this.root = new TrieNode(false, NON_VALUE);
	    }
	
	    private int getIndex(char ch)
	    {
	        return ch - 'a';
	    }
	
	    public int search(String key)
	    {
	         
	        if (key == null)
	        {
	            return NON_VALUE;
	        }
	        
	        TrieNode currentNode = this.root;
	        int charIndex = 0;
	        
	        while ((currentNode != null) && (charIndex < key.length()))
	        {
	            int childIndex = getIndex(key.charAt(charIndex));
	            
	            if (childIndex < 0 || childIndex >= ALPHABET_SIZE)
	            {
	                return NON_VALUE;
	            }
	            currentNode = currentNode.children[childIndex];
	            
	            charIndex += 1;
	            
	        }
	        
	        if (currentNode != null)
	        {
	            return currentNode.value;
	        }
	        
	        return NON_VALUE;
	    }
	
	    public void insert(String key, int value)
	    {
	         
	        if (key == null) return;
	        
	        key = key.toLowerCase();
	        
       TrieNode currentNode = this.root;
	        int charIndex = 0;
	        
	        while (charIndex < key.length())
	        {
	            int childIndex = getIndex(key.charAt(charIndex));
	
	            if (childIndex < 0 || childIndex >= ALPHABET_SIZE)
	            {
	                System.out.println("Invalid Key" );
	                return;
	            }
	            
	            if (currentNode.children[childIndex] == null)
	            {
	                currentNode.children[childIndex] = new TrieNode(false, NON_VALUE);
	            }
	            
	            currentNode = currentNode.children[childIndex];
	            charIndex  += 1;
	        }
	        
	         
	        currentNode.markAsLeaf(value);
}

            public static void main(String[] args)
	    {
	        TRIE tr = new TRIE();
	
	        tr.insert("aab" , 3);
	        int value = tr.search("acb" );
	        
	        System.out.println(value);
	    }
}
