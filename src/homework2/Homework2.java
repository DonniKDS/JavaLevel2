package homework2;

import homework2.myException.*;

public class Homework2 {

    private final int ARRAY_SIZE = 4;

    public static void main(String[] args) {
        String[][] s1 = new String[4][4];
        String[][] s2 = new String[4][5];
        String[][] s3 = new String[4][4];

        Homework2 home = new Homework2();

        home.fillArray(s1);
        home.fillArray(s2);
        home.fillArray(s3);
        s3[(int)(Math.random()*s3.length)][(int)(Math.random()*s3[s3.length-1].length)] = "X";

        try{
            home.printArray(s1);
            home.exceptionTest(s1);
        }catch (MyArraySizeException | MyArrayDataException e){ }
        try{
            home.printArray(s2);
            home.exceptionTest(s2);
        }catch (MyArraySizeException | MyArrayDataException e){ }
        try{
            home.printArray(s3);
            home.exceptionTest(s3);
        }catch (MyArraySizeException | MyArrayDataException e){ }
    }

    public void exceptionTest(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        if (strings.length != ARRAY_SIZE || strings[0].length != ARRAY_SIZE){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < strings.length; i++){
            for (int j = 0; j < strings[i].length; j++){
                if(isInteger(strings[i][j])){
                    sum += Integer.parseInt(strings[i][j]);
                }
                else {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма эллементов массива равна "+ sum);
    }

    public boolean isInteger(String string){
        int i;
        try {
            i = Integer.parseInt(string);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public String[][] fillArray(String[][] strings){
        for (int i = 0; i < strings.length; i++){
            for (int j = 0; j < strings[i].length; j++){
                strings[i][j] = ((int)(Math.random()*10)) + "";
            }
        }
        return strings;
    }

    public void printArray(String[][] strings){
        for (String[] ss : strings){
            for (String s : ss){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
