package d0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import b5.C0673x;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085c extends C0673x {
    @Override // b5.C0673x
    public final Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
