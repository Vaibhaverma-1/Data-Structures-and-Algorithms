class Solution {
    public String intToRoman(int num) {
        int ones,tens,hundreds,thousands;
        thousands = num/1000;
        num=num%1000;
        hundreds = num/100;
        num=num%100;
        tens = num/10;
        ones=num%10;
        StringBuilder sb = new StringBuilder();
        while(thousands>0){
            sb.append("M");
            thousands--;
        }
        if(hundreds == 9|| hundreds == 4){
            if(hundreds==9){
                sb.append("CM");
                hundreds-=9;
            }
            else{
                sb.append("CD");
                hundreds-=4;
            }
        }
        while(hundreds>0){
            if(hundreds>=5){
                sb.append("D");
                hundreds-=5;
            }
            else{
            sb.append("C");
            hundreds--;
            }
        }
        
        if(tens == 9|| tens == 4){
            if(tens==9){
                sb.append("XC");
                tens-=9;
            }
            else{
                sb.append("XL");
                tens-=4;
            }
        }
        while(tens>0){
            if(tens>=5){
            sb.append("L");
            tens-=5;
            }
            else{
            sb.append("X");
            tens--;
            }
        }
        
        if(ones == 9|| ones == 4){
            if(ones==9){
                sb.append("IX");
                ones-=9;
            }
            else{
                sb.append("IV");
                ones-=4;
            }
        }
        while(ones>0){
            if(ones>=5){
                sb.append("V");
                ones-=5;
            }
            else{
            sb.append("I");
            ones--;
            }
        }
        return sb.toString();
    }
}