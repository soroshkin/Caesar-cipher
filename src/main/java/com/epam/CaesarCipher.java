package main.java.com.epam;

public class CaesarCipher {
    public static void main(String[] args) {
String text = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        CaesarCipher caesarCipher = new CaesarCipher();
        for (int i = 0; i < 34; i++) {
            System.out.println(caesarCipher.getDecryptedTextUsingAlphabet(text, i));
        }
    }


    public String getDecryptedTextUsingAlphabet(String encryptedText, int shift) {
        String alphabetString = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        char[] arrayOfCharsFromString = encryptedText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < arrayOfCharsFromString.length; i++) {
            if (!Character.isLetter(arrayOfCharsFromString[i])) {
                decryptedText.append(arrayOfCharsFromString[i]);
                continue;
            }

            int letterIndexInAlphabet = alphabetString.indexOf(arrayOfCharsFromString[i]);
            if (letterIndexInAlphabet + 2 * shift >= alphabetString.length()) {
                decryptedText.append(alphabetString.charAt(2 * shift - (alphabetString.length() - letterIndexInAlphabet)));
            } else {
                decryptedText.append(alphabetString.charAt(letterIndexInAlphabet + 2 * shift));
            }
        }

        return decryptedText.toString();
    }

}
