package Z3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import l4.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8968a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8969b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f8970c;

    /* renamed from: d, reason: collision with root package name */
    public int f8971d;

    /* renamed from: e, reason: collision with root package name */
    public int f8972e;

    /* renamed from: f, reason: collision with root package name */
    public int f8973f;

    /* renamed from: g, reason: collision with root package name */
    public int f8974g;

    /* renamed from: h, reason: collision with root package name */
    public int f8975h;

    public b(int i9, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f8968a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8969b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f8970c = sb;
        this.f8974g = i9;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f8971d = 15;
        this.f8972e = 0;
        this.f8973f = 0;
        this.f8975h = i10;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f8970c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f8970c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f8968a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i9 = aVar.f8967c;
                if (i9 == length) {
                    aVar.f8967c = i9 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final Y3.b c(int i9) {
        int i10;
        float f9;
        int i11 = this.f8972e + this.f8973f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f8969b;
            if (i13 >= arrayList.size()) {
                break;
            }
            CharSequence charSequence = (CharSequence) arrayList.get(i13);
            int i14 = y.f20553a;
            if (charSequence.length() > i12) {
                charSequence = charSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\n');
            i13++;
        }
        SpannableString d9 = d();
        int i15 = y.f20553a;
        int length = d9.length();
        CharSequence charSequence2 = d9;
        if (length > i12) {
            charSequence2 = d9.subSequence(0, i12);
        }
        spannableStringBuilder.append(charSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        if (i9 != Integer.MIN_VALUE) {
            i10 = i9;
        } else if (this.f8974g == 2 && (Math.abs(i16) < 3 || length2 < 0)) {
            i10 = 1;
        } else if (this.f8974g == 2 && i16 > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 32 - length2;
            }
            f9 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f9 = 0.5f;
        }
        float f10 = f9;
        int i17 = this.f8971d;
        if (i17 > 7) {
            i17 -= 17;
        } else if (this.f8974g == 1) {
            i17 -= this.f8975h - 1;
        }
        return new Y3.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i17, 1, Integer.MIN_VALUE, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i9;
        boolean z9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8970c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f8968a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f8966b;
            int i16 = aVar.f8965a;
            if (i16 != 8) {
                if (i16 == 7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i16 != 7) {
                    i13 = c.f8976A[i16];
                }
                z10 = z9;
            }
            int i17 = aVar.f8967c;
            i14++;
            if (i14 < arrayList.size()) {
                i9 = ((a) arrayList.get(i14)).f8967c;
            } else {
                i9 = length;
            }
            if (i17 != i9) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f8968a.isEmpty() && this.f8969b.isEmpty() && this.f8970c.length() == 0) {
            return true;
        }
        return false;
    }
}
