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

```
## 4)Reverse Array

```

```



