package aaa;

import java.util.Arrays;

/**
 * ��������
* @author ֣�ܴ�
*/
public class Kuaisu {
	public static void main(String[] args) {
		int[] a = {12,43,22,45,21,23,76,1,5,34,32,123,19,8,563,11};
		kuaisu(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	/**
	 *
	  *  ���Ŵ���
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void kuaisu(int[] a,int low,int high){
        int i,j,t,temp;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = a[low];//temp���ǻ�׼λ
        while (i<j) {
            //���ȿ��ұߣ���������ݼ�
            while (temp<=a[j]&&i<j) {
                j--;
            }
            //Ȼ����ߣ��������ҵ���
            while (temp>=a[i]&&i<j) {
                i++;
            }
            //���������򽻻�
            if (i<j) {
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        //�����i��j���λ�õ����ֽ���
        a[low] = a[i];
        a[i] = temp;
        kuaisu(a, low, j-1);//�ݹ�����������
        kuaisu(a, j+1, high);//�ݹ�����Ұ�����
    }
}
