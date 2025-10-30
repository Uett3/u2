package h2;

public class H2_main {

    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;

        int min = i;
        int max = i;

        int[] zahlen = {j,k};

        for(int a = 0; a<zahlen.length; a++){
            if(zahlen[a] > max){
                max = zahlen[a];
            }
            if(zahlen[a] < min){
                min = zahlen[a];
            }

        }

        //System.out.println(min);
        //System.out.println(max);
    }
}
