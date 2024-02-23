package file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.sql.Date;
/*
    보조 스트림 관련 클래스
    - 보조 스트림 : 다른 스트림과 연결되어 여러 가지 편리한 기능을 제동해 주는 스트힘을 말함
    - 보조 스트림은 중간에 메모리 버퍼와 작업을 함으로써 실행의 성능을 향상시킬 수 있음
    예를 든다면 프로그램은 직접 하드 디스크에 데이터를 보내지 않고 메모리 버퍼에 데이터를 보냄으로써
    쓰기 속도가 향상이 됨.
    Buffered--
 */
public class FileIO_11 {
    public static void main(String[] args) throws Exception{
        File temp = new File("C:\\Windows\\Temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        File[] fList = temp.listFiles();
        System.out.println("이름\t형태\t크기\t날짜\t\t시간");
        for(File f : Objects.requireNonNull(fList)){
            if(f.isDirectory()){
                System.out.print(f.getName()+"\t" + f.length());
            }else{
                System.out.print("<DIR>\t" + f.length());
            }
            System.out.println(sdf.format( new Date(f.lastModified() )) );
        }

    }
}
