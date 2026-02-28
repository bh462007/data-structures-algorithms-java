class Consecutiveones{
    static int count(int i,int n){
        if(i>=n){
            return 1;
        }
        int l=count(i+2, n);
        int m=count(i+1, n);

        return l+m;
    }
    static int binaryConsecutive(int n){
        return count(0, n);
    }
    public static void main(String[] args) {
        int n=2;
        int res=binaryConsecutive(n);
        System.out.println("Result: "+res);
    }
}