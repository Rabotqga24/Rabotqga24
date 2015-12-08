import java.nio.file.FileVisitResult;

public class Zadacha2 {
public static void main(String[] args) {
	int[] fisrtArr= {3, 6 ,4, 2, 7, 12, 21, 1};
	int [] secoundArr= new int [8];
	int count=fisrtArr.length/2-1;
	
	for ( int index=0; index < fisrtArr.length;index++){
		if (index > secoundArr.length/2-1){
			secoundArr[index]=fisrtArr[count];
			count--;
		}else{
			secoundArr[index]=fisrtArr[index];
		}
	}
	for ( int index=0; index < secoundArr.length;index++){
		System.out.print(secoundArr[index] + " ");
	}
}
}
