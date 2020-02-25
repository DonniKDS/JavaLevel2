package homework2.myException;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int length, int height) {
        super();
        System.out.printf("Эллемент массива в ячейке [%d][%d] не является числом!", length, height);
    }
}
