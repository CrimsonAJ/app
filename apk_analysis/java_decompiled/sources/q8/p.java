package q8;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class p {
    public static int a(int i9, int i10, int i11) {
        if ((i10 & 8) != 0) {
            i9--;
        }
        if (i11 <= i9) {
            return i9 - i11;
        }
        throw new IOException(A0.a.l("PROTOCOL_ERROR padding ", i11, i9, " > remaining length "));
    }
}
