package d4;

import A4.r;
import F0.A0;
import Y3.f;
import Y3.g;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;
import l4.y;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122a extends f {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f16838r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16839m;

    /* renamed from: n, reason: collision with root package name */
    public final A0 f16840n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f16841o;

    /* renamed from: p, reason: collision with root package name */
    public float f16842p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f16843q = -3.4028235E38f;

    public C1122a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f16839m = true;
            String m9 = y.m((byte[]) list.get(0));
            AbstractC1566a.h(m9.startsWith("Format:"));
            A0 b9 = A0.b(m9);
            b9.getClass();
            this.f16840n = b9;
            j(new r((byte[]) list.get(1)));
            return;
        }
        this.f16839m = false;
        this.f16840n = null;
    }

    public static int i(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i9;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i9 = size + 1;
                    break;
                }
                size--;
            } else {
                i9 = 0;
                break;
            }
        }
        arrayList.add(i9, Long.valueOf(j));
        if (i9 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i9 - 1));
        }
        arrayList2.add(i9, arrayList3);
        return i9;
    }

    public static long k(String str) {
        Matcher matcher = f16838r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i9 = y.f20553a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0204. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x0227. Please report as an issue. */
    @Override // Y3.f
    public final g f(int i9, boolean z9, byte[] bArr) {
        A0 a02;
        r rVar;
        A0 a03;
        C1125d c1125d;
        float f9;
        int i10;
        float f10;
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        int i13;
        int i14;
        float f11;
        float f12;
        float f13;
        float f14;
        int i15;
        float f15;
        int i16;
        int i17;
        Integer num;
        int i18;
        int i19;
        C1122a c1122a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r rVar2 = new r(i9, bArr);
        boolean z10 = c1122a.f16839m;
        if (!z10) {
            c1122a.j(rVar2);
        }
        if (z10) {
            a02 = c1122a.f16840n;
        } else {
            a02 = null;
        }
        while (true) {
            String j = rVar2.j();
            if (j != null) {
                if (j.startsWith("Format:")) {
                    a02 = A0.b(j);
                } else {
                    if (j.startsWith("Dialogue:")) {
                        if (a02 == null) {
                            AbstractC1566a.P("SsaDecoder", "Skipping dialogue line before complete format: ".concat(j));
                        } else {
                            AbstractC1566a.h(j.startsWith("Dialogue:"));
                            String substring = j.substring(9);
                            int i20 = a02.f1989e;
                            String[] split = substring.split(",", i20);
                            if (split.length != i20) {
                                AbstractC1566a.P("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(j));
                            } else {
                                long k5 = k(split[a02.f1985a]);
                                if (k5 == -9223372036854775807L) {
                                    AbstractC1566a.P("SsaDecoder", "Skipping invalid timing: ".concat(j));
                                } else {
                                    long k9 = k(split[a02.f1986b]);
                                    if (k9 == -9223372036854775807L) {
                                        AbstractC1566a.P("SsaDecoder", "Skipping invalid timing: ".concat(j));
                                    } else {
                                        LinkedHashMap linkedHashMap = c1122a.f16841o;
                                        if (linkedHashMap != null && (i19 = a02.f1987c) != -1) {
                                            c1125d = (C1125d) linkedHashMap.get(split[i19].trim());
                                        } else {
                                            c1125d = null;
                                        }
                                        String str = split[a02.f1988d];
                                        Matcher matcher = C1124c.f16854a.matcher(str);
                                        int i21 = -1;
                                        PointF pointF = null;
                                        while (matcher.find()) {
                                            r rVar3 = rVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a5 = C1124c.a(group);
                                                if (a5 != null) {
                                                    pointF = a5;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = C1124c.f16857d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i18 = C1125d.a(group2);
                                                } else {
                                                    i18 = -1;
                                                }
                                                if (i18 != -1) {
                                                    i21 = i18;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            rVar2 = rVar3;
                                        }
                                        rVar = rVar2;
                                        String replace = C1124c.f16854a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f16 = c1122a.f16842p;
                                        float f17 = c1122a.f16843q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (c1125d != null) {
                                            Integer num2 = c1125d.f16860c;
                                            if (num2 != null) {
                                                a03 = a02;
                                                f9 = f16;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                a03 = a02;
                                                f9 = f16;
                                            }
                                            if (c1125d.j == 3 && (num = c1125d.f16861d) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f18 = c1125d.f16862e;
                                            if (f18 != -3.4028235E38f && f17 != -3.4028235E38f) {
                                                f14 = f18 / f17;
                                                i15 = 1;
                                            } else {
                                                f14 = -3.4028235E38f;
                                                i15 = Integer.MIN_VALUE;
                                            }
                                            boolean z11 = c1125d.f16864g;
                                            boolean z12 = c1125d.f16863f;
                                            if (z12 && z11) {
                                                f15 = f14;
                                                i16 = i15;
                                                i10 = 0;
                                                i17 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i16 = i15;
                                                i10 = 0;
                                                i17 = 33;
                                                if (z12) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z11) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (c1125d.f16865h) {
                                                spannableString.setSpan(new UnderlineSpan(), i10, spannableString.length(), i17);
                                            }
                                            if (c1125d.f16866i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i10, spannableString.length(), i17);
                                            }
                                            i11 = i16;
                                            f10 = f15;
                                        } else {
                                            a03 = a02;
                                            f9 = f16;
                                            i10 = 0;
                                            f10 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        }
                                        int i22 = -1;
                                        if (i21 != -1) {
                                            i22 = i21;
                                        } else if (c1125d != null) {
                                            i22 = c1125d.f16859b;
                                        }
                                        switch (i22) {
                                            case 0:
                                            default:
                                                AbstractC0953k1.v("Unknown alignment: ", i22, "SsaDecoder");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i23 = Integer.MIN_VALUE;
                                        switch (i22) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                AbstractC0953k1.v("Unknown alignment: ", i22, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i12 = i10;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i12 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i12 = 2;
                                                break;
                                        }
                                        i12 = Integer.MIN_VALUE;
                                        switch (i22) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                AbstractC0953k1.v("Unknown alignment: ", i22, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i23 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i23 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i23 = i10;
                                                break;
                                        }
                                        if (pointF != null && f17 != -3.4028235E38f && f9 != -3.4028235E38f) {
                                            f13 = pointF.x / f9;
                                            f12 = pointF.y / f17;
                                        } else {
                                            float f19 = 0.05f;
                                            if (i12 != 0) {
                                                i14 = 1;
                                                if (i12 != 1) {
                                                    i13 = 2;
                                                    if (i12 != 2) {
                                                        f11 = -3.4028235E38f;
                                                    } else {
                                                        f11 = 0.95f;
                                                    }
                                                } else {
                                                    i13 = 2;
                                                    f11 = 0.5f;
                                                }
                                            } else {
                                                i13 = 2;
                                                i14 = 1;
                                                f11 = 0.05f;
                                            }
                                            if (i23 != 0) {
                                                if (i23 != i14) {
                                                    if (i23 != i13) {
                                                        f19 = -3.4028235E38f;
                                                    } else {
                                                        f19 = 0.95f;
                                                    }
                                                } else {
                                                    f19 = 0.5f;
                                                }
                                            }
                                            f12 = f19;
                                            f13 = f11;
                                        }
                                        Y3.b bVar = new Y3.b(spannableString, alignment2, null, null, f12, i10, i23, f13, i12, i11, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int i24 = i(k9, arrayList2, arrayList);
                                        for (int i25 = i(k5, arrayList2, arrayList); i25 < i24; i25++) {
                                            ((List) arrayList.get(i25)).add(bVar);
                                        }
                                        c1122a = this;
                                        rVar2 = rVar;
                                        a02 = a03;
                                    }
                                }
                            }
                        }
                    }
                    rVar = rVar2;
                    a03 = a02;
                    c1122a = this;
                    rVar2 = rVar;
                    a02 = a03;
                }
            } else {
                return new C1126e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a9, code lost:
    
        if (r4 != 3) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(A4.r r38) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.C1122a.j(A4.r):void");
    }
}
