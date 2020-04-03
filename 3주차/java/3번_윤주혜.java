import java.util.*;
class Solution {
    public int solution(String arrangement) {
        int answer = 0; //토막난 막대기 수
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<arrangement.length();i++){
            if(arrangement.charAt(i) =='('){
                stack.push(arrangement.charAt(i)); //막대기 하나씩 추가
            }
            else{ // ')'일경우
                stack.pop(); //막대기 절단
                if(arrangement.charAt(i-1) =='('){ //')'전에 '('가 나오면 레이저
                    answer += stack.size(); //토막난 막대기 수 += 쌓인 막대기 수 
                }
                else //')'전에 ')'가나오면
                    answer+=1; //막대기의 끝을 의미(+1) + 맨 위 스택 막대기 제거
            }
        }
        return answer;
    }
}