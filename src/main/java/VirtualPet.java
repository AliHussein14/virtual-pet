import java.util.Random;

public class VirtualPet {
	private String name = "Sammy the Snake";
// 
    private int hunger = 0;
    private int thirst = 0;
    private int play = 0;
    private int sleep = 12;
 
    // get random method
    Random random = new Random();
    public int getRandom() {
        return random.nextInt(10); // 0-9
    }
    //tick makes time go by
    public void tick() {
        hunger += (5 + getRandom());
        thirst += (3 + getRandom());
        play += (2 + getRandom());
        sleep -= (2 + getRandom());
        
        }
    
    // returns
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBored() {
        return play;
    }
    public int getTired() {
        return sleep;
    }
    
    // these are my methods 
    public void feed(){
        hunger -= 5; 
        play += 2; 
        
    }
    
    public void pet () {
        play -= 2;
        sleep += 3;
    }
    
    public void haveFun () {
        thirst -= 5; 
        hunger += 3; 
    
	
    }
	public void sammy() {
	}
	// this prints an image of a snake
	public static void snake()
	{
		System.out.println("         ,,'6''-,.");
		System.out.println("        <====,.;;--.");
		System.out.println("        _`---===. \"\"\"==__");
		System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("     |( @@@  |===|  @@@  ||");
		System.out.println("      \\\\ @@   |===|  @@  //");
		System.out.println("        \\\\ @@ |===|@@@ //");
		System.out.println("         \\\\  |===|  //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
		System.out.println("             |==||                           `\\   \\");
		System.out.println("            |==| |          pb                 )   |");
		System.out.println("           |==| |       _____         ______,--'   '");
		System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
		System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
		System.out.println("                \"\"\"\"		");
	}
}