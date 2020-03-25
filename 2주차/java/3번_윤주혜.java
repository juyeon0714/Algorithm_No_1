import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap();
        for(String part : participant){
            map.put(part, map.getOrDefault(part, 0)+1); //총 참가자 카운트, 동명이인 있을 경우 Value++
        }
        for(String comp : completion){
            map.put(comp, map.getOrDefault(comp, 0)-1); //완주자 카운트, Value--
        }

        for(String key : map.keySet()){ //map에 key 전부 가져오고 value가 0이 아니면 미완주자로 간주
            if(map.get(key) != 0)
                answer = key;
        }

        return answer;
    }
}