package meli.ejerc;
import java.util.Arrays;

public class prueba2 {

    public static void main(String[] args) {

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        //public static String[] toStringArray(int arr[])

        int[] arr = {1,2,3,4,5};
        String[] strArray = new String[arr.length]; //mi strArray va a tener el mismo largo que el arr
        for (int i = 0; i < arr.length; i++) {
            strArray[i] = String.valueOf(arr[i]);
        }
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(strArray));


    }
}
