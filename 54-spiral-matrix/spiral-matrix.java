class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> numbers = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left=0;
        int top=0;
        int right=m-1;
        int bottom=n-1;
        

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
               numbers.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                numbers.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right; i>=left; i--){
                numbers.add(matrix[bottom][i]);
            } 
            bottom--;}
            if(left<=right){
            for(int i=bottom; i>=top; i--){
                numbers.add(matrix[i][left]);
            }
            left++;
            }
}

        return numbers;

        
    }
}