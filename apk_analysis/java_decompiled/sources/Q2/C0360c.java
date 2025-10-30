package Q2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360c extends View implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6211a;

    /* renamed from: b, reason: collision with root package name */
    public List f6212b;

    /* renamed from: c, reason: collision with root package name */
    public int f6213c;

    /* renamed from: d, reason: collision with root package name */
    public float f6214d;

    /* renamed from: e, reason: collision with root package name */
    public C0361d f6215e;

    /* renamed from: f, reason: collision with root package name */
    public float f6216f;

    public C0360c(Context context) {
        super(context, null);
        this.f6211a = new ArrayList();
        this.f6212b = Collections.EMPTY_LIST;
        this.f6213c = 0;
        this.f6214d = 0.0533f;
        this.f6215e = C0361d.f6217g;
        this.f6216f = 0.08f;
    }

    @Override // Q2.P
    public final void a(List list, C0361d c0361d, float f9, int i9, float f10) {
        this.f6212b = list;
        this.f6215e = c0361d;
        this.f6214d = f9;
        this.f6213c = i9;
        this.f6216f = f10;
        while (true) {
            ArrayList arrayList = this.f6211a;
            if (arrayList.size() < list.size()) {
                arrayList.add(new N(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x046d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.C0360c.dispatchDraw(android.graphics.Canvas):void");
    }
}
