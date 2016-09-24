import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\x.person"));
		oos.writeObject(new Person("����", 20));
		oos.writeObject(new Person("����", 18));
		oos.writeObject(new Person("����", 23));
		oos.writeObject(null);// ����null�������ж��Ƿ��ȡ����β��
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\x.person"));
		Object obj = null;
		while ((obj = ois.readObject()) != null) { // ���Ϊnull�Ͷ�ȡ���ļ���β�ˡ�
			Person person = (Person) obj;
			System.out.println(person);
		}
	}
}