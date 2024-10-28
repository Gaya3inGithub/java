package Polymorphism;

public class Type_of_sort {
public void Bubble_sort(int[]a)
{
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("sorting by bubble sort:");
	for(int i=0;i<a.length;i++)
	{
		
		System.out.print(a[i]+" ");
	}
	System.out.println();
}

public void Merge_sort(int []a,int left,int right)
{
	
        if (left < right) 
        {
            int mid = left + (right - left) / 2;

            Merge_sort(a, left, mid);
            Merge_sort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
}
    public  void merge(int[] a, int left, int mid, int right)
    {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        System.arraycopy(a, left, leftArray, 0, leftArray.length);
        System.arraycopy(a, mid + 1, rightArray, 0, rightArray.length);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void printArray(int[] a) {
    	System.out.println("sorting by merge sort:");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
