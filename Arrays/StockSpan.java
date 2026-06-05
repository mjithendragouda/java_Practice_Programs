import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] stockSpan = new int[n];
        int lastBig = 0;
        stockSpan[0] = 1;
        System.out.print(stockSpan[0] + " ");
        for (int i = 1; i < n; i++) {
          /*  if (arr[i - 1] < arr[i]) {
                if (arr[lastBig] < arr[i]) {
                    stockSpan[i] = i + 1;
                    lastBig = i;
                } else {
                    int k = lastBig;
                    int j = i - 1;
                    int count = 1;
                    while (k < j) {
                        if (arr[i] > arr[j]) {
                            stockSpan[i] = count + 1;
                        }
                        j--;
                        count++;
                    }
                }
            } else {
                stockSpan[i] = 1;

            } */




            int j=i-1;
            while (j>=0 && arr[j] < arr[i]) {
                j = j-stockSpan[j];
            }
            stockSpan[i]=i-j;
            System.out.print(stockSpan[i] + " ");
        }

        sc.close();
    }
}
