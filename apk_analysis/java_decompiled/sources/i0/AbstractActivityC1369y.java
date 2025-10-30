package i0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.EnumC0555p;
import d.AbstractActivityC1071l;
import d.C1063d;
import d.C1064e;

/* renamed from: i0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1369y extends AbstractActivityC1071l {

    /* renamed from: v, reason: collision with root package name */
    public boolean f18433v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18434w;

    /* renamed from: t, reason: collision with root package name */
    public final com.google.firebase.messaging.u f18431t = new com.google.firebase.messaging.u(new C1368x(this));

    /* renamed from: u, reason: collision with root package name */
    public final C0563y f18432u = new C0563y(this);

    /* renamed from: x, reason: collision with root package name */
    public boolean f18435x = true;

    public AbstractActivityC1369y() {
        ((N0.f) this.f16589e.f15188c).f("android:support:lifecycle", new C1063d(this, 1));
        H(new C1367w(this, 0));
        this.f16598o.add(new C1367w(this, 1));
        J(new C1064e(this, 1));
    }

    public static boolean Q(AbstractC1336M abstractC1336M) {
        AbstractActivityC1369y abstractActivityC1369y;
        EnumC0555p enumC0555p = EnumC0555p.f9895c;
        boolean z9 = false;
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v : abstractC1336M.f18198c.q()) {
            if (abstractComponentCallbacksC1366v != null) {
                C1368x c1368x = abstractComponentCallbacksC1366v.f18416t;
                if (c1368x == null) {
                    abstractActivityC1369y = null;
                } else {
                    abstractActivityC1369y = c1368x.f18430r;
                }
                if (abstractActivityC1369y != null) {
                    z9 |= Q(abstractComponentCallbacksC1366v.l());
                }
                W w7 = abstractComponentCallbacksC1366v.f18406n0;
                EnumC0555p enumC0555p2 = EnumC0555p.f9896d;
                if (w7 != null) {
                    w7.b();
                    if (w7.f18267e.f9908d.compareTo(enumC0555p2) >= 0) {
                        abstractComponentCallbacksC1366v.f18406n0.f18267e.q0(enumC0555p);
                        z9 = true;
                    }
                }
                if (abstractComponentCallbacksC1366v.f18404m0.f9908d.compareTo(enumC0555p2) >= 0) {
                    abstractComponentCallbacksC1366v.f18404m0.q0(enumC0555p);
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final C1337N P() {
        return ((C1368x) this.f18431t.f16512a).f18429q;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L5d
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f18433v
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f18434w
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f18435x
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto Lb4
            k4.E r1 = k4.C1499E.i(r2)
            r1.d(r0, r5)
        Lb4:
            com.google.firebase.messaging.u r0 = r2.f18431t
            java.lang.Object r0 = r0.f16512a
            i0.x r0 = (i0.C1368x) r0
            i0.N r0 = r0.f18429q
            r0.u(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.AbstractActivityC1369y.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        this.f18431t.q();
        super.onActivityResult(i9, i10, intent);
    }

    @Override // d.AbstractActivityC1071l, D.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18432u.o0(EnumC0554o.ON_CREATE);
        C1337N c1337n = ((C1368x) this.f18431t.f16512a).f18429q;
        c1337n.f18188F = false;
        c1337n.f18189G = false;
        c1337n.f18194M.f18235i = false;
        c1337n.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C1368x) this.f18431t.f16512a).f18429q.f18201f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C1368x) this.f18431t.f16512a).f18429q.k();
        this.f18432u.o0(EnumC0554o.ON_DESTROY);
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        if (i9 == 6) {
            return ((C1368x) this.f18431t.f16512a).f18429q.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f18434w = false;
        ((C1368x) this.f18431t.f16512a).f18429q.t(5);
        this.f18432u.o0(EnumC0554o.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f18432u.o0(EnumC0554o.ON_RESUME);
        C1337N c1337n = ((C1368x) this.f18431t.f16512a).f18429q;
        c1337n.f18188F = false;
        c1337n.f18189G = false;
        c1337n.f18194M.f18235i = false;
        c1337n.t(7);
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public final void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        this.f18431t.q();
        super.onRequestPermissionsResult(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        com.google.firebase.messaging.u uVar = this.f18431t;
        uVar.q();
        super.onResume();
        this.f18434w = true;
        ((C1368x) uVar.f16512a).f18429q.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        com.google.firebase.messaging.u uVar = this.f18431t;
        uVar.q();
        super.onStart();
        this.f18435x = false;
        boolean z9 = this.f18433v;
        C1368x c1368x = (C1368x) uVar.f16512a;
        if (!z9) {
            this.f18433v = true;
            C1337N c1337n = c1368x.f18429q;
            c1337n.f18188F = false;
            c1337n.f18189G = false;
            c1337n.f18194M.f18235i = false;
            c1337n.t(4);
        }
        c1368x.f18429q.x(true);
        this.f18432u.o0(EnumC0554o.ON_START);
        C1337N c1337n2 = c1368x.f18429q;
        c1337n2.f18188F = false;
        c1337n2.f18189G = false;
        c1337n2.f18194M.f18235i = false;
        c1337n2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f18431t.q();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f18435x = true;
        do {
        } while (Q(P()));
        C1337N c1337n = ((C1368x) this.f18431t.f16512a).f18429q;
        c1337n.f18189G = true;
        c1337n.f18194M.f18235i = true;
        c1337n.t(4);
        this.f18432u.o0(EnumC0554o.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C1368x) this.f18431t.f16512a).f18429q.f18201f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
