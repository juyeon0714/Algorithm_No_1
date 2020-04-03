import java.util.*;
class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<Integer>(); //LIFO

        for(int i=0;i<heights.length;i++){
            stack.push(heights[i]);
        }
        while(!stack.isEmpty()){
            int tmp = stack.pop(); //송신탑
            for(int i=stack.size();i>=0;i--){
              //레이저 신호 수신할 탑 나올 때 까지 skip
                if(tmp<heights[i]){ //수신탑
                    answer[stack.size()] = i+1; //수신탑 index 저장
                    break;
                }
            }
            }
        return answer;
    }
}
