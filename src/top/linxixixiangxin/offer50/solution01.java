package top.linxixixiangxin.offer50;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution50_01().firstUniqChar(" "));
    }
}
class Solution50_01{
    public char firstUniqChar(String s) {
        ArrayList<Character> once = new ArrayList<>();
        LinkedList<Character> moreThanOne = new LinkedList<>();
        for (int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if (moreThanOne.contains(temp)) {
                continue;
            }
            if(once.contains(temp)){
                once.remove(Character.valueOf(temp));
                moreThanOne.add(temp);
            }else{
                once.add(temp);
            }
        }
        if (once.size() == 0){
            return ' ';
        }else{
            return once.get(0);
        }
    }
}
class Solution50_02{
    public char firstUniqChar(String s) {

        LinkedHashMap<Character,Boolean> map = new LinkedHashMap<>();
        char[] characters = s.toCharArray();
        for (char character : characters) {
            if(map.containsKey(character)){
                map.replace(character,false);
            }else{
                map.put(character,true);
            }
        }
        for (char character : characters) {
            if(map.get(character)) return character;
        }
        return ' ';
    }
}