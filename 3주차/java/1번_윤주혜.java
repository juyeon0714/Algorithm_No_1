import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] num1 = {1,2,3,4,5}; //5
        int[] num2 = {2,1,2,3,2,4,2,5}; //8
        int[] num3 = {3,3,1,1,2,2,4,4,5,5}; //10
        int max = 0;
        ArrayList<Integer> final_answer = new ArrayList<Integer>();

        for(int i=0; i<answers.length;i++){
            if(answers[i] == num1[i%num1.length]) answer[0]++;
            if(answers[i] == num2[i%num2.length]) answer[1]++;
            if(answers[i] == num3[i%num3.length]) answer[2]++;
        }

        for(int i=0;i<answer.length;i++){
            if(answer[i] > max) max = answer[i];
        } //max

        for(int i=0;i<answer.length;i++){
            if(answer[i] == max)
                final_answer.add(i+1);
        } //가장 많이 맞춘 학생 
       answer = new int[final_answer.size()]; //List->Array(반환타입 맞추려고)
        for(int i=0;i<final_answer.size();i++){
            answer[i] = final_answer.get(i);
        }

        return answer;
    }
}