package N3;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f5032a;

    /* renamed from: b, reason: collision with root package name */
    public long f5033b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5034c;

    public Z(int i9, URL url, long j) {
        this.f5032a = i9;
        this.f5034c = url;
        this.f5033b = j;
    }

    public static byte[] b(byte b9, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b9, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public P5.F a(byte[] bArr) {
        boolean z9;
        long j;
        if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        String str = new String(bArr, 0, bArr.length - 2, U3.x.f7475g);
        ArrayList arrayList = (ArrayList) this.f5034c;
        arrayList.add(str);
        int i9 = this.f5032a;
        if (i9 != 1) {
            if (i9 == 2) {
                try {
                    Matcher matcher = U3.y.f7484c.matcher(str);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        j = Long.parseLong(group);
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        this.f5033b = j;
                    }
                    if (str.isEmpty()) {
                        if (this.f5033b > 0) {
                            this.f5032a = 3;
                            return null;
                        }
                        P5.F o9 = P5.F.o(arrayList);
                        arrayList.clear();
                        this.f5032a = 1;
                        this.f5033b = 0L;
                        return o9;
                    }
                    return null;
                } catch (NumberFormatException e8) {
                    throw j3.j0.b(str, e8);
                }
            }
            throw new IllegalStateException();
        }
        if (U3.y.f7482a.matcher(str).matches() || U3.y.f7483b.matcher(str).matches()) {
            this.f5032a = 2;
            return null;
        }
        return null;
    }
}
