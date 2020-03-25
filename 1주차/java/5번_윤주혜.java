class Solution {
  public String solution(String s) {
      StringBuilder answer = new StringBuilder();
      char[] str = s.toCharArray();
      int init = 0;
      for(int i=0;i<str.length;i++){
          if(str[i] == ' '){ //공백처리
              answer.append(" "); 
              init = 0;
              continue;
          }

          if(init%2 == 0){ //짝수면 대문자
             answer.append(Character.toUpperCase(str[i]));
              init++;

          }
          else{ //홀수면 소문자
               answer.append(Character.toLowerCase(str[i]));
              init++;

          }
      }
      return answer.toString();
  }
}