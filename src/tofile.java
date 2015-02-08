//written by Jack Eller

import java.io.*;

public class tofile{

    public void to(user c){

	try
	    {
         FileOutputStream fileOut = new FileOutputStream("//people/" + c.getID() + ".name");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(c);
         out.close();
         fileOut.close();
         System.out.println("Saved to " + "//people/" + c.getID() + ".name");
	    }catch(IOException i)
	    {
		i.printStackTrace();
	    }

    }



}