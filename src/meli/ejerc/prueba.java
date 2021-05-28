package meli.ejerc;

// Retorna una cadena compuesta por n caracteres c
// Ejemplo: replicate('x',5) ==> 'xxxxx'

import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        char c='a';
        String strC=Character.toString(c);
        int n=8;
        int i;



        ArrayList<String> lista = new ArrayList<String>();
        for(i=0;i<n;i++){
            lista.add(strC);
        }
        StringBuffer sb = new StringBuffer();
        for (String s : lista){
            sb.append(s);
        }

        System.out.println(lista);
        String str = sb.toString();
        System.out.println(str);


    }
}


