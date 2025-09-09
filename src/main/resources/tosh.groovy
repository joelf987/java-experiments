import org.jf.tosh.cmd.StringReverser;
import org.jf.tosh.cmd.FactorialCalculator;

rev = str -> {
    new StringReverser().apply(str);
}

fact = num -> {
    new FactorialCalculator().apply(num)
}