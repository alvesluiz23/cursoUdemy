package composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Worker {
    private String name;
    private WorkerLevel workLevel;
    private Double salary;
    private List<HourContract> contracts = new ArrayList<>();

    private Departament departament;

    public Worker(String name, String workLevel, Double salary, String departament) {
        this.name = name;
        this.workLevel = WorkerLevel.valueOf(workLevel);
        this.salary = salary;
        this.departament = new Departament(departament);
    }

    public void addContract(Date date, Double valuePerHour, Integer hours){
        contracts.add(new HourContract(date,valuePerHour, hours));
    }

    public void removeContract(Date date, Double valuePerHour, Integer hours){
        contracts.removeIf(x-> x.getDate().getYear() == date.getYear() && valuePerHour == valuePerHour && x.getHours() == hours);
    }

    public Double income(Date date){
        Double incometotal = 0.0;
        List<HourContract> filterList = contracts.stream().filter(x-> x.getDate().getYear() == date.getYear() && x.getDate().getMonth() == date.getMonth() && x.getDate().getDay() == date.getDay()).collect(Collectors.toList());
        Iterator<HourContract> i = filterList.stream().iterator();

        while(i.hasNext()){
            HourContract next = i.next();
            incometotal += next.getValuePerHour()  * next.getHours();
        }

        return incometotal;

    }

    public void printContract(Date date, Double valuePerHour, Integer hours){
        System.out.print(contracts.stream().filter(x-> x.getDate().getYear() == date.getYear() && valuePerHour == valuePerHour && x.getHours() == hours).collect(Collectors.toList())+ "\n");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workLevel=" + workLevel.toString() +
                ", salary=" + salary +
                ", contracts=" + contracts +
                ", departament=" + departament +
                '}';
    }
}
