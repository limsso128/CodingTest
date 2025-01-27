class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        int sumb = 0;
        
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        sumb = sum*sum;
        
        return sumb>mul ? 1:0;
        
    }
}