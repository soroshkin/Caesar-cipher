package main.java.com.epam;

public class CaesarCipher {
    public static void main(String[] args) {
        String encryptedText = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, " +
                "ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. Зъеъёс " +
                "вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх " +
                "мъбдчъмъжадшд югщючющиивх. Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ" +
                " дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. Ю зъв гъ въгъъ, " +
                "еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х " +
                "чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. Гхязю ёънъгюъ " +
                "вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф " +
                "деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х " +
                "ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";

        for (int i = 0; i < 33; i++) {
            System.out.println(new CaesarCipher().decryptText(encryptedText, Alphabets.RUSSIAN.getAlphabet(), i));
        }
    }

    public String decryptText(String encryptedText, String alphabet, int shift) {
        final int SHIFT_MULTIPLIER = 2;
        StringBuilder decryptedText = new StringBuilder();

        shift = shift >= alphabet.length() / SHIFT_MULTIPLIER ? shift % (alphabet.length() / SHIFT_MULTIPLIER) : shift;

        for (int i = 0; i < encryptedText.length(); i++) {
            if (!Character.isLetter(encryptedText.charAt(i))) {
                decryptedText.append(encryptedText.charAt(i));
                continue;
            }

            int letterIndexInAlphabet = alphabet.indexOf(encryptedText.charAt(i));

            if (letterIndexInAlphabet + SHIFT_MULTIPLIER * shift >= alphabet.length()) {
                decryptedText.append(alphabet.charAt(SHIFT_MULTIPLIER * shift - (alphabet.length() - letterIndexInAlphabet)));
            } else {
                decryptedText.append(alphabet.charAt(letterIndexInAlphabet + SHIFT_MULTIPLIER * shift));
            }
        }

        return decryptedText.toString();
    }
}
