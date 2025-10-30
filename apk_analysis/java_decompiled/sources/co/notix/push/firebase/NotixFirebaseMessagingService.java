package co.notix.push.firebase;

import Y7.B;
import Y7.InterfaceC0484z;
import co.notix.Cif;
import co.notix.pg;
import co.notix.qg;
import co.notix.ra;
import co.notix.wq;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.r;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class NotixFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0484z f12999a = wq.f().b();

    /* renamed from: b, reason: collision with root package name */
    public final ra f13000b = wq.h();

    /* renamed from: c, reason: collision with root package name */
    public final Cif f13001c = wq.n();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(r message) {
        h.e(message, "message");
        B.r(this.f12999a, null, new pg(message, this, null), 3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        h.e(token, "token");
        B.r(this.f12999a, null, new qg(this, token, null), 3);
    }
}
