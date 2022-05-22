import employees.*;
import employees.IEmployee;

import java.lang.reflect.Constructor;
import java.util.AbstractMap;
import java.util.Map;
import java.util.regex.Matcher;

public class EmployeeFactory {
    private final Map<String, String> employeeMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<String, String>("CEO", CEO.class.getCanonicalName()),
            new AbstractMap.SimpleEntry<String, String>("Craftsman", Craftsman.class.getCanonicalName()),
            new AbstractMap.SimpleEntry<String, String>("Developer", Developer.class.getCanonicalName()),
            new AbstractMap.SimpleEntry<String, String>("Engineer", Engineer.class.getCanonicalName()),
            new AbstractMap.SimpleEntry<String, String>("Laborer", Laborer.class.getCanonicalName()),
            new AbstractMap.SimpleEntry<String, String>("Manager", Manager.class.getCanonicalName())
    );


    public IEmployee create(Matcher matcher) throws Exception {
        String job = matcher.group("job");

        if (!employeeMap.containsKey(job)) {
            throw new IllegalArgumentException();
        }

        String className = employeeMap.get(job);
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class);
        Object[] args = new Object[] {
                matcher.group("firstname"),
                matcher.group("surname"),
                matcher.group("dob"),
                matcher.group("street"),
                matcher.group("zipcode"),
                matcher.group("city"),
                matcher.group("salary")

        };



        return (IEmployee) constructor.newInstance(args);
    }
}
