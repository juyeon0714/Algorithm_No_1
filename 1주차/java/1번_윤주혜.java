class Solution {
  public boolean solution(String s) {
      boolean answer = true;

      if(s.length() != 4 && s.length() != 6){ //문자열 길이 4랑 6아니면 false
          answer = false; 
      }else{
          for(int i=0; i<s.length(); i++){ 
              if(Character.isDigit(s.charAt(i)) == false){ //s[i]번째 문자가 숫자가 아니면 false
                  answer = false; 
              }
          }
      }

      return answer;
  }

}