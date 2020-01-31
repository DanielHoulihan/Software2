
public class Frame {

	static char[] Frame = new char[7];

	public static void Letters() {

		Frame[0] = 'A';
		Frame[1] = ' ';
		Frame[2] = 'Q';
		Frame[3] = 'P';
		Frame[4] = ' ';
		Frame[5] = 'L';
		Frame[6] = 'D';

		System.out.println("Stored");

	}

	public static void Check() {

		boolean FrameLetter = false;
		char letter = 'A';

		for(int i = 0; i < 7; i++) {
			if(Frame[i] == letter) {
				FrameLetter = true;
			}
		}
		System.out.println(FrameLetter);
	}

	public static void CheckNull() {

		boolean isNull = true;

		for(int i = 0; i < 7; i++) {
			if(Frame[i] != ' ') {
				isNull = false;
				break;
			}
		}
		System.out.println(isNull);
	}

	public static void Display() {

		System.out.println(Frame);

	}

	public static void Refill() {

		for(int i = 0; i < 7; i++) {
			if(Frame[i] == ' ') {
				Frame[i] = 'Z';
			}
		}
		System.out.println(Frame);
	}

	public static void Remove() {

		for(int i = 0; i < 7; i++) {
			if(Frame[i] == 'L') {
				Frame[i] = ' ';
			}
		}
		System.out.println(Frame);
	}



	public static void main(String[] args) {

		Letters();
		Check();
		CheckNull();
		Display();
		Refill();
		Remove();

	}
	}
