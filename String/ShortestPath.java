class ShortestPath{
    static void printPath(String str){
        int currRow=0;
        int currCol=0;
        for(char ch: str.toCharArray()){
            int index=ch-'A';
            int targetRow=index/5;
            int targetCol=index%5;
            while(currCol<targetCol){
                System.out.print("R");
                currCol++;
            }
            while(currCol>targetCol){
                System.out.print("L");
                currCol--;
            }
            while(currRow<targetRow){
                System.out.print("D");
                currRow++;
            }
            while(currRow>targetRow){
                System.out.print("U");
                currRow--;
            }
            System.out.println("OK");
        }
    }
    public static void main(String[] args) {
        String s="minimum";
        printPath(s);
    }
}