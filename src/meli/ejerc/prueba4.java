package meli.ejerc;

public class prueba4 {
    public static void main(String[] args) {

        // Retorna la longitud del elemento con mayor cantidad
        // de caracteres del array arr
        //public static int maxLength(String arr[])

        String[] arr = {"23","555","2222","13"};
        int mayor = arr[0].length(); //inicializo el carrier

        for(String s:arr){
            if(s.length()>mayor){
                mayor=s.length();
            }
        }

        System.out.println(mayor);

    }
}
