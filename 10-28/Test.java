public class Test {
    
    public static int sum(int[] a) {
        int sum = 0;
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
    }
    public static void main(String[] args) {
        int[] array = new int[3]; //[0,1,2] = 3
        for (int i = 0; i<array.length; i++){
            array[i] = i;
        }
        int value = sum(array);
        System.out.println(value);
    }
}
