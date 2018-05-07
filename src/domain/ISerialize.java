package domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ISerialize {
	
	public abstract void write(IAddable order) throws FileNotFoundException, IOException;
	
}
