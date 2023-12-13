package q1.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Project_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

			try {

				FileInputStream fis = new FileInputStream("D:\\Jagadishwar\\Emp-project.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Map<Project, ArrayList<Employee>> deserializedMap = (Map<Project, ArrayList<Employee>>) ois.readObject();
				ois.close();
				fis.close();

				for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedMap.entrySet()) {
					System.out.println(entry.getKey());
					for (Employee employee : entry.getValue()) {
						System.out.println(employee);

					}
					System.out.println();
				}

			} catch (IOException excp) {
				excp.printStackTrace();
				return;
			} catch (ClassNotFoundException cnfe) {
				System.out.println("Employee class not found");
				cnfe.printStackTrace();
				return;
			}
	}

}
