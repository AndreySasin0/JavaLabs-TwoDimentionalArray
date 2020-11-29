package Laba2;

public class TwoDimArrays {
	public static void main(String[] args) {

		int[][] massive = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])]; // вставить аргументы в
																							// конфигурацию
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				massive[i][j] = (int) (Math.random() * 10);
			}
		}

		ArrayDisplay(massive);
		ArrayMax(massive);
		System.out.println();
		ArrayMin(massive);
		System.out.println();
		switch (args[2]) {
		case "Up":
			UpSortingTimer(massive);
			break;
		case "Down":
			DownSortingTimer(massive);
			break;
		case "Both":
			UpSortingTimer(massive);
			DownSortingTimer(massive);
			break;
		default:
			UpSortingTimer(massive);
		}

	}

	public static int[][] ArrayMax(int[][] massive) {
		int max = massive[0][0];

		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				if (max < massive[i][j]) {
					max = massive[i][j];
				}

			}
		}
		System.out.println("Максимум: " + max);

		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				if (max == massive[i][j]) {
					System.out.print("(" + (i) + " " + (j) + " индекс массива) ");
				}
			}
		}
		return massive;
	}

	public static int[][] ArrayMin(int[][] massive) {
		int min = massive[0][0];
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				if (min > massive[i][j]) {
					min = massive[i][j];
				}
			}
		}
		System.out.println("Минимум: " + min);
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				if (min == massive[i][j]) {
					System.out.print("(" + (i) + " " + (j) + " индекс массива) ");
				}

			}

		}
		return massive;
	}

	public static int[][] ArrayUpSortingColumn(int[][] massive) {
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive.length; j++) {
				for (int m = 0; m < massive[i].length; m++) {
					if (massive[i][m] < massive[j][m]) {
						int buffer = massive[i][m];
						massive[i][m] = massive[j][m];
						massive[j][m] = buffer;
					}
				}
			}

		}
		System.out.println("Отсортированные по возрастанию колонки:");
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.print(massive[i][j] + " ");
			}
			System.out.println();
		}
		return massive;
	}

	public static int[][] ArrayDisplay(int[][] massive) {
		System.out.println("Исходный массив: ");
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.print(massive[i][j] + " ");
			}
			System.out.println();

		}

		return massive;
	}

	public static int[][] UpSortingTimer(int[][] massive) {
		long startTimeBubble = System.nanoTime();
		ArrayUpSortingColumn(massive);
		System.out.println(" ");
		long executionTimeBubble = System.nanoTime() - startTimeBubble;
		System.out.println("Время, затраченное на сортировку: " + executionTimeBubble + " наносекунд");

		return massive;
	}

	public static int[][] ArrayDownSortingColumn(int[][] massive) {
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive.length; j++) {
				for (int m = 0; m < massive[i].length; m++) {
					if (massive[i][m] > massive[j][m]) {
						int buffer = massive[i][m];
						massive[i][m] = massive[j][m];
						massive[j][m] = buffer;
					}
				}
			}

		}
		System.out.println("Отсортированные по убыванию колонки:");
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.print(massive[i][j] + " ");
			}
			System.out.println();
		}
		return massive;
	}

	public static int[][] DownSortingTimer(int[][] massive) {

		long startTimeBubble = System.nanoTime();
		ArrayDownSortingColumn(massive);
		System.out.println(" ");
		long executionTimeBubble = System.nanoTime() - startTimeBubble;
		System.out.println("Время, затраченное на сортировку: " + executionTimeBubble + " наносекунд");

		return massive;
	}

	/*
	 * public static int[][] SortingByArgs(int[][] massive, ) { switch (args[2]) {
	 * case "Up": UpSortingTimer(massive); break; case "Down":
	 * DownSortingTimer(massive); break; case "Both": UpSortingTimer(massive);
	 * DownSortingTimer(massive); break; default: UpSortingTimer(massive); }
	 * 
	 * return massive; }
	 */

}
