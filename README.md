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


