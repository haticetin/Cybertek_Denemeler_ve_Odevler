package Fatma_Sinav_Denemeler;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int i=0;
		
		// 1
		do {
			i += 20;
			if (i > 40) break;
			} while (i > 10);

		System.out.println(i);

		// 2
		i = 0;
		for (int j = 10; j > i; ++i, --j);

		System.out.println(i);

		// 3
		i = 0;
		for (int j = 0; j <= 10; ++j)
			for (int k = 0; k <= 10; k += 2)
			++i;
		
		System.out.println(i);
		
		// 4 
		i = 0;
		switch (i % 3) {
		case 1: i = 9; if (i % 3 == 0) ++i; break;
		case 2: i = 5; if (i % 3 != 0) --i; break;
		default: if (i != 0) ++i; break;
		}

		System.out.println(i);
		
		// 5
		i = 0;
		i -= (i + 2) * (i + 3) > 7 ? 4 : -3;
		
		System.out.println(i);
		
	}

}
