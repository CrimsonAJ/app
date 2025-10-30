package v7;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import i0.AbstractComponentCallbacksC1366v;

/* renamed from: v7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2120h extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f23913a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f23914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120h(Context context, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        super(context);
        context.getClass();
        N0.b bVar = new N0.b(5, this);
        this.f23913a = null;
        abstractComponentCallbacksC1366v.getClass();
        abstractComponentCallbacksC1366v.f18404m0.V(bVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f23914b == null) {
            if (this.f23913a == null) {
                this.f23913a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f23914b = this.f23913a.cloneInContext(this);
        }
        return this.f23914b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2120h(android.view.LayoutInflater r3, i0.AbstractComponentCallbacksC1366v r4) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r2.<init>(r0)
            N0.b r0 = new N0.b
            r1 = 5
            r0.<init>(r1, r2)
            r2.f23913a = r3
            r4.getClass()
            androidx.lifecycle.y r3 = r4.f18404m0
            r3.V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.C2120h.<init>(android.view.LayoutInflater, i0.v):void");
    }
}
