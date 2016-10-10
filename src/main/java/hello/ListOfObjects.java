package hello;

import java.util.List;

/**
 * Created by lcsontos on 10/10/16.
 */
public class ListOfObjects<T> {

    private final List<T> list;

    public ListOfObjects(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

}
