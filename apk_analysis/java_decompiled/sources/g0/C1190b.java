package g0;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1190b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f17491a;

    /* renamed from: b, reason: collision with root package name */
    public int f17492b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f17493c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f17494d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17495e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1190b(byte[] r3) {
        /*
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r1 = 0
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.f17495e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C1190b.<init>(byte[]):void");
    }

    public final void a(int i9) {
        int i10 = 0;
        while (i10 < i9) {
            DataInputStream dataInputStream = this.f17491a;
            int i11 = i9 - i10;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f17494d == null) {
                    this.f17494d = new byte[8192];
                }
                skip = dataInputStream.read(this.f17494d, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(A0.a.m("Reached EOF while skipping ", i9, " bytes."));
                }
            }
            i10 += skip;
        }
        this.f17492b += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f17491a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i9) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f17492b++;
        return this.f17491a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f17492b++;
        return this.f17491a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f17492b++;
        int read = this.f17491a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f17492b += 2;
        return this.f17491a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i9, int i10) {
        this.f17492b += i10;
        this.f17491a.readFully(bArr, i9, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f17492b += 4;
        DataInputStream dataInputStream = this.f17491a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f17493c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f17493c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j4;
        this.f17492b += 8;
        DataInputStream dataInputStream = this.f17491a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f17493c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j4 = read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j4 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f17493c);
            }
            return j + j4;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f17492b += 2;
        DataInputStream dataInputStream = this.f17491a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f17493c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f17493c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f17492b += 2;
        return this.f17491a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f17492b++;
        return this.f17491a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f17492b += 2;
        DataInputStream dataInputStream = this.f17491a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f17493c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f17493c);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i9) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1190b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        int read = this.f17491a.read(bArr, i9, i10);
        this.f17492b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f17492b += bArr.length;
        this.f17491a.readFully(bArr);
    }

    public C1190b(InputStream inputStream, int i9) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f17491a = dataInputStream;
        dataInputStream.mark(0);
        this.f17492b = 0;
        this.f17493c = byteOrder;
        this.f17495e = inputStream instanceof C1190b ? ((C1190b) inputStream).f17495e : -1;
    }
}
