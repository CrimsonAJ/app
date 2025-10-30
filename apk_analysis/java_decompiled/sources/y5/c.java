package y5;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.C1076q;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f25011a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new C1076q(3, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(y5.b r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.f25011a
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r3 = Q.d.g(r3)
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.f25011a = r2
            if (r4 == 0) goto L18
            r4 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r4 = 0
        L19:
            Q.d.l(r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.b(y5.b, android.view.View, boolean):void");
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f25011a);
            this.f25011a = null;
        }
    }
}
