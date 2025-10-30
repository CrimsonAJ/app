package r8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;
import x8.C2182b;
import x8.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22634a = new Object();

    public final void a(File file) {
        h.e(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public final void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public final boolean c(File file) {
        h.e(file, "file");
        return file.exists();
    }

    public final void d(File from, File to) {
        h.e(from, "from");
        h.e(to, "to");
        a(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    public final C2182b e(File file) {
        h.e(file, "file");
        try {
            Logger logger = w.f24682a;
            return new C2182b(new FileOutputStream(file, false), 1, new Object());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = w.f24682a;
            return new C2182b(new FileOutputStream(file, false), 1, new Object());
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
