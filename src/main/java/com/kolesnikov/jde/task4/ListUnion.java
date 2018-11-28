package com.kolesnikov.jde.task4;

import java.util.Collections;
import java.util.List;

public class ListUnion {

    public List<Integer> doUnion(List arrayList1, List arrayList2) {
        Collections.sort(arrayList1);
        Collections.sort(arrayList2);
        // не до конца понял что значит "принимает два отсортированных", поэтому сделал сортировку так
        // и вообще не понял, оно так и должно быть или всё нужно вручную писать?
        arrayList1.addAll(arrayList2);
        Collections.sort(arrayList1);
        return arrayList1;
    }
}
