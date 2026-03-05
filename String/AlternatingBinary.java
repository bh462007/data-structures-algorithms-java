class AlternatingBinary{
    public int minOperations(String s) {
        int change0=0;
        int change1=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char look0=(i%2==0)?'0':'1';
            char look1=(i%2==0?'1':'0');
            if(ch!=look0)change0++;
            if(ch!=look1)change1++;

        }
        return Math.min(change0,change1);
    }

    public static void main(String[] args) {
        String s="0101011";
        AlternatingBinary ab=new AlternatingBinary();
        int res=ab.minOperations(s);
        System.out.println(res);
    }
}