package meli.ejerc;

// Retorna una cadena de longitud n, compuesta por s
// y precedida de tantos caracteres c como sea necesario
// para completar la longitud mencionada
// Ejemplo lpad("5",3,'0') ==> "005"
//public static String lpad(String s, int n, char c)//

import java.util.ArrayList;

public class prueba1 {
    public static void main(String[] args) {

        String s="5";
        int n=5;
        char c='0';
        String strC=Character.toString(c);
        System.out.println(strC);
        String strN= s;


        System.out.println(strN);
        while(strN.length()!=n){
            strN= c + strN;
            System.out.println(strN);
        }


       /* StringBuffer sb = new StringBuffer();
        sb.append(s);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add(s);


        System.out.println(s.length());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(lista.size());
        while(lista.size()<n){
            lista.add(strC);
        }
        for (String x : lista){
            sb.append(x);
        }
        System.out.println(sb);
        System.out.println(lista.size());
        System.out.println(lista);*/


    }
}
