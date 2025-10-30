package M1;

import android.content.Intent;
import android.net.Uri;
import com.anilab.android.ui.activity.MainActivity;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4757a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4759c;

    public w(H2.t tVar, MainActivity mainActivity) {
        this.f4758b = tVar;
        this.f4759c = mainActivity;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f4757a) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(((H2.t) this.f4758b).f3064h));
                    ((MainActivity) this.f4759c).startActivity(intent);
                } catch (Exception unused) {
                }
                return A7.n.f558a;
            default:
                q8.n nVar = (q8.n) this.f4759c;
                q8.r rVar = (q8.r) this.f4758b;
                try {
                    if (!rVar.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                    } while (rVar.a(false, this));
                    nVar.a(1, 9, null);
                } catch (IOException e8) {
                    nVar.a(2, 2, e8);
                } catch (Throwable th) {
                    nVar.a(3, 3, null);
                    k8.c.d(rVar);
                    throw th;
                }
                k8.c.d(rVar);
                return A7.n.f558a;
        }
    }

    public w(q8.n nVar, q8.r rVar) {
        this.f4759c = nVar;
        this.f4758b = rVar;
    }
}
