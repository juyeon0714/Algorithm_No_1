import java.util.Arrays;
class Solution {
  public String solution(String s) {
      char[] str = s.toCharArray(); //char형 배열 생성
      Arrays.sort(str); 
     StringBuilder sb = new StringBuilder();   //reverse 사용하기 위한 가변 객체생성
      return sb.append(str).reverse().toString(); //StringBuilder객체 내장함수
      /*  for문 역순->배열.. 크기...?

      */

  }
}