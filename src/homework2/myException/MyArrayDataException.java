package homework2.myException;

public class MyArrayDataException extends RuntimeException {

    private int length, height;

    public MyArrayDataException(int height, int length) {
        super();
        this.length = length;
        this.height = height;
    }

    public void printMyException(){
        System.out.printf("Эллемент массива в ячейке [%d][%d] не является числом! \n", height, length);
    }
}
