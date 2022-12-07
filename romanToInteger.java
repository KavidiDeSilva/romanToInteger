class romanToInteger {

    public int romanToInt(String s) {

        // Total value
        int sum = 0;

        //length of value
        int n = s.length();  //LVIII (58) - length 5

        for(int i = 0; i < n; i++) {

            //current value of the character
            int curr = valueOfRomanChar(s.charAt(i));  

            if (i < n -1) {

            //next value of the character
            int next = valueOfRomanChar(s.charAt(i + 1));

                if (curr >= next) {
                    sum = sum + curr; //50 5 1 1 1
                }
                else {
                    sum = sum + next - curr; 
                    i++;
                }
            }
            else{
                sum = sum + curr;
            }
        }

        return sum; //50 55 56 57 58
    }
    int valueOfRomanChar(char sym){
        if (sym == 'I') return 1;
        if (sym == 'V') return 5;
        if (sym == 'X') return 10;
        if (sym == 'L') return 50;
        if (sym == 'C') return 100;
        if (sym == 'D') return 500;
        if (sym == 'M') return 1000;
        return 0;
    }

     public static void main(String args[]){
        romanToInteger ob = new romanToInteger();
        String str = "LVIII";
        System.out.println( ob.romanToInt(str));
    }


}  