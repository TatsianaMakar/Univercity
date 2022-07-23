package util;

import java.io.IOException;

@FunctionalInterface
public interface Convert <T, M>{

    T converter (M value) throws IOException;
}
