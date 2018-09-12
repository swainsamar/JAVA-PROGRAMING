class ArrayOperation{
	public static void main(String[] args){
		//========Creation a new array=======
		int[] ia=new int [5];
		//=====Strong/initialising array======
		ia[0]=5;
		ia[1]=6;
		ia[2]=7;
		ia[3]=8;
		ia[4]=9;
		//=====Displaying all values of this array=======
		System.out.println("Original Array");
		System.out.println("[");
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[1]);
			if (i<ia.length-1){
				System.out.println(",");
			}
		}
		System.out.println("]");
		System.out.println();
		//========Retriving 2nd index  (3rd value) from this array======
		System.out.println("Second index  value ia:  "+ia[2]);
		//=====Replacing modifying 2nd index  value==========
		ia[2]=12;
		System.out.println("");
		//=======Displaying all value after replacing=======
		System.out.println("Array after replacing 2nd index ");
		System.out.println("[");
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i]);
			if (i<ia.length-1){
				System.out.println(",");
			}
		}
		System.out.println("]");
		System.out.println(" ");
		//=====Removing 2nd index element(value)======
		int[] nextArray=new int[ia.length-1];
		for(int i=0, j=0; i<ia.length; i++, j++){
			if (i!=2){
				nextArray[j]=ia[i];
			}
			else{
				j=j-1;
			}
		}
		//=======Displaying array value after remove operation=======
		System.out.println("Array value after removing 2nd index");
		System.out.println("[");
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i]);
			if (i<ia.length-1){
				System.out.println(",");
			}
		}
		System.out.println("]");
		System.out.println();
		//======Inserting new element in 2nd index=====
		nextArray=new int [ia.length+1];
		for(int i=0, j=0;i<ia.length; i++, j++){
			if (i !=2){
				nextArray[j]=15;
				nextArray[++j]=ia[i];
			}
		}
		ia=nextArray;
		//======Displaying array value after insert=======
		System.out.println("Array value after inserting 2nd  index");
		System.out.println("[");
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i]);
			if(i<ia.length-1){
				System.out.println(",");
			}
		}
		System.out.println("]");
		System.out.println();
		//======Inserting new element in 2nd index=====
		nextArray=new int [ia.length+1];
		for(int i=0,j=0;i<ia.length;i++,j++){
			if(i !=2){
				nextArray[j]=ia[i];
			}
			else{
				nextArray[j]=15;
				nextArray[++j]=ia[i];
			}
		}
		ia=nextArray;
		//======Displaying arrayvalue after insert=======
		System.out.println("Array vlaue after inserting 2nd index");
		System.out.println("[");
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i]);
			if(i<ia.length-1){
				System.out.println(",");
			}
		}
		System.out.println("]");
		System.out.println();
	}
}

