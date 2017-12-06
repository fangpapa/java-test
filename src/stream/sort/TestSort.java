package stream.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSort {

    public static void main(String[] args) {
        TestSort sort = new TestSort();
        sort.sortByString();
        sort.sortByDate();
        sort.sortByObject();
    }

    private void sortByString() {
        // ASC
        List<String> list = Stream.of("Tony", "Tom", "Jonn").sorted().collect(Collectors.toList());
        // [Jonn, Tom, Tony]
        System.out.println(list);

        // DESC
        list = list.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).collect(Collectors.toList());
        // [Tony, Tom, Jonn]
        System.out.println(list);
    }

    private void sortByDate() {
        // ASC
        List<Date> list = Stream.of(new Date(1512468283537L), new Date(1512468284537L), new Date(1512468285537L))
                        .sorted(Comparator.nullsLast(Comparator.reverseOrder())).collect(Collectors.toList());
        // [Tue Dec 05 18:04:45 CST 2017, Tue Dec 05 18:04:44 CST 2017, Tue Dec 05 18:04:43 CST 2017]
        System.out.println(list);

        // DESC
        list = list.stream().sorted().collect(Collectors.toList());
        // [Tue Dec 05 18:04:43 CST 2017, Tue Dec 05 18:04:44 CST 2017, Tue Dec 05 18:04:45 CST 2017]
        System.out.println(list);
    }

    private void sortByObject() {
        List<DataObj> list = new ArrayList<>();
        list.add(new DataObj("a", new Date(1512468283537L)));
        list.add(new DataObj("a", new Date(1512468284537L)));
        list.add(new DataObj("a", new Date(1512468285537L)));
        list.add(new DataObj("b", new Date(1512468285537L)));
        // String asce, Date desc
        list = list.stream().sorted(Comparator.comparing(DataObj::getStr).thenComparing(DataObj::getDate,
                        Comparator.nullsLast(Comparator.reverseOrder()))).collect(Collectors.toList());
        list.forEach(System.out::println);
        // DataObj [str=a, date=Tue Dec 05 18:04:45 CST 2017]
        // DataObj [str=a, date=Tue Dec 05 18:04:44 CST 2017]
        // DataObj [str=a, date=Tue Dec 05 18:04:43 CST 2017]
        // DataObj [str=b, date=Tue Dec 05 18:04:45 CST 2017]
    }
}
