package homework2.myException;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super();
        System.out.println("Некорректный массив. Необходим массив размером 4х4!");
    }
}
