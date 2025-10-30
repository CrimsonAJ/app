package G;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2615a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2617c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f2615a = colorStateList;
        this.f2616b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f2617c = hashCode;
    }
}
