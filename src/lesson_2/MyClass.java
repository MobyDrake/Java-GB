package lesson_2;

public class MyClass {
    public static void main(String[] args) {
        method5();

    }

    public static void method1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for(int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static  void method2() {
        int[] arr = new int[8];

        for (int i = 0, j =0; i < arr.length; i++, j+=3) {
            arr[i] = j;
        }

        for(int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static void method3() {
      int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i]*= 2;
            }
        }

        for(int i : arr) {
            System.out.print(i + "\t");
        }

    }

    public static void method4() {
        int[][] arr = new int[6][6];
        //заполнение массива 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        //заполнитель диагоналей :D (заполняет любую квадратную матрицу)
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            arr[i][i] = 1; //первая диагональ л-п
            arr[j][i] = 1; //вторая диагональ п-л
        }


        //вывод матрицы в консоль
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void method5() {
        int[] arr = {5, 1, 2, 10, -2, 14, 7, 15};
        int min = arr[0];
        int max = 0;

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println(min + " " + max);
    }

    public static void method6() {

    }


}

//6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
//7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Нельзя пользоваться вспомогательными массивами.