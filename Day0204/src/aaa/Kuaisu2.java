package aaa;

import java.util.Arrays;

public class Kuaisu2 {
	public static void main(String[] args) {
		int[] a = {11,5,65,98,13,66,44,77,55};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp���ǻ�׼λ
        temp = arr[low];
 
        while (i<j) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //������������򽻻�
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
 
        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
         arr[low] = arr[i];
         arr[i] = temp;
        //�ݹ�����������
        quickSort(arr, low, j-1);
        //�ݹ�����Ұ�����
        quickSort(arr, j+1, high);
    }


}
