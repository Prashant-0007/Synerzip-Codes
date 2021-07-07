class KnightPlace {
	//static because everyone can access directly.
    static int N = 8;
 
    //To check index position correct or not.
    static boolean toCheck(int row, int col, int arr[][])
    {
        return (row >= 0 && row < N && col >= 0 && col < N
                && arr[row][col] == -1);
    }
 
    //print solution
    static void printSolution(int arr[][])
    {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++)
                System.out.print(arr[row][col] + "	");
            System.out.println();
        }
    }
 
    //To solve using backtracking
    static boolean solveKnight()
    {
        int arr[][] = new int[8][8];
 
        /* Initialization of solution matrix */
        for (int row = 0; row < N; row++)
            for (int col = 0; col < N; col++)
                arr[row][col] = -1;
 
        /* rowMove[] and colMove[] define next move of Knight.
           rowMove[] is for next value of x coordinate
           colMove[] is for next value of y coordinate */
        int rowMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int colMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
 
        // Since the Knight is initially at the first block
        arr[0][0] = 0;
 
        /* Start from 0,0 and explore all tours using
           toSolve() */
        if (!toSolve(0, 0, 1, arr, rowMove, colMove)) {
            System.out.println("Solution does not exist");
            return false;
        }
        else
            printSolution(arr);
 
        return true;
    }
 
    /* A recursive utility function to solve Knight
       position */
    static boolean toSolve(int row, int col, int move,
                               int arr[][], int rowMove[],
                               int colMove[])
    {
        int i, next_row, next_col;
        if (move == N * N)
            return true;
 
        //Try all next moves from the current position of row and col
           
        for (i = 0; i < 8; i++) {
            next_row = row + rowMove[i];
            next_col = col + colMove[i];
            if (toCheck(next_row, next_col, arr)) {
                arr[next_row][next_col] = move;
                if (toSolve(next_row, next_col, move + 1,
                                arr, rowMove, colMove))
                    return true;
                else
                    arr[next_row][next_col] = -1; // backtracking
            }
        }
 
        return false;
    }
 
    /* Driver Code */
    public static void main(String args[])
    {
        // Function Call
        solveKnight();
    }
}

/*OUTPUT:
C:\Users\hp\Desktop\Synerzip\Codes>javac KnightTour.java

C:\Users\hp\Desktop\Synerzip\Codes>java KnightPlace
0       59      38      33      30      17      8       63
37      34      31      60      9       62      29      16
58      1       36      39      32      27      18      7
35      48      41      26      61      10      15      28
42      57      2       49      40      23      6       19
47      50      45      54      25      20      11      14
56      43      52      3       22      13      24      5
51      46      55      44      53      4       21      12

C:\Users\hp\Desktop\Synerzip\Codes>


*/