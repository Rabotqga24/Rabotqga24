
public class Zadacha18 {
public static void main(String[] args) {
	
	int[] arr= {18,19,32,1,3, 4, 5, 6, 7, 8};
	int[] arr2 = {1, 2, 3,4,5,16,17,18,27,11};
	int[] arr3= new int[10];
	for(int i =0; i<arr3.length;i++){
		if(arr[i]>arr2[i]){
			arr3[i]=arr[i];
		}else{
			arr3[i]=arr2[i];
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println("");
	for(int i=0;i<arr2.length;i++){
		System.out.print(arr2[i]+" ");
	}
	System.out.println("");
	for(int i=0;i<arr3.length;i++){
		System.out.print(arr3[i]+" ");
	}
	
}
}
