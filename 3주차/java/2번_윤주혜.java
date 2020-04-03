import java.util.*;
class Solution {
    public class Truck{
        int weight;
        int distance;
        public Truck(int weight, int distance){
            this.weight = weight;
            this.distance = distance;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0; //타이머
        int bri_weight = weight; //견딜 수 있는 무게
        Truck t = null;
        
        Queue<Truck> outside = new LinkedList<Truck>(); //대기중 트럭
        List<Truck> inside = new ArrayList<Truck>(); //다리위 트럭
        
        for(int i : truck_weights){
            outside.add(new Truck(i, bridge_length));
        } //+ 트럭 무게, 남은 이동거리(다리길이)
        
        while(!(outside.isEmpty()&&inside.isEmpty())){ //다 지나갈동안 반복
            time++;
            if(!inside.isEmpty()&&inside.get(0).distance<=0){
                bri_weight += inside.get(0).weight;
                inside.remove(0);
            } //다리위 트럭이 distance 이상 지나갔으면 inside에서 제거, 남은 무게도 증가
            if(!outside.isEmpty()&&bri_weight - outside.peek().weight >= 0){ 
                bri_weight -= outside.peek().weight;
                inside.add(outside.poll());
            } //견딜 수 있는 무게 - 대기중 트럭 제일 앞열(peek) 무게가 0이상이면(남은 무게보다 가벼움) 다리 위(inside)로 이동(poll) 
            
            for(int i=0;i<inside.size();i++){
                t = inside.get(i);
                t.distance--;
            } //다리위 트럭 distance 1씩 감소(0되면 remove... add... 반복)
        }
        return time;
    }
}