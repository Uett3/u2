package h3;

public class H3_main {

    public static void main(String[] args){

        int i = 210;
        int j = 102;
        int k = 7;

        boolean anweisung1 = i > j;
        boolean anweisung2 = i > 200;
        boolean anweisung3 = j > 100;

        k = -10;

        if(anweisung1 && !anweisung2 && !anweisung3 ){
            k = 1;
        }
        if(anweisung1 && anweisung2 && !anweisung3 ){
            k = 2;
        }

        if(anweisung1 && anweisung2 && anweisung3 ){
            k = 3;
        }

        if(!anweisung1 && !anweisung2 && !anweisung3 ){
            k = 4;
        }
        System.out.println(k);
        

    }


}


