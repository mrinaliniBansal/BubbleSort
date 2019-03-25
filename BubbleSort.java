
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		int n=arr.length;
		System.out.println("enter elements in array: ");
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int j=0; j<n ;j++) {
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}}
		System.out.println(Arrays.toString(arr));
	}

}
