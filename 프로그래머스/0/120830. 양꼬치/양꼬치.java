class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int drink = n/10;
        
        return (n*12000) + (k-drink)*2000;
    }
}