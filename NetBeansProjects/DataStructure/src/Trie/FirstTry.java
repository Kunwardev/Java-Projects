/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Trie;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
class Trie{
    boolean isLeaf;
    HashMap<Character,Trie> children = new HashMap<Character, Trie>();
    static char character;
    
    Trie(){ }
    
    Trie(char c){
        this.character = c;
    }
    
    
    }

public class FirstTry
{
    private Trie root = new Trie();
    
    public void insert(String word){
        HashMap<Character, Trie> children = root.children;
        
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            Trie t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new Trie(c);
                children.put(c, t);
        }
            children = t.children;
            if(i == word.length()-1)
                t.isLeaf = true;
        }   
    }
    
    public boolean Search(String word){
        Trie t = searchNode(word);
        if(t != null && t.isLeaf){
            return true;
        }
        return false;
    }
    
    public Trie searchNode(String word){
        HashMap<Character,Trie> children = root.children;
        Trie t = null;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
    }else{
                return null;
            }
        }
        return t;
    }
    
    public static void main(String[] args)
    {
        FirstTry first = new FirstTry();
        first.insert("kunwar");
        first.insert("dev");
        first.insert("kunwa");
        
    }
    
}
