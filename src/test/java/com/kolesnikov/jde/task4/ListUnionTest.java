package com.kolesnikov.jde.task4;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.hamcrest.collection.IsIterableContainingInOrder;
import static org.junit.Assert.assertThat;

public class ListUnionTest {

    @Test
    public void doUnion() throws Exception {
        List<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(3);
        arrayList1.add(5);
        List<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(2);
        arrayList2.add(6);
        arrayList2.add(8);
        assertThat(new ListUnion().doUnion(arrayList1,arrayList2), IsIterableContainingInOrder.contains(1,2,3,5,6,8));
    }
}