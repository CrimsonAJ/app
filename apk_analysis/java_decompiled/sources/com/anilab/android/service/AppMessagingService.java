package com.anilab.android.service;

import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class AppMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a9  */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, l1.g] */
    /* JADX WARN: Type inference failed for: r6v22, types: [D.j, D.n, java.lang.Object] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(com.google.firebase.messaging.r r14) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anilab.android.service.AppMessagingService.onMessageReceived(com.google.firebase.messaging.r):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String token) {
        h.e(token, "token");
    }
}
