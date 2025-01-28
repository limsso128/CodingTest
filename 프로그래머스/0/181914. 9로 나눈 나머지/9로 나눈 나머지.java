class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] list = number.split("");
        
        for(int i=0; i<list.length; i++){
            sum += Integer.parseInt(list[i]);
        }
    
        return sum%9;
    }
}