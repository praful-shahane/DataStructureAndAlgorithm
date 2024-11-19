# Array  Questions 
===================
## Foundation Questions
======================
```
 1)//Sum of Array
		
		int arr[] = {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum of array is "+sum); //21

```
## 2)Max Of Array

```
2)//max of Array
		
		int arr[] = {1,8,9,4,5,6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("max of array is "+max); //9

```

## 3)Swap indexes of Array

```
3)//Swap indexes of Array
		int arr[] = {1,8,9,4,5,6};
		swapIndexOfArray(arr, 0, 2);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");//9 8 1 4 5 6
    }
public static void swapIndexOfArray(int[]arr, int idx1, int idx2) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;	
	}
Time Complexixty=>O(1)
Space Complexity =>O(1)


```
## 4)Longest Number at Least Twice in Array

```
		//Largest element in an array is greater than or equal
		//to other element in array
		
		int arr[] = {3,-2,4,7,8,24};
		int largestElementTwice = largestElementTwice(arr);
		System.out.println(largestElementTwice);  // index of maxElemnt is 5


public static int largestElementTwice(int[] arr) {

		int max = Integer.MIN_VALUE;
		int maxIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				maxIndex = i;
			}
                }

		for (int i = 0; i < arr.length; i++) {
				if (maxIndex != i && arr[maxIndex] < 2 * arr[i]) {
				return -1;
			        }
               }
		return maxIndex;
		}

Time Complexixty=>O(n) i.e. we use for loop to find out max as well as check.
Space Complexity =>O(1)

```
## 4)Reverse Array (Whole array) or (reverse given part of array)

```
//Reverse Element in an Array

		int arr[] = {3,-2,4,7,8,24};
		int sp=0;
		int ep=arr.length-1;
		
		reverseArray(arr, sp, ep);
		System.out.println(Arrays.toString(arr)); //[24, 8, 7, 4, -2, 3]
	
	public static void reverseArray(int[] arr, int sp, int ep)
	{

		while (sp < ep) {
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;

			sp++;
			ep--;
						}

	  }

Time Complexixty=>O(n) i.e. we use for loop to find out max as well as check.
Space Complexity =>O(1)

```
## 5)Rotate the Array

### 5.A)Rotate the Array from last to first by K times


```
=>Given N elements,Rotate array from last to first by K times
arr[7] ={3,-2,1,4,6,9,8};
k=3.
Note:- k may be less than or greater than N(Size of array)
o/p=>{6,9,8,3,-2,1,4};

Approach:-
step1)reverse the given array. reverse(arr,0,n-1)
step2) reverse the first k elemnt.  reverse(arr,0,k-1)
step 3)reverse the elements after k elements.  reverse(arr,k,n-1)


//Rotate Element in an Array i.e  last element goes to first

		int arr[] = {3,-2,1,4,6,9,8};
		int sp=0;
		int ep=arr.length-1;
		int k=3;
 		if(K>ep){
                     k=k%ep;
                }
		
		reverseArray(arr, sp, ep);
		reverseArray(arr, sp, k-1);
		reverseArray(arr, k, ep);
		
		System.out.println(Arrays.toString(arr));  //[6, 9, 8, 3, -2, 1, 4]
		 
	
	public static void reverseArray(int[] arr, int sp, int ep)
	{

		while (sp < ep) {
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;

			sp++;
			ep--;
						}

	  }

Time Complexixty=>O(n) i.e. we use for loop to find out max as well as check.
Space Complexity =>O(1)

```

### 5.B)Rotate the Array from last to first by K times


```
=>Given N elements,Rotate array from first to last by K times
arr[7] ={3,-2,1,4,6,9,8};
k=3.
Note:- k may be less than or greater than N(Size of array)
o/p=>{4,6,9,8,3,-2,1};

Approach:-
step1)reverse the given array. reverse(arr,0,n-1)
step2) reverse the first k elemnt.  reverse(arr,0,k)
step 3)reverse the elements after k elements.  reverse(arr,k+1,n-1)

//Rotate Element in an Array i.e  first element goes to last 

		int arr[] = {3,-2,1,4,6,9,8};
		int sp=0;
		int ep=arr.length-1;
		int k=3;
               if(K>ep){
                     k=k%ep;
                }
		
		reverseArray(arr, sp, ep);
		reverseArray(arr, sp, k);
		reverseArray(arr, k+1, ep);
		
		System.out.println(Arrays.toString(arr));  //[4, 6, 9, 8, 3, -2, 1]
	
	
	public static void reverseArray(int[] arr, int sp, int ep)
	{

		while (sp < ep) {
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;

			sp++;
			ep--;
						}

	  }


Time Complexixty=>O(n) i.e. we use for loop to find out max as well as check.
Space Complexity =>O(1)

```
