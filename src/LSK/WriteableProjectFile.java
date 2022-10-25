 package LSK;

public class WriteableProjectFile extends ProjectFile {
	public WriteableProjectFile(String filePath) {
		super(filePath);
	}
	
	public void storeFile() {
		System.out.println("file saved to " + this.filePath);		
	}
}
