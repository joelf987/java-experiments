package org.jf.tosh.cmd;

import java.math.BigInteger;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.IntStream;

class FactorialCalculator implements Function<Integer, BigInteger> {

    @Override
    public BigInteger apply(Integer num) {
        return IntStream.iterate(num, n -> n > 1, n -> n - 1)
                .parallel()
                .mapToObj(Objects::toString)
                .map(BigInteger::new)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
