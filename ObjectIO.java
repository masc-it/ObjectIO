import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIO {

	private String path;

	ObjectIO(String path) {
		this.path = path;
	}


	public boolean writeObjectToFile(Object serObj) {

		try {

			FileOutputStream fileOut = new FileOutputStream(path);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);

			objectOut.close();
			fileOut.close();

			return true;
		} catch (Exception ex) {
			
			return false;
		}
	}
	

	public Object readObjectFromFile() {

		try {

			//Object o;
			FileInputStream fileIn = new FileInputStream(path);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Object o = objectIn.readObject();

			objectIn.close();
			fileIn.close();

			return o;

		} catch (Exception ex) {
			
			return null;
		}

	}
	
	public boolean writeObjectsToFile(ArrayList<?> serObj) {

		try {

			FileOutputStream fileOut = new FileOutputStream(path);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);

			objectOut.close();
			fileOut.close();

			return true;
		} catch (Exception ex) {
			
			return false;
		}
	}
	
	public ArrayList<?> readObjectsFromFile() {

		try {

			FileInputStream fileIn = new FileInputStream(path);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Object o = objectIn.readObject();

			objectIn.close();
			fileIn.close();

			return (ArrayList<?>) o;

		} catch (Exception ex) {
			
			return null;
		}

	}
}