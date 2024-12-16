package pkg;

public class CVMath {
	
	public static void specialSquare(int x){
		int count = 0;
		int next = 1;
		int square = 0;
		int sum = 0;
		
		for(int i = 1; ;i++){
			square = i * i;
			
			for(int a = next; ;a++){
				sum = sum + a;
				
				if(sum == square){
					count++;
					System.out.println(sum);
					
					if(count == x){
						return;
					}
					
					next = a + 1;
					break;
				}
				
				else if(square < sum){
					next = a + 1;
					break;
				}
			}
		}
	}
}
