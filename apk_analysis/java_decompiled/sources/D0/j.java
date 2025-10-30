package D0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1758b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1759c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1760d;

    public j(int i9, int i10, long j, long j4) {
        this.f1757a = i9;
        this.f1758b = i10;
        this.f1759c = j;
        this.f1760d = j4;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1757a);
            dataOutputStream.writeInt(this.f1758b);
            dataOutputStream.writeLong(this.f1759c);
            dataOutputStream.writeLong(this.f1760d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f1758b == jVar.f1758b && this.f1759c == jVar.f1759c && this.f1757a == jVar.f1757a && this.f1760d == jVar.f1760d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1758b), Long.valueOf(this.f1759c), Integer.valueOf(this.f1757a), Long.valueOf(this.f1760d));
    }
}
