class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int lasta = num_list[num_list.length-1];
        int lastb = num_list[num_list.length-2];
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }if(lasta>lastb){
            answer[num_list.length] = lasta-lastb;
        }else{
            answer[num_list.length] = lasta*2;
        }
        return answer;
    }
}