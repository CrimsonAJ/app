package x8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes.dex */
public final class v extends u {
    public static Long m(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // x8.u, x8.n
    public final m h(y path) {
        Path path2;
        y yVar;
        Long l9;
        Long l10;
        kotlin.jvm.internal.h.e(path, "path");
        Path g9 = path.g();
        Long l11 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(g9, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(g9);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = y.f24685b;
                yVar = d0.o.g(path2.toString(), false);
            } else {
                yVar = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l9 = m(creationTime);
            } else {
                l9 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l10 = m(lastModifiedTime);
            } else {
                l10 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l11 = m(lastAccessTime);
            }
            return new m(isRegularFile, isDirectory, yVar, valueOf, l9, l10, l11);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // x8.u
    public final void l(y source, y target) {
        kotlin.jvm.internal.h.e(source, "source");
        kotlin.jvm.internal.h.e(target, "target");
        try {
            Files.move(source.g(), target.g(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e8) {
            throw new FileNotFoundException(e8.getMessage());
        }
    }

    @Override // x8.u
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
