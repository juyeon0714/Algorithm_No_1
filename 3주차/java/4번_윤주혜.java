import java.util.*;
class Solution {
  //가운데 0을 기준으로 좌우대칭
  public int[] solution(int n) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(0); //n = 1
      for(int i=1;i<n;i++){ //n >= 2
          int size = list.size();
          list.add(0); //기준으로 대칭
          for(int j=0;j<size;j++){
              if(list.get(size-j-1)==0){list.add(1);} //list.get(size-j-1)번째 숫자가 0이면 1 추가(대칭작업)
              else if(list.get(size-j-1)==1){list.add(0);}//list.get(size-j-1)번째 숫자가 1이면 0 추가(대칭작업)
          }
      }
      int list_size = list.size();
      int[] answer = new int[list_size];
      for(int i=0;i<list_size;i++){ //리스트 정수형배열로 변환
          answer[i] = list.get(i);
      }
      return answer;
  }
}