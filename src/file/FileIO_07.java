package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/*
    보조 스트림 관련 클래스
    - 보조 스트림 : 다른 스트림과 연결되어 여러 가지 편리한 기능을 제동해 주는 스트힘을 말함
    - 보조 스트림은 중간에 메모리 버퍼와 작업을 함으로써 실행의 성능을 향상시킬 수 있음
    예를 든다면 프로그램은 직접 하드 디스크에 데이터를 보내지 않고 메모리 버퍼에 데이터를 보냄으로써
    쓰기 속도가 향상이 됨.
    Buffered--
 */
public class FileIO_07 {
    public static void main(String[] args) throws Exception{
        long start, end;

        // nio 이미지 열기, 저장
        start = System.nanoTime();
        var openP = Path.of("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\Koala.jpg");
        byte[] image = Files.readAllBytes(openP);
        var copyP = Path.of("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\copyImg1.jpg");
        Files.write(copyP, image);
        end = System.nanoTime();
        System.out.printf("nio : %,d\n" , (end - start));

        // io 이미지 열기, 저장
        start = System.nanoTime();
        var buffer = new BufferedInputStream(new FileInputStream("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\Koala.jpg"));
        var bufferOut = new BufferedOutputStream(new FileOutputStream("C:\\NCS\\intellijWorkSpace\\newGoott\\src\\file\\copyImg2.jpg"));
        while(true){
            int readByte = buffer.read();
            if(readByte == -1) break;
            bufferOut.write(readByte);
        }
        bufferOut.close();
        buffer.close();

        end = System.nanoTime();
        System.out.printf("io + Buffer : %,d\n" , (end - start));

    }
}
