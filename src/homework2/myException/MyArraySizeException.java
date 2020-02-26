package homework2.myException;

public class MyArraySizeException extends RuntimeException {

    private int length, height;

    public MyArraySizeException(int height, int length) {
        super();
        this.length = length;
        this.height = height;
    }

    public void printMyException(){
        System.out.printf("Некорректный массив. Необходим массив размером %dх%d! \n", height, length);
    }
}
