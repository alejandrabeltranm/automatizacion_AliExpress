package aliExpress.utils;

import java.util.concurrent.Callable;

public class Tiempo {
    public static Callable<Boolean> condicionExitosa() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return true;
            }
        };
    }
}
