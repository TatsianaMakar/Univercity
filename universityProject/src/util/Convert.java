package util;

@FunctionalInterface
public interface Convert <T, M>{

    T converter (M value);
}
