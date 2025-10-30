package l4;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public Message f20546a;

    public final void a() {
        this.f20546a = null;
        ArrayList arrayList = w.f20547b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f20546a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
