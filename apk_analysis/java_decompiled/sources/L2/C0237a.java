package L2;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import y2.C2203a;

/* renamed from: L2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237a {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4588a;

    public C0237a(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4588a = encryptedPreference;
    }

    public final void a(LinkedHashMap linkedHashMap) {
        Integer E8;
        g6.o oVar = g6.o.f17761a;
        String str = (String) linkedHashMap.get(oVar.d0());
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String[] o9 = oVar.o();
        int length = o9.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (W7.d.N(o9[i10], str)) {
                str = "";
                break;
            }
            i10++;
        }
        g6.o oVar2 = g6.o.f17761a;
        String str3 = (String) linkedHashMap.get(oVar2.e0());
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) linkedHashMap.get(oVar2.i0());
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) linkedHashMap.get(oVar2.Z());
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) linkedHashMap.get(oVar2.k0());
        if (str6 == null) {
            str6 = "";
        }
        String str7 = (String) linkedHashMap.get(oVar2.f0());
        if (str7 != null) {
            str2 = str7;
        }
        String str8 = (String) linkedHashMap.get(oVar2.S());
        String d02 = oVar2.d0();
        C2203a c2203a = this.f4588a;
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(d02, str);
        edit.apply();
        String e02 = oVar2.e0();
        SharedPreferences sharedPreferences = c2203a.f24771a;
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(e02, str3);
        edit2.apply();
        String i02 = oVar2.i0();
        SharedPreferences.Editor edit3 = sharedPreferences.edit();
        edit3.putString(i02, str4);
        edit3.apply();
        String Z6 = oVar2.Z();
        SharedPreferences.Editor edit4 = sharedPreferences.edit();
        edit4.putString(Z6, str5);
        edit4.apply();
        String k02 = oVar2.k0();
        SharedPreferences.Editor edit5 = sharedPreferences.edit();
        edit5.putString(k02, str6);
        edit5.apply();
        String f02 = oVar2.f0();
        SharedPreferences.Editor edit6 = sharedPreferences.edit();
        edit6.putString(f02, str2);
        edit6.apply();
        String S8 = oVar2.S();
        if (str8 != null && (E8 = W7.k.E(str8)) != null) {
            i9 = E8.intValue();
        }
        SharedPreferences.Editor edit7 = sharedPreferences.edit();
        edit7.putInt(S8, i9);
        edit7.apply();
    }
}
