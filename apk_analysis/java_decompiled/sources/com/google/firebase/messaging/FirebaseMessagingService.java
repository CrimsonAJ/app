package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends h {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private A4.b rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.h
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) s.i().f16507e).poll();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x00bf. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    @Override // com.google.firebase.messaging.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleIntent(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleIntent(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(r rVar) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(A4.b bVar) {
        this.rpc = bVar;
    }
}
