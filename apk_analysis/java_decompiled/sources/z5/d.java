package z5;

import android.content.Context;
import android.view.SubMenu;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import o.l;
import o.n;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: A, reason: collision with root package name */
    public final int f25455A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f25456z;

    public d(Context context, Class cls, int i9) {
        super(context);
        this.f25456z = cls;
        this.f25455A = i9;
    }

    @Override // o.l
    public final n a(int i9, int i10, int i11, CharSequence charSequence) {
        int size = this.f21380f.size() + 1;
        int i12 = this.f25455A;
        if (size <= i12) {
            w();
            n a5 = super.a(i9, i10, i11, charSequence);
            a5.f(true);
            v();
            return a5;
        }
        String simpleName = this.f25456z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i12);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC0953k1.q(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // o.l, android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f25456z.getSimpleName().concat(" does not support submenus"));
    }
}
