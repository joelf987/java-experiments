import org.jf.tosh.cmd.StringReverser;
import org.jf.tosh.cmd.FactorialCalculator;
import org.jf.tosh.cmd.CurrentDirectoryFunction;


rev = str -> {
    new StringReverser().apply(str);
}

fact = num -> {
    new FactorialCalculator().apply(num)
}

sqrt = num -> {
    Math.sqrt(num);
}

pwd = workingDir

ls = new CurrentDirectoryFunction().get()
