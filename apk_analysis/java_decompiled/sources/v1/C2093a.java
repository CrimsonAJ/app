package v1;

import B6.u0;
import android.os.StatFs;
import java.io.File;
import x8.u;
import x8.y;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2093a {

    /* renamed from: a, reason: collision with root package name */
    public y f23722a;

    /* renamed from: b, reason: collision with root package name */
    public u f23723b;

    /* renamed from: c, reason: collision with root package name */
    public double f23724c;

    /* renamed from: d, reason: collision with root package name */
    public long f23725d;

    /* renamed from: e, reason: collision with root package name */
    public long f23726e;

    /* renamed from: f, reason: collision with root package name */
    public f8.d f23727f;

    public final C2100h a() {
        long j;
        y yVar = this.f23722a;
        if (yVar != null) {
            double d9 = this.f23724c;
            if (d9 > 0.0d) {
                try {
                    File f9 = yVar.f();
                    f9.mkdir();
                    StatFs statFs = new StatFs(f9.getAbsolutePath());
                    j = u0.l((long) (d9 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f23725d, this.f23726e);
                } catch (Exception unused) {
                    j = this.f23725d;
                }
            } else {
                j = 0;
            }
            return new C2100h(j, this.f23727f, this.f23723b, yVar);
        }
        throw new IllegalStateException("directory == null");
    }
}
