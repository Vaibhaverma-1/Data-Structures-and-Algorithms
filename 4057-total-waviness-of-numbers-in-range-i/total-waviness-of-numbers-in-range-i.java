class Solution {
    
    public int totalWaviness(int num1, int num2) {
    int sum = 0;

    for (int i = num1; i <= num2; i++) {
        sum += wave(i);
    }

    return sum;
}

    public int wave(int num){
        ArrayList<Integer> list= new ArrayList<>();
        while(num>0){
            list.add(num % 10);
            num /= 10;
        }
        Collections.reverse(list);

        if(list.size()<3){
            return 0;
        }
        int count=0;
        for(int i=1; i<list.size()-1; i++){
        int curr = list.get(i);
        int prev = list.get(i - 1);
        int next = list.get(i + 1);
        boolean isPeak = curr > prev && curr > next;
        boolean isValley = curr < prev && curr < next;
        if (isPeak || isValley) 
        {
            count++;
        }

        }
        return count;
    }
}