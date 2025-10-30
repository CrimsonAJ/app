package f0;

import android.text.Editable;
import d0.t;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f17242a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1149a f17243b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f17244c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f17244c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
