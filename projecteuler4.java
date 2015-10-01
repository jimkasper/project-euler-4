public class projecteuler4 {
	public static void main(String[] args) {
		
		int ans = 0;
		
	for(int p = 100; p < 998001; p++){
		
		
			
		int first = p / 10000; 
		int last = p % 10000;
		int second = p/1000%10;
		int secondlast = p%1000/10;
		int third = p/100%100;
		int thirdlast = p%100/100;
			
			
		if(first == last && second == secondlast && third == thirdlast){
				
			for(int a = 100000; a <998001; a++){
				for(int b = 998001; b >100000; b--){
					if(a*b == p){
						ans = a*b;
						System.out.println(ans);
					}
						
						
						
					
				}			
			}		
		}
		
	}
	
	}
}