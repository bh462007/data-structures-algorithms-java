class RemoveAdjacent{
    static String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        boolean removed=false;
        for (int i = 0; i < s.length(); i++) {
            if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                removed=true;
                i++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        if(removed){
            return removeDuplicates(sb.toString());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="geeksforgeek";
        System.out.println(removeDuplicates(s));
    }
    
}