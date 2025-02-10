class Solution {
    public int[] solution(int n, int[] numlist) {
        int sum = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                sum += 1;
            }
        }
        
        int answer[] = new int[sum];
        int index = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[index] = numlist[i];
                index++;
            }
        }
    
        
        return answer;
    }
}