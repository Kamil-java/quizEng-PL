package Mechanic;

import Entities.Words;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddValueToDateBase {
    private List<String> pl;

    public List<String> getPl() {
        return pl;
    }

    public List<String> getEng() {
        return eng;
    }

    private List<String> eng;

    public Set<Words> add() {
        pl = new ReaderFile().reader("FileToRead/polishWords.txt");
        eng = new ReaderFile().reader("FileToRead/englishWords.txt");
        Set<Words> allWords = new HashSet<>();
        for (int i = 0; i < pl.size(); i++) {
            for (int j = i; j < i + 1; j++) {
                crateStatementWords(allWords, eng.get(j), pl.get(i));
            }
        }

        return allWords;
    }

    private void crateStatementWords(Set<Words> allWords, String eng, String pl) {
        Words word = new Words(eng, pl);
        allWords.add(word);
    }
}
