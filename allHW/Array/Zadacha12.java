
public class Zadacha12 {
public static void main(String[] args) {
	int[] arr= {1, 2, 3, 4 ,5 ,6 ,7};
	
	int sw=arr[0];
	arr[0]=arr[1];
	arr[1]= sw;
	sw=arr[2];
	arr[2]=arr[2+1];
	arr[3]=(arr[3]+sw)-arr[3];
	sw=arr[4];
	arr[4]=(arr[5]*arr[4])/arr[4];
	arr[5]= (arr[5]*sw)/arr[5];
	System.out.print(arr[0]+","+arr[1]+","+arr[2] +","+  arr[3]+","+arr[4] +","+  arr[5]+","+arr[6]);
	
}
}
