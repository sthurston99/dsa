package queueDriver;

import queue.*;

/**
 * A Printer has a speed, in blocks of printing per step, and a queue of Docs to be printed
 * 
 * @author (sdb and PUT YOUR NAME HERE)
 * @version (2020) 
 */
public class Printer
{
    private int speed;      // speed of this printer, blocks per step
    private QueueADT <Doc> docs;    // Queue of documents waiting to be printed
    private String id;      // name of this Printer
    private Doc docPrinting = null;
    private int leftToPrint = 0;

    /**
     * Constructor for objects of class Printer
     */
    public Printer(int speed, String id)
    {
      docs = new Queue<Doc>();
      this.speed = speed;
      this.id = id;
    }

    /** Add a document to this printer's queue 
       Display the document and printer on stdout.
       */
    public void add (Doc doc)
    {    
       docs.add(doc);
        
        //////////// Do not change this println statement ///////////////
        System.out.println(doc + " added to " + this);
    }

    /** Print several blocks, if necessary, determined by this printer's speed.
     * Display a completion message, if necessary.
     *  
     */
    public void print()
    {  
    	if(!docs.isEmpty() ) {
	        if(docPrinting == null) {
	        	docPrinting = docs.peek();
	        	leftToPrint = docPrinting.size();
	        }
	    	if(leftToPrint - speed <= 0) {
	        	System.out.println(id + " Finished Printing " + docs.remove());
	        	docPrinting = null;
	        } else {
	        	leftToPrint -= speed;
	        }
    	}
    }

    /** @return the number of documents in this Printer's queue */
    public int size()
    {   return docs.size();  }

    public String toString()
    {   return id + ", speed: " + speed + ", docs in queue: " + size();  }
}
