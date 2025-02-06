import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        int temp = 0;
        Arrays.sort(num_list);
        
        for(int i=5; i<num_list.length; i++){
            answer[temp++] = num_list[i];
        }
        return answer;
    }
}