package u0;

import B6.u0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import s.C1940j;
import v0.AbstractC2092a;

/* loaded from: classes.dex */
public abstract class C {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f23374a;

    /* renamed from: b, reason: collision with root package name */
    public F f23375b;

    /* renamed from: c, reason: collision with root package name */
    public String f23376c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f23377d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23378e;

    /* renamed from: f, reason: collision with root package name */
    public final C1940j f23379f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f23380g;

    /* renamed from: h, reason: collision with root package name */
    public int f23381h;

    /* renamed from: i, reason: collision with root package name */
    public String f23382i;

    static {
        new LinkedHashMap();
    }

    public C(V v8) {
        LinkedHashMap linkedHashMap = W.f23461b;
        this.f23374a = u0.y(v8.getClass());
        this.f23378e = new ArrayList();
        this.f23379f = new C1940j(0);
        this.f23380g = new LinkedHashMap();
    }

    public final Bundle b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f23380g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C2038i c2038i = (C2038i) entry.getValue();
            c2038i.getClass();
            kotlin.jvm.internal.h.e(name, "name");
            if (c2038i.f23488c && (obj = c2038i.f23489d) != null) {
                c2038i.f23486a.e(bundle2, name, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C2038i c2038i2 = (C2038i) entry2.getValue();
                c2038i2.getClass();
                kotlin.jvm.internal.h.e(name2, "name");
                T t7 = c2038i2.f23486a;
                if (c2038i2.f23487b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        t7.a(name2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder r5 = AbstractC0953k1.r("Wrong argument type for '", name2, "' in argument bundle. ");
                r5.append(t7.b());
                r5.append(" expected.");
                throw new IllegalArgumentException(r5.toString().toString());
            }
        }
        return bundle2;
    }

    public final C2035f c(int i9) {
        C2035f c2035f;
        C1940j c1940j = this.f23379f;
        if (c1940j.i() == 0) {
            c2035f = null;
        } else {
            c2035f = (C2035f) c1940j.e(i9);
        }
        if (c2035f == null) {
            F f9 = this.f23375b;
            if (f9 == null) {
                return null;
            }
            return f9.c(i9);
        }
        return c2035f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0365, code lost:
    
        if (com.google.android.gms.internal.measurement.D1.E(r3, new u0.C2052x(1, r4)).isEmpty() != false) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0315  */
    /* JADX WARN: Type inference failed for: r1v13, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u0.C2029A d(b5.G1 r28) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C.d(b5.G1):u0.A");
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2092a.f23721e);
        kotlin.jvm.internal.h.d(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f23381h = 0;
            this.f23376c = null;
        } else if (!W7.d.U(string)) {
            String uriPattern = "android-app://androidx.navigation/".concat(string);
            kotlin.jvm.internal.h.e(uriPattern, "uriPattern");
            ArrayList E8 = D1.E(this.f23380g, new B(new y(uriPattern, null, null), 1));
            if (E8.isEmpty()) {
                Z0.a.q(new e2.e(28, uriPattern));
                this.f23381h = uriPattern.hashCode();
                this.f23376c = null;
            } else {
                throw new IllegalArgumentException(("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + E8).toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        this.f23382i = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f23381h = resourceId;
            this.f23376c = null;
            this.f23376c = Y1.o(context, resourceId);
        }
        this.f23377d = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto Lb2
        L5:
            r1 = 0
            if (r9 == 0) goto Lb3
            boolean r2 = r9 instanceof u0.C
            if (r2 != 0) goto Le
            goto Lb3
        Le:
            java.util.ArrayList r2 = r8.f23378e
            u0.C r9 = (u0.C) r9
            java.util.ArrayList r3 = r9.f23378e
            boolean r2 = kotlin.jvm.internal.h.a(r2, r3)
            s.j r3 = r8.f23379f
            int r4 = r3.i()
            s.j r5 = r9.f23379f
            int r6 = r5.i()
            if (r4 != r6) goto L54
            s.k r4 = new s.k
            r4.<init>(r3)
            V7.j r4 = V7.l.f0(r4)
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L52
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.e(r6)
            java.lang.Object r6 = r5.e(r6)
            boolean r6 = kotlin.jvm.internal.h.a(r7, r6)
            if (r6 != 0) goto L33
            goto L54
        L52:
            r3 = r0
            goto L55
        L54:
            r3 = r1
        L55:
            java.util.LinkedHashMap r4 = r8.f23380g
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f23380g
            int r7 = r6.size()
            if (r5 != r7) goto L9b
            java.util.Set r4 = r4.entrySet()
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.h.e(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L70:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.h.a(r7, r5)
            if (r5 == 0) goto L9b
            goto L70
        L99:
            r4 = r0
            goto L9c
        L9b:
            r4 = r1
        L9c:
            int r5 = r8.f23381h
            int r6 = r9.f23381h
            if (r5 != r6) goto Lb3
            java.lang.String r5 = r8.f23382i
            java.lang.String r9 = r9.f23382i
            boolean r9 = kotlin.jvm.internal.h.a(r5, r9)
            if (r9 == 0) goto Lb3
            if (r2 == 0) goto Lb3
            if (r3 == 0) goto Lb3
            if (r4 == 0) goto Lb3
        Lb2:
            return r0
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i9;
        boolean z9;
        int i10;
        int i11;
        Set<String> keySet;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f23381h * 31;
        String str = this.f23382i;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i17 = i16 + i9;
        ArrayList arrayList = this.f23378e;
        int size = arrayList.size();
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            y yVar = (y) obj;
            int i19 = i17 * 31;
            String str2 = yVar.f23551a;
            if (str2 != null) {
                i13 = str2.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i19 + i13) * 31;
            String str3 = yVar.f23552b;
            if (str3 != null) {
                i14 = str3.hashCode();
            } else {
                i14 = 0;
            }
            int i21 = (i20 + i14) * 31;
            String str4 = yVar.f23553c;
            if (str4 != null) {
                i15 = str4.hashCode();
            } else {
                i15 = 0;
            }
            i17 = i21 + i15;
        }
        C1940j c1940j = this.f23379f;
        kotlin.jvm.internal.h.e(c1940j, "<this>");
        int i22 = 0;
        while (true) {
            if (i22 < c1940j.i()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            int i23 = i22 + 1;
            C2035f c2035f = (C2035f) c1940j.j(i22);
            int i24 = ((i17 * 31) + c2035f.f23481a) * 31;
            J j4 = c2035f.f23482b;
            if (j4 != null) {
                i11 = j4.hashCode();
            } else {
                i11 = 0;
            }
            i17 = i24 + i11;
            Bundle bundle = c2035f.f23483c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str5 : keySet) {
                    int i25 = i17 * 31;
                    Bundle bundle2 = c2035f.f23483c;
                    kotlin.jvm.internal.h.b(bundle2);
                    Object obj2 = bundle2.get(str5);
                    if (obj2 != null) {
                        i12 = obj2.hashCode();
                    } else {
                        i12 = 0;
                    }
                    i17 = i25 + i12;
                }
            }
            i22 = i23;
        }
        LinkedHashMap linkedHashMap = this.f23380g;
        for (String str6 : linkedHashMap.keySet()) {
            int c3 = z.c(str6, i17 * 31, 31);
            Object obj3 = linkedHashMap.get(str6);
            if (obj3 != null) {
                i10 = obj3.hashCode();
            } else {
                i10 = 0;
            }
            i17 = c3 + i10;
        }
        return i17;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f23376c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f23381h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f23382i;
        if (str2 != null && !W7.d.U(str2)) {
            sb.append(" route=");
            sb.append(this.f23382i);
        }
        if (this.f23377d != null) {
            sb.append(" label=");
            sb.append(this.f23377d);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
