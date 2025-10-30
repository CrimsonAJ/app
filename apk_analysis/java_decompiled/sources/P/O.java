package P;

import android.view.ContentInfo;
import android.view.View;
import b7.C0701c;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0305f b(View view, C0305f c0305f) {
        ContentInfo m9 = c0305f.f5594a.m();
        Objects.requireNonNull(m9);
        ContentInfo performReceiveContent = view.performReceiveContent(m9);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == m9) {
            return c0305f;
        }
        return new C0305f(new C0701c(performReceiveContent));
    }
}
