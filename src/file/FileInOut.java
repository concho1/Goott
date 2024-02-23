package file;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileInOut {
    public static void main(String[] args) {
        String path = "C:/NCS/intellijWorkSpace/newGoott/src/file/textTest.text";
        String outText = """
                         안녕하세요!
                         
                         1
                         2
                         3
                         text 처리 test
                         """;
        System.out.println(Charset.defaultCharset().displayName());

        // 파일에 내용 쓰기
        try{
            // StandardOpenOption.APPEND => 이어쓰기, 파일 없으면 자동 생성됨
            Files.writeString(Path.of(path), outText, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }catch(Exception ignored){}

        // 파일에 내용 모두 String 타입으로 가져오기
        try{
            String contentAll = Files.readString(Path.of(path), StandardCharsets.UTF_8);
            System.out.print(contentAll);
        }catch(Exception ignored){}

        // 파일에 내용 stream으로 한쭐씩 읽어오기
        try(Stream<String> contentLine = Files.lines(Path.of(path), StandardCharsets.UTF_8);){
            contentLine.forEach(System.out::println);
        }catch (Exception ignored){}

    }



}
