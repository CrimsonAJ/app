package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: p.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1784a0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C1786b0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
