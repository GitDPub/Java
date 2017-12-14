package algorithms;

public class TestSortQuick
{
    public static void main(String[] args) {
        int [] a = {50, 25, 10, 5, 40, 1, 7};
        SortClass s = new SortClass();

    }
}

class SortClass
{
    int [] array;
    int length;
    public void change(int i, int j){
        array[i]=array[i]+array[j];
        array[j]=array[i]-array[j];
        array[i]=array[i]-array[j];
    }

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0)
            return;
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    public void quickSort(int lowerIndex, int higherIndex) {
        int low=lowerIndex;
        int high=higherIndex;
        int pivot = array[low+(high-low)/2];
        while(low < high){
            while(array[low] < pivot){
                low++;
            }
            while(array[high] > pivot){
                high--;
            }
            if(low < high){
                change(low,high);
                low++;
                high--;
            }
            if(lowerIndex < high)
                quickSort(lowerIndex, high);
            if(low < higherIndex)
                quickSort(low, higherIndex);
        }
    }


}
