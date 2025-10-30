package B4;

import F4.y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f713c;

    public /* synthetic */ l(boolean z9, String str, o oVar) {
        this.f711a = z9;
        this.f712b = str;
        this.f713c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        o oVar = this.f713c;
        boolean z9 = this.f711a;
        String str2 = this.f712b;
        if (!z9 && q.b(str2, oVar, true, false).f731a) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        int i9 = 0;
        while (true) {
            if (i9 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i9++;
            } else {
                messageDigest = null;
                break;
            }
        }
        y.h(messageDigest);
        byte[] digest = messageDigest.digest(oVar.f718g);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b9 : digest) {
            char[] cArr2 = K4.b.f4294b;
            cArr[i10] = cArr2[(b9 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b9 & 15];
            i10 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z9 + ", ver=12451000.false";
    }
}
