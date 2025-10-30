package x8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class u extends n {
    @Override // x8.n
    public final void b(y yVar) {
        if (!yVar.f().mkdir()) {
            m h7 = h(yVar);
            if (h7 == null || !h7.f24657c) {
                throw new IOException("failed to create directory: " + yVar);
            }
        }
    }

    @Override // x8.n
    public final void c(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        if (!Thread.interrupted()) {
            File f9 = path.f();
            if (!f9.delete() && f9.exists()) {
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // x8.n
    public final List f(y dir) {
        kotlin.jvm.internal.h.e(dir, "dir");
        File f9 = dir.f();
        String[] list = f9.list();
        if (list == null) {
            if (!f9.exists()) {
                throw new FileNotFoundException("no such file: " + dir);
            }
            throw new IOException("failed to list " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.h.b(str);
            arrayList.add(dir.e(str));
        }
        B7.p.g0(arrayList);
        return arrayList;
    }

    @Override // x8.n
    public m h(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        File f9 = path.f();
        boolean isFile = f9.isFile();
        boolean isDirectory = f9.isDirectory();
        long lastModified = f9.lastModified();
        long length = f9.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !f9.exists()) {
            return null;
        }
        return new m(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // x8.n
    public final t i(y yVar) {
        return new t(false, new RandomAccessFile(yVar.f(), "r"));
    }

    @Override // x8.n
    public final G j(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        File f9 = file.f();
        Logger logger = w.f24682a;
        return new C2182b(new FileOutputStream(f9, false), 1, new Object());
    }

    @Override // x8.n
    public final I k(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        File f9 = file.f();
        Logger logger = w.f24682a;
        return new C2183c(new FileInputStream(f9), K.f24618d);
    }

    public void l(y source, y target) {
        kotlin.jvm.internal.h.e(source, "source");
        kotlin.jvm.internal.h.e(target, "target");
        if (source.f().renameTo(target.f())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
