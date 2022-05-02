package Serialization;

import java.io.*;

public class Appendable extends ObjectOutputStream {
	public Appendable(OutputStream arg0) throws IOException {
		super(arg0);
		 
	}
	@Override
	protected void writeStreamHeader()	{}

}