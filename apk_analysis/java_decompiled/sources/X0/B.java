package X0;

import B6.u0;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class B extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f8136n = true;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f8137o = true;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f8138p = true;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f8139q = true;

    @Override // B6.u0
    public void J(View view, int i9) {
        if (Build.VERSION.SDK_INT == 28) {
            super.J(view, i9);
        } else if (f8139q) {
            try {
                A.a(view, i9);
            } catch (NoSuchMethodError unused) {
                f8139q = false;
            }
        }
    }

    public void a0(View view, int i9, int i10, int i11, int i12) {
        if (f8138p) {
            try {
                z.a(view, i9, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f8138p = false;
            }
        }
    }

    public void b0(View view, Matrix matrix) {
        if (f8136n) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f8136n = false;
            }
        }
    }

    public void c0(View view, Matrix matrix) {
        if (f8137o) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f8137o = false;
            }
        }
    }
}
