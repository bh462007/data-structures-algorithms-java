class FourDistinct{
    public boolean canSplit(String s) {
        int n = s.length();
        if (n < 4) return false;

        for (int i = 1; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                for (int k = j + 1; k <= n - 1; k++) {

                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (allDistinct(a, b, c, d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean allDistinct(String a, String b, String c, String d) {
        return !a.equals(b) &&
            !a.equals(c) &&
            !a.equals(d) &&
            !b.equals(c) &&
            !b.equals(d) &&
            !c.equals(d);
    }
        public static void main(String[] args) {
        FourDistinct obj = new FourDistinct();
        String s = "aaabb";

        System.out.println(obj.canSplit(s));
    }
}