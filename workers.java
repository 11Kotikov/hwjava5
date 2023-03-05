import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class workers {
    public static void main(String[] args) {

        List<String> employeesList = new ArrayList<>();
        employeesList.add("Isaak Newton");
        employeesList.add("Vladimir Lenin");
        employeesList.add("Isaak Asimov");
        employeesList.add("Sergei Korolev");
        employeesList.add("Albert Einstein");
        employeesList.add("Marie Curie");
        employeesList.add("Charles Darwin");
        employeesList.add("Marie Poppins");
        employeesList.add("Charles Xavier");
        employeesList.add("Nikola Tesla");
        employeesList.add("Charles Manson");
        employeesList.add("Stephen Hawking");
        employeesList.add("Neil deGrasse Tyson");
        employeesList.add("Yury Gagarin");
        employeesList.add("Neil Armstrong");


        Map<String, Integer> employeesDict = new HashMap<>();

        for (String employee : employeesList) {
            String name = employee.split(" ")[0];
            employeesDict.put(name, employeesDict.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedValues = new ArrayList<>(employeesDict.entrySet()); //это я нагуглил весь нижний код, сложно было! О_О
        sortedValues.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedValues) { 
            String name = entry.getKey();
            Integer counter = entry.getValue();
            System.out.println("name " + name + " tracked " + counter + " time/s");
        }
    }
}
