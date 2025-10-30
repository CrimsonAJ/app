package q6;

import P5.AbstractC0349q;
import P5.C;
import P5.D;
import P5.F;
import P5.I;
import P5.S;
import android.os.Bundle;
import b5.D0;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1916a {

    /* renamed from: a, reason: collision with root package name */
    public static final I f22429a;

    /* renamed from: b, reason: collision with root package name */
    public static final S f22430b;

    /* renamed from: c, reason: collision with root package name */
    public static final S f22431c;

    /* renamed from: d, reason: collision with root package name */
    public static final S f22432d;

    /* renamed from: e, reason: collision with root package name */
    public static final S f22433e;

    /* renamed from: f, reason: collision with root package name */
    public static final S f22434f;

    static {
        int i9 = I.f5906c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f22429a = I.o(15, objArr);
        D d9 = F.f5901b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC0349q.a(7, objArr2);
        f22430b = F.k(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC0349q.a(3, objArr3);
        f22431c = F.k(3, objArr3);
        f22432d = F.t("_r", "_dbg");
        C c3 = new C();
        c3.b(D0.f10582i);
        c3.b(D0.j);
        f22433e = c3.d();
        f22434f = F.t("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = c(r5)
            r1 = 0
            if (r6 != 0) goto L12
            goto L67
        L12:
            if (r7 != 0) goto L15
            goto L67
        L15:
            P5.S r6 = q6.AbstractC1916a.f22432d
            int r2 = r6.f5928d
            r3 = r1
        L1a:
            if (r3 >= r2) goto L2b
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1a
            goto L67
        L2b:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L54
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4a
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L40
            goto L5e
        L40:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r3
            goto L5f
        L4a:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r0
            goto L5f
        L54:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r1
            goto L5f
        L5e:
            r5 = -1
        L5f:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L74
            if (r5 == r0) goto L6e
            if (r5 == r3) goto L68
        L67:
            return r1
        L68:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L6e:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L74:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.AbstractC1916a.a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static boolean b(String str, Bundle bundle) {
        if (!f22430b.contains(str)) {
            if (bundle != null) {
                S s9 = f22432d;
                int i9 = s9.f5928d;
                int i10 = 0;
                while (i10 < i9) {
                    boolean containsKey = bundle.containsKey((String) s9.get(i10));
                    i10++;
                    if (containsKey) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        if (!f22431c.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
            } else if (!f22433e.contains(str2)) {
                S s9 = f22434f;
                int i9 = s9.f5928d;
                int i10 = 0;
                while (i10 < i9) {
                    boolean matches = str2.matches((String) s9.get(i10));
                    i10++;
                    if (matches) {
                    }
                }
                return true;
            }
        } else if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
