package C17ExceptioFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

//text file parsing
public class C1702FileParsing { //중요X
    public static void main(String[] args){
//        src\C17ExceptioFileParsing
        Path filePath = Paths.get("src/C17ExceptioFileParsing/text_file.txt");

//        버퍼기능이 구현돼있고, nio패키지에서는 non-blocking방식 사용
//        기본이 StandardCharsets.UTF_8
//         처음 파일 없을때 CREAT_NEW이후에 APPEND로 실행 가능.
        try {
            if(Files.exists(filePath)){
//                append: 추가 write: 덮어쓰기
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            }else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        파일 읽기: readString, readAllLines(List형태)
        try {
            String mySt = Files.readString(filePath);
            System.out.println(mySt);
//            readAllLines을 가지고 for문을 돌려 출력.
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            List<String> myst1 = Files.readAllLines(filePath);
            for(String a : myst1){
                System.out.println(a + "선수");
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
