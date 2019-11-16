package com.company;

import java.util.Set;

public class Trie {

    TrieNode root = new TrieNode();

    public void insert(String word){
        TrieNode trie = root ;
        for(int i =0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(trie.getCharMap().containsKey(c)) {
                trie = trie.getCharMap().get(c);
            }else {
                TrieNode node = new TrieNode(c);
                trie.getCharMap().put(c,node);
                trie = trie.getCharMap().get(c);
            }
        }
        trie.setLeaf(true);
    }

    public boolean search(String word){
        TrieNode trie = root ;
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(trie.getCharMap().containsKey(c)){
                trie = trie.getCharMap().get(c);
            }else {
                return false;
            }
        }

        return trie.isLeaf();
    }

    public boolean startsWith(String word){
        TrieNode trie = root ;
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            if(trie.getCharMap().containsKey(c)){
                trie = trie.getCharMap().get(c);
            }else {
                return false;
            }
        }
        return true;
    }

}
