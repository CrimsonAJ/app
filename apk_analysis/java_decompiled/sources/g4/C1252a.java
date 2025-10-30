package g4;

import A4.r;
import O5.e;
import Y3.f;
import Y3.g;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import l4.AbstractC1566a;
import l4.y;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final r f17707m = new r(5, false);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17708n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17709o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17710p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17711q;

    /* renamed from: r, reason: collision with root package name */
    public final float f17712r;

    /* renamed from: s, reason: collision with root package name */
    public final int f17713s;

    public C1252a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f17709o = bArr[24];
            this.f17710p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f17711q = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f5491c)) ? "serif" : "sans-serif";
            int i9 = bArr[25] * 20;
            this.f17713s = i9;
            boolean z9 = (bArr[0] & 32) != 0;
            this.f17708n = z9;
            if (z9) {
                this.f17712r = y.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i9, 0.0f, 0.95f);
                return;
            } else {
                this.f17712r = 0.85f;
                return;
            }
        }
        this.f17709o = 0;
        this.f17710p = -1;
        this.f17711q = "sans-serif";
        this.f17708n = false;
        this.f17712r = 0.85f;
        this.f17713s = -1;
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i9 >>> 8) | ((i9 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        boolean z9;
        boolean z10;
        if (i9 != i10) {
            int i14 = i13 | 33;
            boolean z11 = true;
            if ((i9 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i9 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            if ((i9 & 4) == 0) {
                z11 = false;
            }
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (!z11 && !z9 && !z10) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    @Override // Y3.f
    public final g f(int i9, boolean z9, byte[] bArr) {
        String v8;
        int i10;
        int i11;
        r rVar = this.f17707m;
        rVar.F(i9, bArr);
        int i12 = 2;
        if (rVar.e() >= 2) {
            int C8 = rVar.C();
            int i13 = 1;
            int i14 = 8;
            if (C8 == 0) {
                v8 = "";
            } else {
                if (rVar.e() >= 2) {
                    byte[] bArr2 = (byte[]) rVar.f384c;
                    int i15 = rVar.f382a;
                    char c3 = (char) ((bArr2[i15 + 1] & 255) | ((bArr2[i15] & 255) << 8));
                    if (c3 == 65279 || c3 == 65534) {
                        v8 = rVar.v(C8, e.f5493e);
                    }
                }
                v8 = rVar.v(C8, e.f5491c);
            }
            if (v8.isEmpty()) {
                return C1253b.f17714b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v8);
            j(spannableStringBuilder, this.f17709o, 0, 0, spannableStringBuilder.length(), 16711680);
            i(spannableStringBuilder, this.f17710p, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i16 = 0;
            String str = this.f17711q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float f9 = this.f17712r;
            while (rVar.e() >= i14) {
                int i17 = rVar.f382a;
                int i18 = rVar.i();
                int i19 = rVar.i();
                if (i19 == 1937013100) {
                    if (rVar.e() >= i12) {
                        int C9 = rVar.C();
                        int i20 = i16;
                        while (i20 < C9) {
                            if (rVar.e() >= 12) {
                                int C10 = rVar.C();
                                int C11 = rVar.C();
                                rVar.I(i12);
                                int i21 = C9;
                                int x5 = rVar.x();
                                rVar.I(i13);
                                int i22 = rVar.i();
                                if (C11 > spannableStringBuilder.length()) {
                                    StringBuilder p9 = A0.a.p("Truncating styl end (", C11, ") to cueText.length() (");
                                    p9.append(spannableStringBuilder.length());
                                    p9.append(").");
                                    AbstractC1566a.P("Tx3gDecoder", p9.toString());
                                    C11 = spannableStringBuilder.length();
                                }
                                if (C10 >= C11) {
                                    AbstractC1566a.P("Tx3gDecoder", "Ignoring styl with start (" + C10 + ") >= end (" + C11 + ").");
                                    i10 = i20;
                                    i11 = i21;
                                } else {
                                    i10 = i20;
                                    i11 = i21;
                                    j(spannableStringBuilder, x5, this.f17709o, C10, C11, 0);
                                    i(spannableStringBuilder, i22, this.f17710p, C10, C11, 0);
                                }
                                i20 = i10 + 1;
                                C9 = i11;
                                i12 = 2;
                                i13 = 1;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (i19 == 1952608120 && this.f17708n) {
                    i12 = 2;
                    if (rVar.e() >= 2) {
                        f9 = y.h(rVar.C() / this.f17713s, 0.0f, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else {
                    i12 = 2;
                }
                rVar.H(i17 + i18);
                i13 = 1;
                i14 = 8;
                i16 = 0;
            }
            return new C1253b(new Y3.b(spannableStringBuilder, null, null, null, f9, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
