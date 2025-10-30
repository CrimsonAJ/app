package A4;

import P.InterfaceC0314o;
import P.u0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.C1499E;
import k4.C1522w;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;
import l4.y;
import y3.InterfaceC2208d;

/* loaded from: classes.dex */
public final class r implements InterfaceC0314o, InterfaceC1512l, InterfaceC2208d {

    /* renamed from: a, reason: collision with root package name */
    public int f382a;

    /* renamed from: b, reason: collision with root package name */
    public int f383b;

    /* renamed from: c, reason: collision with root package name */
    public Object f384c;

    public /* synthetic */ r(int i9, int i10, Object obj) {
        this.f382a = i9;
        this.f383b = i10;
        this.f384c = obj;
    }

    public int A() {
        int i9 = i();
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalStateException(AbstractC0953k1.j(i9, "Top bit not zero: "));
    }

    public long B() {
        long q9 = q();
        if (q9 >= 0) {
            return q9;
        }
        throw new IllegalStateException(AbstractC0953k1.k(q9, "Top bit not zero: "));
    }

    public int C() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.f382a = i9 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public long D() {
        int i9;
        int i10;
        long j = ((byte[]) this.f384c)[this.f382a];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j) != 0) {
                i11--;
            } else if (i11 < 6) {
                j &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            for (i9 = 1; i9 < i10; i9++) {
                if ((((byte[]) this.f384c)[this.f382a + i9] & 192) == 128) {
                    j = (j << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(AbstractC0953k1.k(j, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f382a += i10;
            return j;
        }
        throw new NumberFormatException(AbstractC0953k1.k(j, "Invalid UTF-8 sequence first byte: "));
    }

    public void E(int i9) {
        byte[] bArr = (byte[]) this.f384c;
        if (bArr.length < i9) {
            bArr = new byte[i9];
        }
        F(i9, bArr);
    }

    public void F(int i9, byte[] bArr) {
        this.f384c = bArr;
        this.f383b = i9;
        this.f382a = 0;
    }

    public void G(int i9) {
        boolean z9;
        if (i9 >= 0 && i9 <= ((byte[]) this.f384c).length) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f383b = i9;
    }

    public void H(int i9) {
        boolean z9;
        if (i9 >= 0 && i9 <= this.f383b) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f382a = i9;
    }

    public void I(int i9) {
        H(this.f382a + i9);
    }

    public synchronized int J() {
        PackageInfo packageInfo;
        if (this.f382a == 0) {
            try {
                packageInfo = M4.c.a((Context) this.f384c).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e8) {
                Log.w("Metadata", "Failed to find package ".concat(e8.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f382a = packageInfo.versionCode;
            }
        }
        return this.f382a;
    }

    public synchronized int K() {
        int i9 = this.f383b;
        if (i9 != 0) {
            return i9;
        }
        Context context = (Context) this.f384c;
        PackageManager packageManager = context.getPackageManager();
        if (M4.c.a(context).f4790a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!K4.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f383b = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f383b = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == K4.b.d()) {
            i10 = 2;
        }
        this.f383b = i10;
        return i10;
    }

    @Override // y3.InterfaceC2208d
    public int a() {
        return this.f382a;
    }

    @Override // y3.InterfaceC2208d
    public int b() {
        return this.f383b;
    }

    @Override // k4.InterfaceC1512l
    public InterfaceC1513m c() {
        return new C1522w(this.f382a, this.f383b, (C1499E) this.f384c);
    }

    @Override // y3.InterfaceC2208d
    public int d() {
        int i9 = this.f382a;
        if (i9 == -1) {
            return ((r) this.f384c).A();
        }
        return i9;
    }

    public int e() {
        return this.f383b - this.f382a;
    }

    public void f(int i9) {
        byte[] bArr = (byte[]) this.f384c;
        if (i9 > bArr.length) {
            this.f384c = Arrays.copyOf(bArr, i9);
        }
    }

    public int g() {
        return ((byte[]) this.f384c)[this.f382a] & 255;
    }

    public void h(byte[] bArr, int i9, int i10) {
        System.arraycopy((byte[]) this.f384c, this.f382a, bArr, i9, i10);
        this.f382a += i10;
    }

    public int i() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = (bArr[i9] & 255) << 24;
        int i12 = i9 + 2;
        this.f382a = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i9 + 3;
        this.f382a = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f382a = i9 + 4;
        return (bArr[i14] & 255) | i15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String j() {
        /*
            r8 = this;
            int r0 = r8.e()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r8.f382a
        La:
            int r1 = r8.f383b
            r2 = 13
            r3 = 10
            if (r0 >= r1) goto L22
            java.lang.Object r1 = r8.f384c
            byte[] r1 = (byte[]) r1
            r1 = r1[r0]
            int r4 = l4.y.f20553a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1f
            goto L22
        L1f:
            int r0 = r0 + 1
            goto La
        L22:
            int r1 = r8.f382a
            int r4 = r0 - r1
            r5 = 3
            if (r4 < r5) goto L46
            java.lang.Object r4 = r8.f384c
            byte[] r4 = (byte[]) r4
            r6 = r4[r1]
            r7 = -17
            if (r6 != r7) goto L46
            int r6 = r1 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L46
            int r6 = r1 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L46
            int r1 = r1 + r5
            r8.f382a = r1
        L46:
            java.lang.Object r1 = r8.f384c
            byte[] r1 = (byte[]) r1
            int r4 = r8.f382a
            int r5 = r0 - r4
            int r6 = l4.y.f20553a
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = O5.e.f5491c
            r6.<init>(r1, r4, r5, r7)
            r8.f382a = r0
            int r1 = r8.f383b
            if (r0 != r1) goto L5e
            goto L77
        L5e:
            java.lang.Object r4 = r8.f384c
            byte[] r4 = (byte[]) r4
            r5 = r4[r0]
            if (r5 != r2) goto L6d
            int r0 = r0 + 1
            r8.f382a = r0
            if (r0 != r1) goto L6d
            goto L77
        L6d:
            int r0 = r8.f382a
            r1 = r4[r0]
            if (r1 != r3) goto L77
            int r0 = r0 + 1
            r8.f382a = r0
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.r.j():java.lang.String");
    }

    public int k() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.f382a = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i9 + 3;
        this.f382a = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f382a = i9 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long l() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        this.f382a = i9 + 1;
        this.f382a = i9 + 2;
        this.f382a = i9 + 3;
        long j = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f382a = i9 + 4;
        long j4 = j | ((bArr[r8] & 255) << 24);
        this.f382a = i9 + 5;
        long j9 = j4 | ((bArr[r7] & 255) << 32);
        this.f382a = i9 + 6;
        long j10 = j9 | ((bArr[r8] & 255) << 40);
        this.f382a = i9 + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 48);
        this.f382a = i9 + 8;
        return ((bArr[r8] & 255) << 56) | j11;
    }

    public short m() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = bArr[i9] & 255;
        this.f382a = i9 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public long n() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        this.f382a = i9 + 1;
        this.f382a = i9 + 2;
        long j = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8);
        this.f382a = i9 + 3;
        long j4 = j | ((bArr[r7] & 255) << 16);
        this.f382a = i9 + 4;
        return ((bArr[r2] & 255) << 24) | j4;
    }

    public int o() {
        int k5 = k();
        if (k5 >= 0) {
            return k5;
        }
        throw new IllegalStateException(AbstractC0953k1.j(k5, "Top bit not zero: "));
    }

    public int p() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = bArr[i9] & 255;
        this.f382a = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public long q() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        this.f382a = i9 + 1;
        this.f382a = i9 + 2;
        long j = ((bArr[i9] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.f382a = i9 + 3;
        long j4 = j | ((bArr[r7] & 255) << 40);
        this.f382a = i9 + 4;
        long j9 = j4 | ((bArr[r2] & 255) << 32);
        this.f382a = i9 + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 24);
        this.f382a = i9 + 6;
        long j11 = j10 | ((bArr[r2] & 255) << 16);
        this.f382a = i9 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f382a = i9 + 8;
        return (bArr[r2] & 255) | j12;
    }

    public String r() {
        if (e() == 0) {
            return null;
        }
        int i9 = this.f382a;
        while (i9 < this.f383b && ((byte[]) this.f384c)[i9] != 0) {
            i9++;
        }
        byte[] bArr = (byte[]) this.f384c;
        int i10 = this.f382a;
        int i11 = y.f20553a;
        String str = new String(bArr, i10, i9 - i10, O5.e.f5491c);
        this.f382a = i9;
        if (i9 < this.f383b) {
            this.f382a = i9 + 1;
        }
        return str;
    }

    public String s(int i9) {
        int i10;
        if (i9 == 0) {
            return "";
        }
        int i11 = this.f382a;
        int i12 = (i11 + i9) - 1;
        if (i12 < this.f383b && ((byte[]) this.f384c)[i12] == 0) {
            i10 = i9 - 1;
        } else {
            i10 = i9;
        }
        byte[] bArr = (byte[]) this.f384c;
        int i13 = y.f20553a;
        String str = new String(bArr, i11, i10, O5.e.f5491c);
        this.f382a += i9;
        return str;
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        int i9 = u0Var.f5645a.f(519).f2915b;
        View view2 = (View) this.f384c;
        int i10 = this.f382a;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i9;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f383b + i9, view2.getPaddingRight(), view2.getPaddingBottom());
        return u0Var;
    }

    public short u() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.f382a = i9 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public String v(int i9, Charset charset) {
        String str = new String((byte[]) this.f384c, this.f382a, i9, charset);
        this.f382a += i9;
        return str;
    }

    public int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public int x() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        this.f382a = i9 + 1;
        return bArr[i9] & 255;
    }

    public long y() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        this.f382a = i9 + 1;
        this.f382a = i9 + 2;
        long j = ((bArr[i9] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.f382a = i9 + 3;
        long j4 = j | ((bArr[r7] & 255) << 8);
        this.f382a = i9 + 4;
        return (bArr[r2] & 255) | j4;
    }

    public int z() {
        byte[] bArr = (byte[]) this.f384c;
        int i9 = this.f382a;
        int i10 = i9 + 1;
        this.f382a = i10;
        int i11 = (bArr[i9] & 255) << 16;
        int i12 = i9 + 2;
        this.f382a = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.f382a = i9 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public r(int i9) {
        this.f384c = new byte[i9];
        this.f383b = i9;
    }

    public r(byte[] bArr) {
        this.f384c = bArr;
        this.f383b = bArr.length;
    }

    public r(int i9, byte[] bArr) {
        this.f384c = bArr;
        this.f383b = i9;
    }

    public r(int i9, boolean z9) {
        switch (i9) {
            case 5:
                this.f384c = y.f20558f;
                return;
            case 6:
                this.f384c = new r[256];
                this.f382a = 0;
                this.f383b = 0;
                return;
            default:
                this.f384c = new C1499E(0);
                this.f382a = 8000;
                this.f383b = 8000;
                return;
        }
    }

    public r(Context context, XmlResourceParser xmlResourceParser) {
        this.f384c = new ArrayList();
        this.f383b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z.p.f25357g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 0) {
                this.f382a = obtainStyledAttributes.getResourceId(index, this.f382a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f383b);
                this.f383b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new z.l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
