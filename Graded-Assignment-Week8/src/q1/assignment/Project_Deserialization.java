package q1.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Project_Deserialization {

	static Employee e;
	public static void main(String[] args) throws IOException, ClassNotFoundException {

			try {

				FileInputStream fis = new FileInputStream("D:\\Jagadishwar\\Emp-project.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);

				Project obj = (Project) ois.readObject();
				obj.printData();

			} catch (Exception excp) {
				System.out.println(excp.getMessage());
			}
	}

}
