package aaa;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] names = { "����", "����", "����", "����" };
		int[] a = { 12, 5, 6, 8, 21 };
		Arrays.sort(a);// �Զ�����
		int re = Arrays.binarySearch(names, "����");
		System.out.println(re);
		
//		for(String n:names) {
//			System.out.print(n+"\t");
//		}
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(a,0,2,3);  //����±� 0 -2������2�����Ϊ3
		System.out.println(Arrays.toString(a));
	}

}
