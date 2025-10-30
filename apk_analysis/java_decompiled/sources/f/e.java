package f;

import d.C1065f;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v4.e f17232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1065f f17233d;

    public /* synthetic */ e(C1065f c1065f, String str, v4.e eVar, int i9) {
        this.f17230a = i9;
        this.f17233d = c1065f;
        this.f17231b = str;
        this.f17232c = eVar;
    }

    @Override // f.c
    public final void a(Object obj) {
        switch (this.f17230a) {
            case 0:
                C1065f c1065f = this.f17233d;
                HashMap hashMap = c1065f.f16566b;
                String str = this.f17231b;
                Integer num = (Integer) hashMap.get(str);
                v4.e eVar = this.f17232c;
                if (num != null) {
                    c1065f.f16568d.add(str);
                    try {
                        c1065f.b(num.intValue(), eVar, obj);
                        return;
                    } catch (Exception e8) {
                        c1065f.f16568d.remove(str);
                        throw e8;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + eVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                C1065f c1065f2 = this.f17233d;
                HashMap hashMap2 = c1065f2.f16566b;
                String str2 = this.f17231b;
                Integer num2 = (Integer) hashMap2.get(str2);
                v4.e eVar2 = this.f17232c;
                if (num2 != null) {
                    c1065f2.f16568d.add(str2);
                    try {
                        c1065f2.b(num2.intValue(), eVar2, obj);
                        return;
                    } catch (Exception e9) {
                        c1065f2.f16568d.remove(str2);
                        throw e9;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + eVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f17233d.f(this.f17231b);
    }
}
