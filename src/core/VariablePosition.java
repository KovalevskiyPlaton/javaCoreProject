package core;

public static class VariablePosition {
    /*
        Данный класс не скомпилируется т.к. класс верхнего уровня
        не может иметь модификатор static. Модификатор static могут иметь вложенные классы.
    */
    static void main(String[] args) {
        System.out.println( replacement());
    }
    public static int replacement (){
        int a = 1;
        int b = a;
        return b;
    }
}


