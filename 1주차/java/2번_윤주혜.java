class Solution {
  public String solution(String s) {
      String answer = "";
      
      if(s.length()>=1 && s.length()<=100){ //문자열 길이
          if(s.length()%2 == 0){ //짝수
              answer = s.substring(s.length()/2-1, s.length()/2+1); //2글자 출력
          }
          else{ //홀수
              answer = s.substring(s.length()/2, s.length()/2+1); //1글자 출력
          }
      }
      return answer;
  }
}