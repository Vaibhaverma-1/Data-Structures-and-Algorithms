class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq=new int[10];

        for(int digit:digits){
            freq[digit]++;
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for(int num=100;num<=998;num+=2){
            int first=num/100;
            int second=(num/10)%10;
            int third=num%10;

            int[] need=new int[10];
            need[first]++;
            need[second]++;
            need[third]++;

            boolean possible=true;

            for(int i=0;i<10;i++){
                if(need[i]>freq[i]){
                    possible=false;
                    break;
                }
            }

            if(possible){
                ans.add(num);
            }
        }

        int[] result=new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }

        return result;
    }
}