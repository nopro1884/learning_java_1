import employees.CEO;
import employees.Employee;
import employees.IEmployee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamsAndLambdas {


    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("appsettings.cnf");
        Properties properties = new Properties();
        properties.load(reader);

        System.out.println(properties.get("test"));
        System.out.println(System.getProperty("user.dir"));

        RandomCsvGenerator randomCsvGenerator = new RandomCsvGenerator();
        String randomString = randomCsvGenerator.getCsvDummyString(100);

        String csvRegex = "(?<firstname>[\\w-]+),(?<surname>[\\w-]+),(?<dob>\\d{1,4}-\\d{1,2}-\\d{1,2})," +
                "(?<street>\\w+\\s+\\d+),(?<city>\\w+\\s*\\w*),(?<zipcode>\\d+),(?<job>\\w+),(?<salary>\\d+)\\n";
        Pattern csvPattern = Pattern.compile(csvRegex);
        Matcher csvMatcher = csvPattern.matcher(randomString);

        String[] lines = randomString.split("\n");

//        for (String line: lines) {
//            line = line + "\n";
//            Matcher matcher = csvPattern.matcher(line);
//            if (!matcher.find()) {
//                System.out.println(line);
//            }
//        }
        EmployeeFactory factory = new EmployeeFactory();

        List<IEmployee> employeeList = new ArrayList<>();

        while(csvMatcher.find()) {
            employeeList.add(factory.create(csvMatcher));
        }

        System.out.println(employeeList.stream().filter(s -> s instanceof CEO).count());


    }


}
