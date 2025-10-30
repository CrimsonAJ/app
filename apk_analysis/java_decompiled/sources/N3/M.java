package N3;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class M extends IOException {
    public /* synthetic */ M(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(long j, long j4, int i9, IndexOutOfBoundsException indexOutOfBoundsException, int i10) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j4 + ", len: " + i9), indexOutOfBoundsException);
        switch (i10) {
            case 8:
                Locale locale = Locale.US;
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j4 + ", len: " + i9), indexOutOfBoundsException);
                return;
            default:
                Locale locale2 = Locale.US;
                return;
        }
    }

    public M(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
