class ComplementBase{
    static int bitwiseComplement(int n){
        int original=n;
        if(n==0) return 1;

        int bits=0;
        while(n>0){
            bits++;
            n=n>>1;
        }
        int m=(1<<bits)-1;
        return original^m;
    }
    public static void main(String[] args) {
        int n=5;
        int result=bitwiseComplement(n);
        System.out.println(result);

    }
}






// If n == 0 → return 1
// Count bits using right shift
// Create mask (1 << bits) - 1
// Return n ^ mask