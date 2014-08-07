import java.io.*;
import java.awt.*;

public class SerializableHint implements Serializable {
	
	int x, y;
	String hint;
	
	public SerializableHint(double x, double y, String hint) {
		this.x = (int) x;
		this.y = (int) y;
		this.hint = hint;
	}

}