package org.example.Benchmark;

import org.openjdk.jmh.annotations.*;

public class BenchmarkRunnerTest {

//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    @Fork(value = 1)
//    @Warmup(iterations = 2)
//    @Measurement(iterations = 1)
    public void init2() {
            fib(43);
    }

    static int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    double fibbonaci(int n) {
        double prev = 0d, next = 1d, result = 0d;
        for(int i = 0; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }


}