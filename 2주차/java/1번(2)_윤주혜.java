class Solution {
  public String solution(int n) {
      String answer = "";
      for(int i=0;i<=n;i++){
          if(i != 0){ answer += i % 2 == 0 ? "박" : "수";}
        
      }
      return answer;
  }
}