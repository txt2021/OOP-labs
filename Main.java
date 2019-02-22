class Main {
    public static void main(String[] args) {
        double S = 0;
        final int a = 1;
        final int n = 2;
        final int b = 1;
        final int m = 2;
        final int C = 2;
        boolean flag = true;
        l:
        for (long i = (long) a; i <= n; i++) {
            if (i + C == 0) {
                System.out.println("Ділення на нуль :(");
                flag = false;
                break l;


            } else {
                for (long j = (long) b; j <= m; j++) {
                    S = S + ((double) (i + j) / (i + C));
                }
            }
        }
        if (flag) {
            System.out.println(S);
        }
    }
}