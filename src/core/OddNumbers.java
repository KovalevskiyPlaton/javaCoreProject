package core;

public class OddNumbers {
    static void main(String[] args) {
        getOddsNumbers();
    }

    public static void getOddsNumbers(){
        int border = 100;
        for(int i = 0; i<border; i++){
            if (i%2==0) continue;
                System.out.println(i);
        }
    }
}
