package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f19464a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f19465b;

    /* renamed from: c, reason: collision with root package name */
    public final P5.X f19466c;

    /* renamed from: d, reason: collision with root package name */
    public final P5.S f19467d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f19468e;

    public S(Y2.r rVar) {
        byte[] bArr;
        rVar.getClass();
        UUID uuid = (UUID) rVar.f8647a;
        uuid.getClass();
        this.f19464a = uuid;
        this.f19465b = (Uri) rVar.f8648b;
        this.f19466c = (P5.X) rVar.f8649c;
        this.f19467d = (P5.S) rVar.f8650d;
        byte[] bArr2 = (byte[]) rVar.f8651e;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f19468e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S) {
                S s9 = (S) obj;
                if (this.f19464a.equals(s9.f19464a) && l4.y.a(this.f19465b, s9.f19465b) && l4.y.a(this.f19466c, s9.f19466c) && this.f19467d.equals(s9.f19467d) && Arrays.equals(this.f19468e, s9.f19468e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f19464a.hashCode() * 31;
        Uri uri = this.f19465b;
        if (uri != null) {
            i9 = uri.hashCode();
        } else {
            i9 = 0;
        }
        return Arrays.hashCode(this.f19468e) + ((this.f19467d.hashCode() + ((this.f19466c.hashCode() + ((hashCode + i9) * 31)) * 923521)) * 31);
    }
}
