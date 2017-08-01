public class InsertionSort {
	public static void insertionSortPart2(int[] ar)
    {
        for (int i = 1; i < ar.length; i ++) {
            int unsorted = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > unsorted) {
                ar[j+1] = ar[j];
                j --;
            }
            ar[j+1] = unsorted;
            printArray(ar);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       	int s = in.nextInt();
       	int[] ar = new int[s];
       	for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       	}
       	insertionSortPart2(ar);                
    }    
    private static void printArray(int[] ar) {
      	for(int n: ar){
        	System.out.print(n+" ");
      	}
        System.out.println("");
   	}
}