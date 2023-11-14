import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class StreamAPIDemo {
    public static void main(String[] args) {
        //List<Specialist> specialists = OldApproachUtil.getSpecialist();
        List<Specialist> specialists = StreamAPIUtil.getSpecialist();

        // Filter
        //List<Specialist> engineer = OldApproachUtil.filterBySpecialty(specialists, Specialty.ENGINEER); //1
        //List<Specialist> engineer = StreamAPIUtil.filterBySpecialty(specialists, Specialty.ENGINEER); //2
        //StreamAPIUtil.printSpecialists(engineer); //1, 2

        // Sorting
        //List<Specialist> sortedSpecialistsAsc = StreamAPIUtil.sortSpecialistsByNameAsc(specialists); //1
        //List<Specialist> sortedSpecialistsDesc = StreamAPIUtil.sortSpecialistsByNameDesc(specialists); //2
        //StreamAPIUtil.printSpecialists(sortedSpecialistsAsc); //1
        //StreamAPIUtil.printSpecialists(sortedSpecialistsDesc); //2

        // Max salary
        //Specialist withMaxSalary = StreamAPIUtil.findWithMaxSalary(specialists);
        //System.out.println(withMaxSalary);
        // Min salary
        //Specialist withMinSalary = StreamAPIUtil.findWithMinSalary(specialists);
        //System.out.println(withMinSalary);

        // Grouping
        //Map<Specialty, List<Specialist>> groupedBySpecialty = StreamAPIUtil.groupBySpecialty(specialists);
        //System.out.println(groupedBySpecialty);

        // All Engineers
        //boolean allEngineers = OldApproachUtil.matchAllEngineers(specialists);
        //boolean allEngineers = StreamAPIUtil.matchAllEngineers(specialists);
        //System.out.println(allEngineers);

        // Any Engineers
        //boolean anyEngineer = OldApproachUtil.matchAnyEngineer(specialists);
        //boolean anyEngineer = StreamAPIUtil.matchAnyEngineer(specialists);
        //System.out.println(anyEngineer);

        // All salary more then
        //boolean allSalaryMoreThen1000 = OldApproachUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(1000));
        //boolean allSalaryMoreThen1000 = StreamAPIUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(1000));
        //System.out.println(allSalaryMoreThen1000);

        // No one with salary more then
        //boolean noOneWithSalaryMoreThen10000 = OldApproachUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
        boolean noOneWithSalaryMoreThen10000 = StreamAPIUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
        System.out.println(noOneWithSalaryMoreThen10000);
    }
}