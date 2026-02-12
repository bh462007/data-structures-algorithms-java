class Rotate{
    public static void main(String[] args) {
        String s="abcde";

        char ch=s.charAt(0);
        char[] arr=s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=ch;
        String res= new String(arr);
        System.out.println("Rotated: "+res);
    }
}