package P4;

import android.os.IInterface;

/* loaded from: classes.dex */
public interface c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z9, int i9);

    int getIntFlagValue(String str, int i9, int i10);

    long getLongFlagValue(String str, long j, int i9);

    String getStringFlagValue(String str, String str2, int i9);

    void init(N4.a aVar);
}
