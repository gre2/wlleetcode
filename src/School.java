
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class School {
    String schoolCode;
    String name;

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School(String schoolCode, String name) {
        this.schoolCode = schoolCode;
        this.name = name;
    }

    public static void main(String[] args) {
        List<School> list=new ArrayList<>();
        list.add(new School("a","aaaaa"));
        list.add(new School("b","bbbbb"));
        list.add(new School("c","ccccc"));
        Map<String, String> collect = list.stream().collect(Collectors.toMap(School::getSchoolCode, School::getName));
        List<SchoolStu> ss=new ArrayList<>();
        ss.add(new SchoolStu("a",1000));
        ss.add(new SchoolStu("a",1000));
        ss.add(new SchoolStu("c",3000));
        Map<String, Integer> collect2 = ss.stream().collect(Collectors.toMap(SchoolStu::getSchoolCode, SchoolStu::getCount, (oldVal, currVal) -> oldVal + currVal));
        for (Map.Entry<String, Integer> entry : collect2.entrySet()) {
                if(entry.getValue()>=1000){
                    System.out.println(collect.get(entry.getKey()));
                }
        }

    }
}
class SchoolStu{
    Integer count;
    String schoolCode;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public SchoolStu(String schoolCode,Integer count) {
        this.count = count;
        this.schoolCode = schoolCode;
    }
}
