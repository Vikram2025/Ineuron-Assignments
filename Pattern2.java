package firstproj;

public class Pattern2 {

	public static void main(String[] args) {
	int row = 16, spaces = row;
	
	for(int i = 0; i < 8; i++)
	{ 
		for(int j = 0;j < 8;j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
	for(int i = 0; i < 8; i++)
	{ 
		spaces-=2;
		for(int j = 0;j < i+1;j++) 
			System.out.print("*"); // 1
		
		
		for(int j = 0;j < spaces;j++) 
			System.out.print(" ");   //14
	
		
        for(int j = 0;j < i+1;j++)  
			System.out.print("*");  // 1
				
		System.out.println();
	}
	

		

	}

}
