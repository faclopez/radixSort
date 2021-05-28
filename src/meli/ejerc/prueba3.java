package meli.ejerc;

import java.util.Arrays;

public class prueba3 {
    public static void main(String[] args) {

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        //public static int[] toIntArray(String arr[])

        String[] arr = {"5", "4", "3"};
        int[] intArr = new int[arr.length]; /*mismo caso, mi array de enteros va a tener el mismo
                                              largo que el String Array*/

        for (int i = 0;i < arr.length; i++){

            intArr[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(intArr[1]);
        System.out.println(Arrays.toString(intArr));
    }
}
