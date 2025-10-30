package A3;

import F0.K;
import android.view.View;
import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f295b;

    /* renamed from: c, reason: collision with root package name */
    public int f296c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f297d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298e;

    /* renamed from: f, reason: collision with root package name */
    public Object f299f;

    public v(int i9) {
        this.f295b = i9;
        byte[] bArr = new byte[131];
        this.f299f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i9, int i10) {
        if (!this.f297d) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = (byte[]) this.f299f;
        int length = bArr2.length;
        int i12 = this.f296c;
        if (length < i12 + i11) {
            this.f299f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i9, (byte[]) this.f299f, this.f296c, i11);
        this.f296c += i11;
    }

    public void b() {
        int m9;
        if (this.f297d) {
            m9 = ((K) this.f299f).i();
        } else {
            m9 = ((K) this.f299f).m();
        }
        this.f296c = m9;
    }

    public void c(View view, int i9) {
        if (this.f297d) {
            this.f296c = ((K) this.f299f).o() + ((K) this.f299f).d(view);
        } else {
            this.f296c = ((K) this.f299f).g(view);
        }
        this.f295b = i9;
    }

    public void d(View view, int i9) {
        int o9 = ((K) this.f299f).o();
        if (o9 >= 0) {
            c(view, i9);
            return;
        }
        this.f295b = i9;
        if (this.f297d) {
            int i10 = (((K) this.f299f).i() - o9) - ((K) this.f299f).d(view);
            this.f296c = ((K) this.f299f).i() - i10;
            if (i10 > 0) {
                int e8 = this.f296c - ((K) this.f299f).e(view);
                int m9 = ((K) this.f299f).m();
                int min = e8 - (Math.min(((K) this.f299f).g(view) - m9, 0) + m9);
                if (min < 0) {
                    this.f296c = Math.min(i10, -min) + this.f296c;
                    return;
                }
                return;
            }
            return;
        }
        int g9 = ((K) this.f299f).g(view);
        int m10 = g9 - ((K) this.f299f).m();
        this.f296c = g9;
        if (m10 > 0) {
            int i11 = (((K) this.f299f).i() - Math.min(0, (((K) this.f299f).i() - o9) - ((K) this.f299f).d(view))) - (((K) this.f299f).e(view) + g9);
            if (i11 < 0) {
                this.f296c -= Math.min(m10, -i11);
            }
        }
    }

    public boolean e(int i9) {
        if (!this.f297d) {
            return false;
        }
        this.f296c -= i9;
        this.f297d = false;
        this.f298e = true;
        return true;
    }

    public final void f() {
        switch (this.f294a) {
            case 0:
                this.f297d = false;
                this.f298e = false;
                return;
            default:
                this.f295b = -1;
                this.f296c = Integer.MIN_VALUE;
                this.f297d = false;
                this.f298e = false;
                return;
        }
    }

    public void g(int i9) {
        boolean z9 = true;
        AbstractC1566a.m(!this.f297d);
        if (i9 != this.f295b) {
            z9 = false;
        }
        this.f297d = z9;
        if (z9) {
            this.f296c = 3;
            this.f298e = false;
        }
    }

    public String toString() {
        switch (this.f294a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f295b + ", mCoordinate=" + this.f296c + ", mLayoutFromEnd=" + this.f297d + ", mValid=" + this.f298e + '}';
            default:
                return super.toString();
        }
    }

    public v() {
        f();
    }
}
