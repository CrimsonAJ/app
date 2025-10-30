package A6;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class m implements Closeable, AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f516g = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f517a;

    /* renamed from: b, reason: collision with root package name */
    public int f518b;

    /* renamed from: c, reason: collision with root package name */
    public int f519c;

    /* renamed from: d, reason: collision with root package name */
    public j f520d;

    /* renamed from: e, reason: collision with root package name */
    public j f521e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f522f;

    public m(File file) {
        byte[] bArr = new byte[16];
        this.f522f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    i0(bArr2, i9, iArr[i10]);
                    i9 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f517a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int I4 = I(0, bArr);
        this.f518b = I4;
        if (I4 <= randomAccessFile2.length()) {
            this.f519c = I(4, bArr);
            int I8 = I(8, bArr);
            int I9 = I(12, bArr);
            this.f520d = F(I8);
            this.f521e = F(I9);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f518b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int I(int i9, byte[] bArr) {
        return ((bArr[i9] & 255) << 24) + ((bArr[i9 + 1] & 255) << 16) + ((bArr[i9 + 2] & 255) << 8) + (bArr[i9 + 3] & 255);
    }

    public static void i0(byte[] bArr, int i9, int i10) {
        bArr[i9] = (byte) (i10 >> 24);
        bArr[i9 + 1] = (byte) (i10 >> 16);
        bArr[i9 + 2] = (byte) (i10 >> 8);
        bArr[i9 + 3] = (byte) i10;
    }

    public final j F(int i9) {
        if (i9 == 0) {
            return j.f510c;
        }
        RandomAccessFile randomAccessFile = this.f517a;
        randomAccessFile.seek(i9);
        return new j(i9, randomAccessFile.readInt());
    }

    public final synchronized void N() {
        try {
            if (!x()) {
                if (this.f519c == 1) {
                    d();
                } else {
                    j jVar = this.f520d;
                    int g02 = g0(jVar.f511a + 4 + jVar.f512b);
                    O(g02, 0, 4, this.f522f);
                    int I4 = I(0, this.f522f);
                    h0(this.f518b, this.f519c - 1, g02, this.f521e.f511a);
                    this.f519c--;
                    this.f520d = new j(g02, I4);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void O(int i9, int i10, int i11, byte[] bArr) {
        int g02 = g0(i9);
        int i12 = g02 + i11;
        int i13 = this.f518b;
        RandomAccessFile randomAccessFile = this.f517a;
        if (i12 <= i13) {
            randomAccessFile.seek(g02);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - g02;
        randomAccessFile.seek(g02);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void S(byte[] bArr, int i9, int i10) {
        int g02 = g0(i9);
        int i11 = g02 + i10;
        int i12 = this.f518b;
        RandomAccessFile randomAccessFile = this.f517a;
        if (i11 <= i12) {
            randomAccessFile.seek(g02);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - g02;
        randomAccessFile.seek(g02);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final void a(byte[] bArr) {
        int g02;
        int i9;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    g(length);
                    boolean x5 = x();
                    if (x5) {
                        g02 = 16;
                    } else {
                        j jVar = this.f521e;
                        g02 = g0(jVar.f511a + 4 + jVar.f512b);
                    }
                    j jVar2 = new j(g02, length);
                    i0(this.f522f, 0, length);
                    S(this.f522f, g02, 4);
                    S(bArr, g02 + 4, length);
                    if (x5) {
                        i9 = g02;
                    } else {
                        i9 = this.f520d.f511a;
                    }
                    h0(this.f518b, this.f519c + 1, i9, g02);
                    this.f521e = jVar2;
                    this.f519c++;
                    if (x5) {
                        this.f520d = jVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final int a0() {
        if (this.f519c == 0) {
            return 16;
        }
        j jVar = this.f521e;
        int i9 = jVar.f511a;
        int i10 = this.f520d.f511a;
        if (i9 >= i10) {
            return (i9 - i10) + 4 + jVar.f512b + 16;
        }
        return (((i9 + 4) + jVar.f512b) + this.f518b) - i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f517a.close();
    }

    public final synchronized void d() {
        h0(4096, 0, 0, 0);
        this.f519c = 0;
        j jVar = j.f510c;
        this.f520d = jVar;
        this.f521e = jVar;
        if (this.f518b > 4096) {
            RandomAccessFile randomAccessFile = this.f517a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f518b = 4096;
    }

    public final void g(int i9) {
        int i10 = i9 + 4;
        int a02 = this.f518b - a0();
        if (a02 >= i10) {
            return;
        }
        int i11 = this.f518b;
        do {
            a02 += i11;
            i11 <<= 1;
        } while (a02 < i10);
        RandomAccessFile randomAccessFile = this.f517a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        j jVar = this.f521e;
        int g02 = g0(jVar.f511a + 4 + jVar.f512b);
        if (g02 < this.f520d.f511a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f518b);
            long j = g02 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f521e.f511a;
        int i13 = this.f520d.f511a;
        if (i12 < i13) {
            int i14 = (this.f518b + i12) - 16;
            h0(i11, this.f519c, i13, i14);
            this.f521e = new j(i14, this.f521e.f512b);
        } else {
            h0(i11, this.f519c, i13, i12);
        }
        this.f518b = i11;
    }

    public final int g0(int i9) {
        int i10 = this.f518b;
        if (i9 < i10) {
            return i9;
        }
        return (i9 + 16) - i10;
    }

    public final void h0(int i9, int i10, int i11, int i12) {
        int[] iArr = {i9, i10, i11, i12};
        byte[] bArr = this.f522f;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            i0(bArr, i13, iArr[i14]);
            i13 += 4;
        }
        RandomAccessFile randomAccessFile = this.f517a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final synchronized void s(l lVar) {
        int i9 = this.f520d.f511a;
        for (int i10 = 0; i10 < this.f519c; i10++) {
            j F2 = F(i9);
            lVar.a(new k(this, F2), F2.f512b);
            i9 = g0(F2.f511a + 4 + F2.f512b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, A6.l, A6.i] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f518b);
        sb.append(", size=");
        sb.append(this.f519c);
        sb.append(", first=");
        sb.append(this.f520d);
        sb.append(", last=");
        sb.append(this.f521e);
        sb.append(", element lengths=[");
        try {
            ?? obj = new Object();
            obj.f509b = sb;
            obj.f508a = true;
            s(obj);
        } catch (IOException e8) {
            f516g.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized boolean x() {
        boolean z9;
        if (this.f519c == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return z9;
    }
}
