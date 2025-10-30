package o1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: o1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1672g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21474a = e1.q.j("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z9) {
        int i9;
        String str;
        String str2 = "disabled";
        String str3 = f21474a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z9) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i9, 1);
            e1.q d9 = e1.q.d();
            String name = cls.getName();
            if (!z9) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            d9.a(str3, name + " " + str, new Throwable[0]);
        } catch (Exception e8) {
            e1.q d10 = e1.q.d();
            String name2 = cls.getName();
            if (z9) {
                str2 = "enabled";
            }
            d10.a(str3, AbstractC0953k1.o(name2, " could not be ", str2), e8);
        }
    }
}
