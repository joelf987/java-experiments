package org.jf.tosh.cmd;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CurrentDirectoryFunction implements Supplier<String> {
    @Override
    public String get() {
        try {
            return   Files.list(Path.of(new File(System.getProperty("user.dir")).toURI()))
                    .map(Path::toString)
                    .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
