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

public class UsingLinkedList
{
    final static int ALPHABETS = 26;
    final static int NAN = -1;
    
    static class TRIES{
            boolean isLeaf;
            int value;
            TRIES branch[];
            
            TRIES(boolean isLeaf,int value){
                this.isLeaf = isLeaf;
                this.value = value;
                this.branch = new TRIES[ALPHABETS];
            }
            TRIES root;
            TRIES(){
                this.root = new TRIES(false,NAN);
            }
            
            public void markAsLeaf(int value){
                this.value = value;
                this.isLeaf = true;
            }
            
            private int getIndex(char x){
                return x-'a';
            }
            
            public void insert(String word,int value){
                if(word == null){
                    System.out.println("String is Empty");
                    return;
                }
                TRIES current = this.root;
                int charIndex = 0;
                while(charIndex < word.length()){
                    int Index = getIndex(word.charAt(charIndex));
                    if(Index<0 || Index>=ALPHABETS){
                        System.out.println("Invalid Words Entered");
                        return;
                    }
                    if(current.branch[Index] == null){
                        current.branch[Index] = new TRIES(false,NAN);
                    }
                    current = current.branch[Index];
                    charIndex++;
               }
                current.markAsLeaf(value);
            }
            
            public boolean search(String word){
                if(word == null)
                    return false;
                int index = 0;
                TRIES current = this.root;
                while(index<word.length()&&current != null){
                    char y = word.charAt(index);
                    int charIndex = getIndex(y);
                    if(charIndex<0||charIndex>=ALPHABETS){
                        return false;
                    }
                    current = current.branch[charIndex];
                    index++;
                }
                
                if(current != null && current.isLeaf == true)
                    return true;
                return false;
            }       
            
            public void unMarkLeaf(){
                this.isLeaf = false;
                this.value = NAN;
            }
            
            public boolean hasNoChildren(TRIES current){
                for(int i=0;i<current.branch.length;i++){
                    if(current.branch[i] != null)
                        return false;
                }
                return true;
            }
            
            public  boolean delete(String word, TRIES current, int length,int level){
                boolean deleted = false;
                if(current == null){
                    System.out.println("Key does not exists");
                    return deleted;
                }
                if(level == length){
                    if(hasNoChildren(current)){
                        current = null;
                        deleted = true;
                    }else{
                        current.unMarkLeaf();
                        deleted = false;
                    }
                }else{
                    TRIES child = current.branch[getIndex(word.charAt(level))];
                    boolean childDeleted = delete(word, current, length, level+1);
                    if(childDeleted){
                        current.branch[getIndex(word.charAt(level))] = null;
                        if(current.isLeaf)
                            deleted = false;
                        else if(!hasNoChildren(current))
                            deleted = false;
                        else{
                            current = null;
                            deleted = true;
                        }
                    }else
                        deleted = false;
                }
                return deleted;
            }
    
    public void Deleted(String key){
        if((root == null)||key==null){
            System.out.println("TRIE is Empty");
            return;
        }
        System.out.println(delete(key, root, key.length(), 0));
        return;
    }
    
    public static void main(String[] args)
    {
        TRIES t = new TRIES();
        TRIES f = t;
        t.insert("hell",4);
        t.insert("help", 4);
        t.insert("kunwar", 6);
        t.insert("saurabh", 7);
        System.out.println(t.search("kunwar"));
        t.Deleted("kunwar");
        System.out.println(t.search("kunwar"));
    }
    
}
}
