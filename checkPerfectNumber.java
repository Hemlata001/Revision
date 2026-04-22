// find divisiors or check perfect Number
class Main {
    static boolean checkPerfectNumber(int num){
        int sum = 1;
        for(int i = 2;i*i<=num;i++){
            if(num %i ==0){
                // i ne num ko perfectly divide kr diya h
                // toh ab factor pair kya banega
                // 1st factor = i
                int firstfactor = i;
                // 2nd Factor = num/i
                int secondfactor = num/i;
                sum = sum + firstfactor + secondfactor;
            }
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
        
    }
}
