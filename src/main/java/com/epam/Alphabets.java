package main.java.com.epam;

public enum Alphabets {
    RUSSIAN("АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя");

    private String alphabet;

    Alphabets(String alphabet) {
        this.alphabet = alphabet;
    }

    public String getAlphabet() {
        return alphabet;
    }
}
