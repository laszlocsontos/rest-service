package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lcsontos on 10/10/16.
 */
@RestController
public class ListOfObjectsController {

    ListOfObjects<Integer> listOfIntegers = new ListOfObjects<>(Arrays.asList(new Integer[] { 1, 2, 3 }));

    @RequestMapping("/getList")
    public List<String> greeting() {
        return listOfIntegers.getList().stream().map(Object::toString).collect(Collectors.toList());
    }

}
