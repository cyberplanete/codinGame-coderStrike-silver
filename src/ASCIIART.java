import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {

	// private static List<String> listMots2 = new ArrayList<String>();
	public static void main(String args[]) {

		List<String> listMots = new ArrayList<String>();
		String[] listMots1 = { "", "", "", "", "", "" };
		String[] listMots2 = new String[20];
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		String[] arrOfAlphabet = alphabet.split("(?<=\\G.{1})");

		String[] arrOfStr;
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int H = in.nextInt();
		if (in.hasNextLine()) {
			in.nextLine();
		}

		String T = in.nextLine();

		if (L == 4) {

			for (int i = 0; i < H; i++) {
				String ROW = in.nextLine();
				System.err.println("Mon ROW :" + ROW);
				arrOfStr = ROW.split("(?<=\\G.{4})");
				sb.setLength(0);

				if (T.length() > 1) {
					String unMot = T.toUpperCase();
					String[] arrOfT = unMot.split("(?<=\\G.{1})");

					List<String> monAlphabet = new ArrayList<String>(Arrays.asList(arrOfAlphabet));

					for (int g = 0; g < arrOfT.length; g++) {

						if (!monAlphabet.contains(arrOfT[g])) {

							sb.append(arrOfStr[26]);
							String unString = sb.toString();
							System.err.println("lettre inconnu:" + g);
							listMots1[i] = unString;

						} else {

							for (int f = 0; f < arrOfAlphabet.length; f++) {
								String uneLettre = arrOfAlphabet[f];
								/* System.err.println("Alphabet:" + arrOfAlphabet[f]); */
								// Index de la lettre si trouvé
								if (uneLettre.equalsIgnoreCase(arrOfT[g])) {
									/*
									 * System.err.println("lettre :" + arrOfT[g]); System.err.println("lettre :" +
									 * arrOfStr[f]);
									 */
									sb.append(arrOfStr[f]);
									String unString = sb.toString();
									System.err.println("lettre connue:" + g);
									listMots1[i] = unString;
								}

							}

						}

					}

				}

				else {
					System.err.println("ici:" + i);
					for (int f = 0; f < arrOfAlphabet.length; f++) {
						String uneLettre = arrOfAlphabet[f];
						/* System.err.println("Alphabet:" + arrOfAlphabet[f]); */
						// Index de la lettre si trouvé
						if (uneLettre.equalsIgnoreCase(T)) {
							// System.err.println("lettre :" + arrOfAlphabet[f]);
							// System.err.println("lettre :" + arrOfStr[f]);
							listMots1[i] = arrOfStr[f];
						}

					}

				}

			}

			for (String unMot : listMots1) {

				System.out.println(unMot);
				// System.err.println(listMots.size());

			}

		} else {
			/*
			 * System.err.println("H :" + H); System.err.println("L :" + L);
			 */

			for (int v = 0; v < 11; v++) {
				String ROW = in.nextLine();
				System.err.println(ROW.length());
				arrOfStr = ROW.split("(?<=\\G.{20})");
				sb.setLength(0);
				String unString = "";
				if (T.length() > 1) {
					/* String unMot = T.toUpperCase(); */
					String unMot = T.toUpperCase();
					String[] arrOfT = unMot.split("(?<=\\G.{1})");

					List<String> monAlphabet = new ArrayList<String>(Arrays.asList(arrOfAlphabet));

					for (int g = 0; g < arrOfT.length; g++) {
						String maLettreT = arrOfT[g];

						if (!monAlphabet.contains(arrOfT[g])) {

							sb.append(arrOfStr[26]);
							unString = sb.toString();

							listMots2[v] = sb.toString();

						} else {

							for (int f = 0; f < arrOfAlphabet.length; f++) {
								String uneLettre = arrOfAlphabet[f];
								// System.err.println("Alphabet:" + arrOfAlphabet[f]);
								// Index de la lettre si trouvé

								if (uneLettre.equalsIgnoreCase(maLettreT)) {
									/*
									 * System.err.println("lettre :" + arrOfT[g]); System.err.println("lettre :" +
									 * arrOfStr[f])
									 */;

									sb.append(arrOfStr[f]);
									unString = unString + arrOfStr[f];

									listMots2[v] = unString;

								}

							}

						}

					}

				}

				else {
					System.err.println("ici:" + v);
					for (int f = 0; f < arrOfAlphabet.length; f++) {
						String uneLettre = arrOfAlphabet[f];
						/* System.err.println("Alphabet:" + arrOfAlphabet[f]); */
						// Index de la lettre si trouvé
						if (uneLettre.equalsIgnoreCase(T)) {
							System.err.println("lettre :" + arrOfAlphabet[f]);
							// System.err.println("lettre :" + arrOfStr[f]);

							listMots2[v] = arrOfStr[f];
						}

					}

				}

			}

			for (String unMot : listMots2) {

				if (unMot != null) {
					System.out.println(unMot);
				}

				// System.err.println(listMots.size());

			}

		}

	}
}