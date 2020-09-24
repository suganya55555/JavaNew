
public class javatask1 {

	public static void main(String[] args) {

		String input = "Aspire Systems India Pvt Ltd";

		String output = "";
		String[] sp = input.split(" ");

		for (int i = 0; i < sp.length; i++) {

			if (i % 2 == 1) {

				String s = sp[i];
				String rev = "";
				for (int j = s.length() - 1; j >= 0; j--) {

					char c = s.charAt(j);
					rev = rev + c;

				}

				output = output + rev + " ";

			}

			else {

				output = output + sp[i] + " ";
			}

		}

		System.out.println(output);

	}

}


