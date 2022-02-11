package StreamAPI;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OutputStringCountFromProject {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\vasil\\IdeaProjects\\chemcool-server311021\\pom.xml");
        long lineCount = Files.lines(path).count();
        System.out.println(lineCount);

        long g = countLines(new File("C:\\Users\\vasil\\IdeaProjects\\chemcool-server311021\\pom.xml"));
        System.out.println(g);

        // don't work
        Path ty = Paths.get(String.valueOf(new File("c:\\Temp")));
        Stream<String> hu = Files.lines(ty);
        //hu.count();

        System.out.println(hu.count());





    }





    public static int countLines(File aFile) throws IOException {
        LineNumberReader reader = null;
        try {
            reader = new LineNumberReader(new FileReader(aFile));
            while ((reader.readLine()) != null);
            return reader.getLineNumber();
        } catch (Exception ex) {
            return -1;
        } finally {
            if(reader != null)
                reader.close();
        }
    }



}
