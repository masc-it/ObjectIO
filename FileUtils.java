import java.io.File;

public class FileUtils {

	public static boolean exists(String path) {
		
		File tmp = new File(path);
		return tmp.exists();
		
	}
	
}
