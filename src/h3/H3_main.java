package h3;

public class H3_main {

    static int i = 2;
    static int j = 3;
    static int k = 7;



    static boolean a1(){
        if(i > j){
            return true;
        }
        return false;
    }
    static boolean a2(){
        if(i > 200){
            return true;
        }
        return false;
    }
    static boolean a3(){
        if(j > 100){
            return true;
        }
        a1();
        return false;
    }



    public static void main(String[] args){

        k = -10;

        if(a1() && !a2() && !a3() ){
            k = 1;
        }
        if(a1() && a2() && !a3() ){
            k = 2;
        }

        if(a1() && a2() && a3() ){
            k = 3;
        }

        if(!a1() && !a2() && !a3() ){
            k = 4;
        }
        System.out.println(k);

    }


}


