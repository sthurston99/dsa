package queueDriver;

/**
 * A Doc has a size, in blocks, to be printed.
 * 
 * @author (sdb and PUT YOUR NAME HERE) 
 * @version (2020)
 */
public class Doc
{
    private int size;      // size of this Doc, in blocks

    /**
     * Constructor for objects of class Printer
     */
    public Doc(int size)
    {
        this.size = size;
    }
    
    public int size()
    {   return size;  }
    
    public String toString() {
    	return "Doc of size " + size;
    }
    
}
