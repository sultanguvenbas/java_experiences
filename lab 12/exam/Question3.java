package exam;

public class Question3 {

	
		public static int secondMax(int[] arr) {
			int max =arr[0];
			int secondMax=arr[0];
			
			for (int i=1; i<arr.length; i++) {
				if(max<arr[i]) {
					secondMax=max;
					max=arr[i];
				}else if(secondMax==max){
					secondMax=arr[i];
				}
				else if (secondMax<arr[i]) {
					secondMax=arr[i];
				}
					
				
			}if (secondMax==max) 
				return -1;
			return secondMax;
		}

	public static void main(String[] args) {
		int[] arr = {4,4,4};
		System.out.println(secondMax(arr));
	}
}
