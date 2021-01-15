package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to count the characters:");
        String characters = input.nextLine();
        char[] charArray = characters.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<>();       
        
        for(int i=0; i<charArray.length; i++){
            int cCount = 0;
            if(!charCount.containsKey(charArray[i])){
                for(int j=i;j<charArray.length;j++){
                    if(charArray[i] == charArray[j]){
                       cCount = cCount + 1; 
                    }
                }                
            }
            else{
                continue;
            }
            
            charCount.put(charArray[i],cCount);

        }
       
        for(Map.Entry<Character, Integer> charSet: charCount.entrySet()){
            System.out.println(charSet.getKey() + " : " + charSet.getValue());
        }


    }

}
