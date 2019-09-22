enum Type
{
	Q1, Q2, C;
}

public class GumballSuper
{

    private int num_gumballs;
    private boolean has_enough;
    private Type has_type;
    private int sum;

    /**
     * Constructor class 
     * @param size - determines the number of gumballs in the machine
     * @param type - determines the type of gumball machine that is created
     */
    public GumballSuper( int size, Type type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_enough = false;
        this.has_type = type;
        sum = 0;
    }

    /**
     * Inserts a coin into the gumball machine
     * @param coin - only takes ints of valid coins (1, 5, 10...)
     */
    public void insertCoin(int coin)
    {
    	
    	if( this.has_type == Type.Q1 ) // 1 Quarter Gumball Machine
    	{
    		if ( coin == 25 )
                this.has_enough = true ;
            else 
            {
            	this.has_enough = false ;
    			System.out.println( "Not a valid coin, previous coins ejected! " );
            }
                
    	}
    	else if( this.has_type == Type.Q2 ) // 2 Quarter Gumball Machine
    	{
    		if ( coin == 25 )
                sum += coin;
            else 
            {
            	System.out.println( "Not a valid coin, previous coins ejected! " );
    			sum = 50;
                this.has_enough = false ;
            }
    			
    		
    		if ( sum == 50)
    			this.has_enough = true;
    	}
    	else // Any coin Gumball Machine
    	{
    		if ( coin == 5 ) // nickel
    			sum += coin;
    		else if ( coin == 10 ) // dime
    			sum += coin;
    		else if ( coin == 25 ) // quarter
    			sum += coin;
            else 
            	System.out.println( "This is not a valid coin" );
                this.has_enough = false ;
    		
    		if ( sum >= 50 )
    			this.has_enough = true; 
    		
    		// ?? IS IT ALLOWED TO TAKE MORE THAN 50
    	}
        
    }
    
    /**
     * Sets coins into motion and allows gumballs to be delivered
     */
    public void turnCrank()
    {
    	if ( this.has_enough )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "Thanks for your $$$$$.  Gumball Ejected!" ) ;
    			this.has_enough = false ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	
    	else 
    	{
    		System.out.println( "Please insert more change" ) ;
    	}        
    }
    
    /**
     * tests all 3 gumball machines 
     * @param args
     */
    public static void main(String[] args) {
    	
    	System.out.println( "***** Gumball Machine1: Only 25c *****" );
		GumballSuper EJs =  new GumballSuper(1, Type.Q1); // one quarter gumball machine
		EJs.insertCoin(25);
		EJs.turnCrank(); // Ejects gumball
		EJs.insertCoin(10);
		
		EJs.insertCoin(25);
		EJs.turnCrank(); // No Gumball test 
		System.out.println();

		
    	System.out.println( "***** Gumball Machine2: Only 50c *****" );
		GumballSuper EJs2 = new GumballSuper(1, Type.Q2); // two quarter gumball machine
		EJs2.insertCoin(25);
		EJs2.turnCrank(); // Expected: need more change 
		EJs2.insertCoin(25);
		EJs2.turnCrank(); // Ejects gumball
		EJs2.insertCoin(10); // invalid coin test

		EJs2.insertCoin(25);
		EJs.turnCrank();
		EJs2.insertCoin(25);
		EJs2.turnCrank(); // No Gumball test
		System.out.println();
		
		
		
    	System.out.println( "***** Gumball Machine3: Any coin *****" );
		GumballSuper EJs3 = new GumballSuper(1, Type.C);
		
		EJs3.insertCoin(5);
		EJs3.turnCrank();
		
		EJs3.insertCoin(25);
		EJs3.turnCrank();
		
		EJs3.insertCoin(10);
		EJs3.turnCrank();
		
		EJs3.insertCoin(10); // inserted 50cents worth of coins
		EJs3.turnCrank();

		EJs3.insertCoin(2); // 2 cent coin doesn't exist
		EJs3.turnCrank(); // No gumball test
	}
}