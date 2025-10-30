package g0;

import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: g0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1196h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i9) {
        return Os.lseek(fileDescriptor, j, i9);
    }
}
