package org.jf.uni.week7;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Map<String, Integer> wordCountsMap = new WordCounter().countWords("/data.txt");
        File out = new File(WordCounter.class.getResource("/").getFile() , "wordcount.csv");
        try(Writer writer = new BufferedWriter(new FileWriter(out))){
            for (Map.Entry<String, Integer> wordCountEntry: wordCountsMap.entrySet()){
                writer.write(wordCountEntry.getKey() + "," + wordCountEntry.getValue() + "\n");
            }
        }
    }

    public Map<String, Integer> countWords(String fileName) throws IOException {
        try(InputStream fileInput = getClass().getResourceAsStream(fileName)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInput));
            Map<String, Integer> wordCount = new TreeMap<>();
            for(String s = reader.readLine(); s != null; s = reader.readLine()){
                String[] words = s.split("\\W");
                for (String word: words){
                    if (!word.isEmpty()){
                        Integer count = wordCount.get(word.toLowerCase());
                        if (Objects.isNull(count)){
                            wordCount.put(word.toLowerCase(), 1);
                        } else {
                            wordCount.put(word.toLowerCase(), count + 1);
                        }
                    }
                }
            }
            return wordCount;
        }
    }
}
