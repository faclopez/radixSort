package meli.ejerc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		/*Testing Block
		//System.out.println("testing");
		char c = 't';
		int x = 5;
		String str = StringUtil.replicate(c,x);
		System.out.println(str);
		String str1 = StringUtil.lpad("t",5,'j');
		System.out.println(str1);
		int arr1[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		String[] strarr = StringUtil.toStringArray(arr1);
		System.out.println("String array: " + Arrays.toString(strarr));
        int[] arr2 = StringUtil.toIntArray(strarr);
		System.out.println("el arr 2 en la posición 1 tiene: "+ arr2[1]);
		System.out.println(Arrays.toString(arr2));
		int mayor = 0;
		mayor = StringUtil.maxLength(strarr);
		System.out.println(mayor);*/

		/*Convertir el array que vamos a ordenar, de int[] a String[].
        Por ejemplo, si vamos a ordenar int iArr[] = {4,28,132,3,61,5},
        debemos convertirlo en String sArr[] = {“4”,“28”,“132”,“3”,“61”,“5”}.*/

		String sArr[] = StringUtil.toStringArray(arr);

		/*Todos los elementos del String[] deben tener la misma longitud.
		Para esto los completaremos con 0 (ceros) a la izquierda (coincidiendo con la cantidad de dígitos del número más grande).
		 Según nuestro ejemplo, el array sArr debería quedar así: {“004”, “028”, “132” , “003”,“061”,“005”}.
		 */

		StringUtil.lNormalize(sArr,'0');

		HashMap<Integer, ArrayList<String>> ed = new HashMap<>();

		int cantDig = sArr[0].length(); //como ya está normalizado, veo la cantidad de veces que tengo que reordenar
		for(int i=0; i<cantDig; i++)
		{
			// agrega 10 entradas, de 0 a 9, con arraylists vacios
			inicializarED(ed); //limpio el hashmap, se lo robamos al profe.

			int digPos = cantDig-1-i;
			for(int j=0; j<sArr.length; j++)
			{
				int d = sArr[j].charAt(digPos)-'0';
				ed.get(d).add(sArr[j]);
			}

			rearmarArray(sArr,ed);
		}

		int iArr[]=StringUtil.toIntArray(sArr);
		for(int x=0; x<iArr.length;x++)
		{
			arr[x]=iArr[x];
		}


	}

	private static void rearmarArray(String[] sArr, HashMap<Integer,ArrayList<String>> ed)
	{
		int k=0;
		for(int i=0; i<10; i++)
		{
			ArrayList<String> x = ed.get(i);
			for(int j=0; j<x.size(); j++)
			{
				sArr[k++]=x.get(j);
			}
		}
	}

	private static void inicializarED(HashMap<Integer,ArrayList<String>> ed)
	{
		ed.clear();
		for(int i=0; i<10; i++)
		{
			ed.put(i,new ArrayList<>());
		}
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
