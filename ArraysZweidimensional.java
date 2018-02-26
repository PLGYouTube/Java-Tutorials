public class ArraysZweidimensional {

	public static void main(String[] args) {
		/*
		 * array = {
		 * 		array = {'X', 'X', 'X'}, 0
		 * 		array = {'X', ' ', 'X'}, 1
		 * 		array = {'X', 'X', 'X'}, 2
		 * 		...
		 * }
		 */
		
		char[][] spielfeld = new char[3][3];
		
		/*
		 * XXX
		 * X X
		 * XXX
		 */
		
		spielfeld[0][0] = 'X';
		spielfeld[0][1] = 'X';	
		spielfeld[0][2] = 'X';
		spielfeld[1][0] = 'X';
		spielfeld[1][1] = ' ';
		spielfeld[1][2] = 'X';
		spielfeld[2][0] = 'X';
		spielfeld[2][1] = 'X';
		spielfeld[2][2] = 'X';
		
		for (int y = 0; y < spielfeld.length; y++) {
			
			for (int x = 0; x < spielfeld[y].length; x++) {
				System.out.print(spielfeld[y][x]);
			}
			// eine neue Zeile
			System.out.print("\n");
		}
	}

}
