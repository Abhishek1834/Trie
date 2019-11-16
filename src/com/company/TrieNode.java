package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class TrieNode {
Logger logger = Logger.getLogger(TrieNode.class.getName());
    private char c ;
    private Map<Character, TrieNode> charMap = new HashMap();
    private  boolean isLeaf = false ;

    TrieNode(){
    }

    TrieNode(char c){
        this.c = c ;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Map<Character, TrieNode> getCharMap() {
        return charMap;
    }

    public void setCharMap(Map<Character, TrieNode> charMap) {
        this.charMap = charMap;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }


    public void print(){

        Set<Character> keySet = this.getCharMap().keySet();

        /*keySet.forEach( key -> {
            //logger.info("" + key);
            System.out.print(key);
            if(this.getCharMap().get(key).isLeaf){
                System.out.println();
            }
                this.getCharMap().get(key).print();
        });*/

        System.out.println(keySet);
        keySet.forEach(key ->{
            this.getCharMap().get(key).print();
        });
    }

}
