package lesson_2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int a, int b) {
        super(String.format("Элемент нельзя преобразовать в int, удрес элемента [%d][%d]", a, b));
    }
}