package w1;

import android.webkit.MimeTypeMap;
import d0.o;
import java.io.File;
import u1.C2064l;
import u1.EnumC2057e;
import x8.n;
import x8.y;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f24011a;

    public h(File file) {
        this.f24011a = file;
    }

    @Override // w1.g
    public final Object a(E7.d dVar) {
        String str = y.f24685b;
        File file = this.f24011a;
        C2064l c2064l = new C2064l(o.h(file), n.f24664a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.h.d(name, "getName(...)");
        return new m(c2064l, singleton.getMimeTypeFromExtension(W7.d.f0(name, '.', "")), EnumC2057e.f23579c);
    }
}
