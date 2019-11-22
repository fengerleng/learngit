package ceshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ceshi2 {
	public static void main(String[]args){
		Random rd = new Random();
		List<Integer>red = new ArrayList<Integer>();
		int[]qiu = new int[6];
		int i = 0;
		int j = 0;
		int t = 0;
		for(i = 1;i<=33;i++){
			red.add(i);
		}
		i = 0;
		while(i<6){
			j = rd.nextInt(33)+1;
			if(red.contains(j)){
			red.remove(red.indexOf(j));
			qiu[i++] = j;
			}
		}
		for(i = 0;i<qiu.length-1;i++){
			for(j = 0;j<qiu.length-i-1;j++){
				if(qiu[j]>qiu[j+1]){
					t = qiu[j];
					qiu[j] = qiu[j+1];
					qiu[j+1] = t;
				}
			}
		}
		System.out.print("∫Ï«Ú£∫");
		for(i = 0;i<qiu.length-1;i++){
			System.out.print(qiu[i]+",");
		}
		System.out.println(qiu[qiu.length-1]);
		System.out.println("¿∂«Ú£∫"+(rd.nextInt(16)+1));
	}
}
