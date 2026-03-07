
class MinFlips{
    // static int expectedFlips(String s){
    //     int flip0=0;
    //     int flip1=0;
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch=s.charAt(i);

    //         int expected0=(i%2==0)? '0':'1';
    //         int expected1=(i%2==0)? '1':'0';

    //         if(ch!=expected0) flip0++;
    //         if(ch!=expected1) flip1++;
    //     }
    //     return Math.min(flip0, flip1);
    // }
    // static int minFlips(String s){
    //     int n=s.length();
    //     int ans=Integer.MAX_VALUE;

    //     String current=s;
    //     for (int i = 0; i < n; i++) {
    //         ans=Math.min(ans, expectedFlips(current));

    //         current=current.substring(1)+current.charAt(0);
    //     }
    //     return ans;
    // }



    static int minFlips(String s){
        int n=s.length();
        String doubled=s+s;

        int flip0=0;
        int flip1=0;
        int ans=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<doubled.length();right++){
            char expected0=(right%2==0)?'0':'1';
            char expected1=(right%2==0)?'1':'0';
            if(doubled.charAt(right)!=expected0) flip0++;
            if(doubled.charAt(right)!=expected1) flip1++;

            if(right-left+1>n){
                char leftexpected0=(left%2==0)?'0':'1';
                char leftexpected1=(left%2==0)?'1':'0';

                if(doubled.charAt(left)!=leftexpected0) flip0--;
                if(doubled.charAt(left)!=leftexpected1) flip1--;

                left++;
            }
            if(right-left+1==n){
                ans=Math.min(ans,Math.min(flip0, flip1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="0101011";
        MinFlips flips=new MinFlips();
        int res=flips.minFlips(s);
        System.out.println(res);
    }
}