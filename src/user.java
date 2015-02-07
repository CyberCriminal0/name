//Written by Jack Eller

public class user{

    String name;
    int id;

    public user(String name){
	
	this.name = name;
	
	this.id = (int)(Math.random()*500);

    }

    public String getName(){

	return this.name;

    }
    public int getID(){
	
	return this.id;

    }


}

