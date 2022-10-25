package LSK;

public class Main {

	public static void main(String[] args) {
		Project project = new Project();
		
		ProjectFile f1 = new WriteableProjectFile("/src/test1.png");
		ProjectFile f2 = new ReadOnlyProjectFile("/src/test2.png");
		ProjectFile f3 = new WriteableProjectFile("/src/test3.png");
		
		project.addProject(f1);
		project.addProject(f2);
		project.addProject(f3);
		
		project.loadAllFiles();
		project.storeAllFiles();
		
	}

}
