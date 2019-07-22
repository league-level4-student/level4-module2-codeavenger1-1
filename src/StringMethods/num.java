package StringMethods;

public class num {
public static void main(String[] args) {
	int[][] mtx = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	for (int i = 0; i < mtx.length / 2; i++) {
		int[] t = mtx[i];
		mtx[i] = mtx[mtx.length - i- 1];
		mtx[mtx.length - i- 1] = t;
 	}
	for (int row = 0; row < mtx.length; row++) {
		System.out.println("");
		for (int col = 0; col < mtx.length; col++) {
			System.out.print(mtx[row][col] + " ");
		}
	}
	
	
	
	
	
	
	
}
void idk() {
	int[] vals = {1, 2, 3, 4, 5};
	for (int i = 0; i < vals.length; i++) {
		vals[i] = vals[i]- vals[i];
	}
	System.out.println(vals[3]);
}

 static void mysteryNum(int num) {
	System.out.println(num);
	if(num > 0) {
		mysteryNum(num - 1);
	}
}
 
}
