package B8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface k {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
