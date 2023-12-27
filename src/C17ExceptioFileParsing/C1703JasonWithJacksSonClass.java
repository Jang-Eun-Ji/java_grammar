package C17ExceptioFileParsing;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1703JasonWithJacksSonClass {
    private ObjectCodec mapper;

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File myPath = Paths.get("src/C17ExceptioFileParsing/test-data1.json").toFile();
        try {
            JsonNode data1 = mapper.readTree(myPath);
            Map<String, String> studentMap = new HashMap<>();
            studentMap.put("id", data1.get("id").asText());
            studentMap.put("name", data1.get("name").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());

//            key: value중에 value의 타입이 예상되지 않을때는 Object타입으로도 받을 수 있다.
            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class);
            System.out.println(studentMap2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Student{
    int id;
    String name;
    String classNumber;

}