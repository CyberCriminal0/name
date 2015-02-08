//written by Jack Eller

import java.io.*;

public class tofile{

    public void to(user c){

	try
	    {
         File dir = new File("names");
	 dir.mkdir();
         FileOutputStream fileOut = new FileOutputStream("names/" + c.getID() + ".name");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(c);
         out.close();
         fileOut.close();
         System.out.println("Saved to: names/" + c.getID() + ".name");
	    }catch(IOException i)
	    {
		i.printStackTrace();
	    }

    }



}