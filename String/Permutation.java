class Permutation{
    static void permute(char[] ch,int res){
        if(res==ch.length){
            System.out.println(new String(ch));
            return ;
        }
        for (int i = res; i < ch.length; i++) {
            swap(ch,res,i);
            permute(ch,res+1);
            swap(ch,res,i);
        }
    }
    
    static void swap(char[] ch, int i, int j) {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    
    public static void main(String[] args) {
        String s="ABC";
        char[] ch=s.toCharArray();
        permute(ch,0);
    }
}



