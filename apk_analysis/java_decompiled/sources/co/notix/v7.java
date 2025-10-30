package co.notix;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public final class v7 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f13339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(c8 c8Var, String str, String str2) {
        super(1);
        this.f13339a = c8Var;
        this.f13340b = str;
        this.f13341c = str2;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        c8 c8Var = this.f13339a;
        String str = this.f13340b;
        String str2 = this.f13341c;
        fb fbVar = c8.f11988f;
        c8Var.getClass();
        InputStream openStream = new URL(str).openStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openStream.read(bArr);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        openStream.close();
                        return A7.n.f558a;
                    }
                }
            } finally {
            }
        } finally {
        }
    }
}
