package com.nareshIT.day70;

/*
 *  00 01 02
     1  2  3
   10  11 12
     4  5  6
    20 21 22
     7  8  9



     [
     [1],
     [2,4],
     [3,5,7],
     [6,8],
     [9]
     ]
     
     1 2
     3 4


 */
public class ProductEquality {
	private static void printDiagonal(int[][] arr) {

		int n = arr.length;
		int m = 3;
		int newArr = n * 2 - 1;
		int[][] result = new int[newArr][3];
		int[] sizes = new int[newArr];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int d = i + j;
				result[d][sizes[d]++] = arr[i][j];
			}
		}

		System.out.println("[");
		for (int i = 0; i < newArr; i++) {
			System.out.print("[");
			for (int j = 0; j < sizes[i]; j++) {
				System.out.print(result[i][j]);
				if (j < sizes[i] - 1)
					System.out.print(",");
			}

			System.out.print("]");

			if (i < newArr - 1)
				System.out.println(",");
			else
				System.out.println();
		}
		System.out.println("]");
	}

	private static void printDiagonal2(int[][] aa) {
		int x = 0;
		int n = aa.length * 2 - 1;
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while (n != 0) {
			sb.append("[");
			int p = 0;
			for (int i = 0; i < aa.length; i++) {
				for (int j = 0; j < aa[i].length; j++) {
					if (i + j == x) {
						if (p < x) {
							sb.append(aa[i][j] + ", ");
						} else {
							sb.append(aa[i][j]);
						}
						p++;
					}
				}
			}
			
			sb.append("], ");
			x++;
			n--;
		}
		sb.append("]");
		System.out.println(sb);
	}

	public static void main(String[] args) {
		int[][] aa = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printDiagonal2(aa);

	}

}
