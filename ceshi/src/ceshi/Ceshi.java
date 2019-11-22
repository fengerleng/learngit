package ceshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ceshi {
	public static void main(String[] args) {
		Random rad = new Random();
		List<Integer>red = new ArrayList<Integer>();
		List<Integer>yellow = new ArrayList<Integer>();
		int[]a = new int[6];
		int u = 0;
		int t = 0;
		for (int i = 0; i < 33; i++) {
			red.add(i+1);
			if (i<16) {
				yellow.add(i+1);
			}
		}
		while (u<6) {
			t = rad.nextInt(33)+1;
			if (!red.contains(t)) {
				continue;
			}
			a[u++] = t;
			red.remove(red.indexOf(t));
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		t = rad.nextInt(16)+1;
		if (yellow.contains(t)) {
			System.out.println("∫Ï«Ú”–:");
			for (int i = 0; i < a.length-1; i++) {
				System.out.print(a[i]+",");
			}
			System.out.println(a[a.length-1]);
			System.out.println("¿∂«Ú”–:");
			System.out.println(t);
		}
		
	}
}
