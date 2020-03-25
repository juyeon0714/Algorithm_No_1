class Solution {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        int pcount = 0;
        int ycount = 0;
            for(int i=0;i<str.length;i++){
                if(str[i] == 'p' || str[i] == 'P')
                    pcount++;
                else if(str[i] == 'y' || str[i] == 'Y')
                    ycount++;
            }
            if(pcount == ycount){
                return true;}
        else {
            return false;
        }
    }
}