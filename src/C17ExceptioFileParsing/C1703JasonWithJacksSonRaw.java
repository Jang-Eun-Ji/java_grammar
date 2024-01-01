package C17ExceptioFileParsing;
import java.io.File;
import java.nio.file.Files;
import java.util.*;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

public class C1703JasonWithJacksSonRaw {
    public static void main(String[] args) {
//        ObjectMapper mapper = new ObjectMapper();
//        try {
////            readTree를 통해서 json을 계층적으로 트리구조형태로 전환
//            File myPath = Paths.get("src/C17ExceptioFileParsing/test-data1.json").toFile();
//            JsonNode data1 = mapper.readTree(myPath);
//            Map<String, String> studentMap = new HashMap<>();
//            studentMap.put("id", data1.get("id").asText());
//            studentMap.put("name", data1.get("name").asText());
//            studentMap.put("classNumber", data1.get("classNumber").asText());
//            studentMap.put("city", data1.get("city").asText());
//
////            key: value중에 value의 타입이 예상되지 않을때는 Object타입으로도 받을 수 있다.
//            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class);
//            System.out.println(studentMap2);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
