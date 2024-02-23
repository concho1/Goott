package file;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileIO_05 {
    public static void main(String[] args)throws Exception {
        long start, end;

        start = System.nanoTime();
        var p = Path.of("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\Koala.jpg");
        byte[] image = Files.readAllBytes(p);
        end = System.nanoTime();
        System.out.printf("nio : %,d\n" , (end - start));


        var p2 = Path.of("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\test1.jpg");
        Files.write(p2, image);

        start = System.nanoTime();
        FileInputStream is = new FileInputStream("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\Koala.jpg");
        while(is.read() != -1){}
        end = System.nanoTime();
        System.out.printf("io noBuffer : %,d\n" , (end - start));


        start = System.nanoTime();
        var buffer = new BufferedInputStream(new FileInputStream("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\Koala.jpg"));
        while(buffer.read() != -1){}
        end = System.nanoTime();
        System.out.printf("io Buffer: %,d\n" , (end - start));
    }
}
