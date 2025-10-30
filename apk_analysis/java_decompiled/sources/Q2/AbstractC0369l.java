package Q2;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: Q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6282a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f6282a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
