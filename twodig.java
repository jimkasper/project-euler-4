 class twodig {
	public static void main(String[] args) {
		
		int ans = 0;
		
		for(int p = 1; p < 10000; p++){
		for(int a = 1; a < 100; a++){
		for(int b = 99; a/p == 1; b--){
		
		
			
		int first = p / 1000; 
		int last = p % 1000;
		int second = p/100%10;
		int secondlast = p/10%100;
		//int third = p/10%100;
		//int thirdlast = p%100/100;
			
			
			if(first == last && second == secondlast){
			 
			
				int pal = 0;
				
				
					if(p / (a*b) == 1){
						p = pal;
						
					System.out.println(pal);}
						
					
					//	System.out.println(ans);
					
						
									
			}			
		}		
		}
		
		}
	
	}
}