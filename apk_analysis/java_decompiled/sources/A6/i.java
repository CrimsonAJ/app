package A6;

import android.net.Uri;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.measurement.J1;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class i implements l, w5.q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f508a;

    /* renamed from: b, reason: collision with root package name */
    public Object f509b;

    public i(Uri uri, boolean z9, boolean z10) {
        this.f509b = uri;
        this.f508a = z9;
    }

    @Override // A6.l
    public void a(k kVar, int i9) {
        boolean z9 = this.f508a;
        StringBuilder sb = (StringBuilder) this.f509b;
        if (z9) {
            this.f508a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i9);
    }

    public void b(int i9) {
        AbstractC1566a.m(!this.f508a);
        ((SparseBooleanArray) this.f509b).append(i9, true);
    }

    public l4.f c() {
        AbstractC1566a.m(!this.f508a);
        this.f508a = true;
        return new l4.f((SparseBooleanArray) this.f509b);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    @Override // w5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P.u0 d(android.view.View r11, P.u0 r12, k4.G r13) {
        /*
            r10 = this;
            P.r0 r0 = r12.f5645a
            r1 = 519(0x207, float:7.27E-43)
            H.c r1 = r0.f(r1)
            r2 = 32
            H.c r0 = r0.f(r2)
            int r2 = r1.f2915b
            java.lang.Object r3 = r10.f509b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            r3.f15888w = r2
            boolean r2 = w5.p.h(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r3.f15880o
            if (r7 == 0) goto L33
            int r4 = r12.a()
            r3.f15887v = r4
            int r7 = r13.f19992d
            int r4 = r4 + r7
        L33:
            boolean r7 = r3.f15881p
            int r8 = r1.f2914a
            if (r7 == 0) goto L41
            if (r2 == 0) goto L3e
            int r5 = r13.f19991c
            goto L40
        L3e:
            int r5 = r13.f19989a
        L40:
            int r5 = r5 + r8
        L41:
            boolean r7 = r3.f15882q
            int r9 = r1.f2916c
            if (r7 == 0) goto L50
            if (r2 == 0) goto L4c
            int r13 = r13.f19989a
            goto L4e
        L4c:
            int r13 = r13.f19991c
        L4e:
            int r6 = r13 + r9
        L50:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r2 = r3.f15884s
            r7 = 1
            if (r2 == 0) goto L63
            int r2 = r13.leftMargin
            if (r2 == r8) goto L63
            r13.leftMargin = r8
            r2 = r7
            goto L64
        L63:
            r2 = 0
        L64:
            boolean r8 = r3.f15885t
            if (r8 == 0) goto L6f
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6f
            r13.rightMargin = r9
            r2 = r7
        L6f:
            boolean r8 = r3.f15886u
            if (r8 == 0) goto L7c
            int r8 = r13.topMargin
            int r1 = r1.f2915b
            if (r8 == r1) goto L7c
            r13.topMargin = r1
            goto L7d
        L7c:
            r7 = r2
        L7d:
            if (r7 == 0) goto L82
            r11.setLayoutParams(r13)
        L82:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r11 = r10.f508a
            if (r11 == 0) goto L91
            int r13 = r0.f2917d
            r3.f15878m = r13
        L91:
            boolean r13 = r3.f15880o
            if (r13 != 0) goto L99
            if (r11 == 0) goto L98
            goto L99
        L98:
            return r12
        L99:
            r3.P()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.i.d(android.view.View, P.u0, k4.G):P.u0");
    }

    public boolean e() {
        return this.f508a;
    }

    public boolean f(CharSequence charSequence, int i9) {
        if (charSequence != null && i9 >= 0 && charSequence.length() - i9 >= 0) {
            if (((N.e) this.f509b) == null) {
                return e();
            }
            char c3 = 2;
            for (int i10 = 0; i10 < i9 && c3 == 2; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                i iVar = N.f.f4810a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c3 = 2;
                                break;
                        }
                    }
                    c3 = 0;
                }
                c3 = 1;
            }
            if (c3 == 0) {
                return true;
            }
            if (c3 == 1) {
                return false;
            }
            return e();
        }
        throw new IllegalArgumentException();
    }

    public J1 g(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = J1.f15231g;
        return new J1(this, str, valueOf, 0);
    }

    public J1 h(String str, String str2) {
        Object obj = J1.f15231g;
        return new J1(this, str, str2, 3);
    }

    public J1 i(String str, boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        Object obj = J1.f15231g;
        return new J1(this, str, valueOf, 1);
    }

    public i() {
        this.f509b = new SparseBooleanArray();
    }

    public i(N.e eVar, boolean z9) {
        this.f509b = eVar;
        this.f508a = z9;
    }
}
