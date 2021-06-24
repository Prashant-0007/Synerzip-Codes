class BubbleSortDemo {

	public static void main(String[] args) {
		
	int arr[] ={1,5,9,3,5};
	int size=arr.length;

	int maxEle,temp;
	for(int pass=1;pass<=size-1;pass++) {

		for(int i=0;i<size-1;i++) {
			maxEle=i;
			if(arr[maxEle]>arr[i+1])
				maxEle=i+1;

		
		temp=arr[i];
		arr[i]=arr[maxEle];
		arr[maxEle]=temp; }
	}

	//printing the output
	for(int i=0;i<size;i++) {

		System.out.print("\t"+(arr[i]));

	}
	System.out.println();

}
	
}
