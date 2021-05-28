package meli.ejerc;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String strC=Character.toString(c);
		int i;

		ArrayList<String> lista = new ArrayList<String>();
		for(i=0;i<n;i++){
			lista.add(strC);
		}
		StringBuffer sb = new StringBuffer();
		for (String s : lista){
			sb.append(s);
		}

		//System.out.println(lista);
		String str = sb.toString();
		//System.out.println(str);
		return str;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String strC=Character.toString(c);
		String strN= s;

		while(strN.length()!=n){
			strN= c + strN;
			//System.out.println(strN);
		}
		return strN;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{

		String[] strArray = new String[arr.length]; //mi strArray va a tener el mismo largo que el arr
		for (int i = 0; i < arr.length; i++) {
			strArray[i] = String.valueOf(arr[i]);
		}
		//System.out.println(Arrays.toString(strArray));
		return strArray;
	}

	// Retorna un int[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{

		int[] intArr = new int[arr.length]; /*mismo caso, mi array de enteros va a tener el mismo
                                              largo que el String Array*/

		for (int i = 0;i < arr.length; i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		//System.out.println(intArr[1]);
		//System.out.println(Arrays.toString(intArr));
		return intArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int mayor = arr[0].length(); //inicializo el carrier
		for(String s:arr){
			if(s.length()>mayor){
				mayor=s.length();
			}
		}
		return mayor;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int mayor = maxLength(arr); //como maxLength esta dentro de la misma clase que lNormalize,  no hace falta anteponer StringUtil

		for(int i = 0; i< arr.length; i++){
			arr[i]=lpad(arr[i],mayor,c);
		}
	}
}
