package u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031b extends C {

    /* renamed from: k, reason: collision with root package name */
    public Intent f23468k;

    /* renamed from: l, reason: collision with root package name */
    public String f23469l;

    public static String f(Context context, String str) {
        if (str != null) {
            String packageName = context.getPackageName();
            kotlin.jvm.internal.h.d(packageName, "context.packageName");
            return W7.l.J(str, "${applicationId}", packageName);
        }
        return null;
    }

    @Override // u0.C
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, X.f23463a);
        kotlin.jvm.internal.h.d(obtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
        String f9 = f(context, obtainAttributes.getString(4));
        if (this.f23468k == null) {
            this.f23468k = new Intent();
        }
        Intent intent = this.f23468k;
        kotlin.jvm.internal.h.b(intent);
        intent.setPackage(f9);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f23468k == null) {
                this.f23468k = new Intent();
            }
            Intent intent2 = this.f23468k;
            kotlin.jvm.internal.h.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.f23468k == null) {
            this.f23468k = new Intent();
        }
        Intent intent3 = this.f23468k;
        kotlin.jvm.internal.h.b(intent3);
        intent3.setAction(string2);
        String f10 = f(context, obtainAttributes.getString(2));
        if (f10 != null) {
            Uri parse = Uri.parse(f10);
            if (this.f23468k == null) {
                this.f23468k = new Intent();
            }
            Intent intent4 = this.f23468k;
            kotlin.jvm.internal.h.b(intent4);
            intent4.setData(parse);
        }
        this.f23469l = f(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // u0.C
    public final boolean equals(Object obj) {
        boolean z9;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2031b) && super.equals(obj)) {
            Intent intent = this.f23468k;
            if (intent != null) {
                z9 = intent.filterEquals(((C2031b) obj).f23468k);
            } else if (((C2031b) obj).f23468k == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && kotlin.jvm.internal.h.a(this.f23469l, ((C2031b) obj).f23469l)) {
                return true;
            }
        }
        return false;
    }

    @Override // u0.C
    public final int hashCode() {
        int i9;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f23468k;
        int i10 = 0;
        if (intent != null) {
            i9 = intent.filterHashCode();
        } else {
            i9 = 0;
        }
        int i11 = (hashCode + i9) * 31;
        String str = this.f23469l;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    @Override // u0.C
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.f23468k;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (componentName != null) {
            sb.append(" class=");
            sb.append(componentName.getClassName());
        } else {
            Intent intent2 = this.f23468k;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
