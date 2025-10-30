package y1;

import C1.m;
import java.io.File;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2200a implements InterfaceC2201b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24770a;

    public C2200a(boolean z9) {
        this.f24770a = z9;
    }

    @Override // y1.InterfaceC2201b
    public final String a(Object obj, m mVar) {
        File file = (File) obj;
        if (this.f24770a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
