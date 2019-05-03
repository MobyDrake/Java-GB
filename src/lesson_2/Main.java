package lesson_2;

public class Main {
    public static void main(String[] args) {
        //тестовый не верный массив для выкидывания исключения
        String[][] mass = {{"1","2","3", "4"}, {"1", "2", "3", "4"}};

        try {
            System.out.println(method1(mass));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("Рабочих часов: %d", getWorkingHours(DayOfWeek.SATURDAY)));
    }

    public static int method1(String[][] mass) throws MyArraySizeException, MyArrayDataException {
        //проверка на размер массива
        if (mass.length == 4) {
            for (String[] strings : mass) {
                if (strings.length != 4) {
                    throw new MyArraySizeException();
                }
            }
        } else {
            throw  new MyArraySizeException();
        }

        int result = 0;

        //процесс суммирования
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    result += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }

    public static int getWorkingHours(DayOfWeek w) {
        return w.getWorkHours();
    }
}
