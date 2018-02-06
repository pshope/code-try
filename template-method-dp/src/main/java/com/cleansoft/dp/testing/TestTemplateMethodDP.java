package com.cleansoft.dp.testing;

import com.cleansoft.dp.Mother;
import com.cleansoft.dp.Person;
import com.cleansoft.dp.Worker;

public class TestTemplateMethodDP {
    public static void main(String[] args) {
        Person worker = new Worker();
        Person mother = new Mother();

        worker.startDay();
        mother.startDay();


    }
}
