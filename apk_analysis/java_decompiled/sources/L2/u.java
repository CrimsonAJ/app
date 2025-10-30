package L2;

import a.AbstractC0485a;
import y2.C2203a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4634a;

    public u(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4634a = encryptedPreference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r9v33, types: [android.content.SharedPreferences] */
    public static String a(u uVar, long j, int i9) {
        boolean z9;
        Object h7;
        Object h9;
        Object h10;
        if ((i9 & 1) != 0) {
            j = -1;
        }
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        C2203a c2203a = uVar.f4634a;
        Object obj = null;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Float.TYPE;
        Object obj2 = "";
        if (j > 0) {
            String i02 = g6.o.f17761a.i0();
            kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(String.class);
            if (a5.equals(kotlin.jvm.internal.p.a(cls4))) {
                obj2 = (String) Float.valueOf(c2203a.f24771a.getFloat(i02, ((Float) "").floatValue()));
            } else if (a5.equals(kotlin.jvm.internal.p.a(cls3))) {
                obj2 = (String) Integer.valueOf(c2203a.f24771a.getInt(i02, ((Integer) "").intValue()));
            } else if (a5.equals(kotlin.jvm.internal.p.a(cls2))) {
                obj2 = (String) Long.valueOf(c2203a.f24771a.getLong(i02, ((Long) "").longValue()));
            } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
                obj2 = c2203a.f24771a.getString(i02, "");
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (a5.equals(kotlin.jvm.internal.p.a(cls))) {
                obj2 = (String) Boolean.valueOf(c2203a.f24771a.getBoolean(i02, ((Boolean) "").booleanValue()));
            } else {
                String string = c2203a.f24771a.getString(i02, "");
                if (string != null && string.length() != 0) {
                    try {
                        h10 = c2203a.f24772b.a(String.class).a(string);
                    } catch (Throwable th) {
                        h10 = AbstractC0485a.h(th);
                    }
                    if (!(h10 instanceof A7.i)) {
                        obj = h10;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
            }
            String str = (String) obj2;
            if (!W7.d.U(str)) {
                return W7.l.J(str, "{anime_id}", String.valueOf(j));
            }
            return str;
        }
        if (z9) {
            g6.o oVar = g6.o.f17761a;
            String Z6 = oVar.Z();
            ?? K = oVar.K();
            kotlin.jvm.internal.d a9 = kotlin.jvm.internal.p.a(String.class);
            if (a9.equals(kotlin.jvm.internal.p.a(cls4))) {
                K = (String) Float.valueOf(c2203a.f24771a.getFloat(Z6, ((Float) K).floatValue()));
            } else if (a9.equals(kotlin.jvm.internal.p.a(cls3))) {
                K = (String) Integer.valueOf(c2203a.f24771a.getInt(Z6, ((Integer) K).intValue()));
            } else if (a9.equals(kotlin.jvm.internal.p.a(cls2))) {
                K = (String) Long.valueOf(c2203a.f24771a.getLong(Z6, ((Long) K).longValue()));
            } else if (a9.equals(kotlin.jvm.internal.p.a(String.class))) {
                K = c2203a.f24771a.getString(Z6, K);
                if (K == 0) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (a9.equals(kotlin.jvm.internal.p.a(cls))) {
                K = (String) Boolean.valueOf(c2203a.f24771a.getBoolean(Z6, ((Boolean) K).booleanValue()));
            } else {
                String string2 = c2203a.f24771a.getString(Z6, "");
                if (string2 != null && string2.length() != 0) {
                    try {
                        h9 = c2203a.f24772b.a(String.class).a(string2);
                    } catch (Throwable th2) {
                        h9 = AbstractC0485a.h(th2);
                    }
                    if (!(h9 instanceof A7.i)) {
                        obj = h9;
                    }
                    if (obj != null) {
                        K = obj;
                    }
                }
            }
            CharSequence charSequence = (CharSequence) K;
            if (W7.d.U(charSequence)) {
                charSequence = g6.o.f17761a.K();
            }
            return (String) charSequence;
        }
        g6.o oVar2 = g6.o.f17761a;
        String k02 = oVar2.k0();
        ?? Q02 = oVar2.Q0();
        kotlin.jvm.internal.d a10 = kotlin.jvm.internal.p.a(String.class);
        if (a10.equals(kotlin.jvm.internal.p.a(cls4))) {
            Q02 = (String) Float.valueOf(c2203a.f24771a.getFloat(k02, ((Float) Q02).floatValue()));
        } else if (a10.equals(kotlin.jvm.internal.p.a(cls3))) {
            Q02 = (String) Integer.valueOf(c2203a.f24771a.getInt(k02, ((Integer) Q02).intValue()));
        } else if (a10.equals(kotlin.jvm.internal.p.a(cls2))) {
            Q02 = (String) Long.valueOf(c2203a.f24771a.getLong(k02, ((Long) Q02).longValue()));
        } else if (a10.equals(kotlin.jvm.internal.p.a(String.class))) {
            Q02 = c2203a.f24771a.getString(k02, Q02);
            if (Q02 == 0) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else if (a10.equals(kotlin.jvm.internal.p.a(cls))) {
            Q02 = (String) Boolean.valueOf(c2203a.f24771a.getBoolean(k02, ((Boolean) Q02).booleanValue()));
        } else {
            String string3 = c2203a.f24771a.getString(k02, "");
            if (string3 != null && string3.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(String.class).a(string3);
                } catch (Throwable th3) {
                    h7 = AbstractC0485a.h(th3);
                }
                if (!(h7 instanceof A7.i)) {
                    obj = h7;
                }
                if (obj != null) {
                    Q02 = obj;
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) Q02;
        if (W7.d.U(charSequence2)) {
            charSequence2 = g6.o.f17761a.Q0();
        }
        return (String) charSequence2;
    }
}
