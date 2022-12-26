import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class readints {

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);

		while (true) {
			try {

				int i = in.readInt();
				System.out.println(i);

			} catch (EOFException e) {
				e.printStackTrace();
				break;

			}

		}

	}
}