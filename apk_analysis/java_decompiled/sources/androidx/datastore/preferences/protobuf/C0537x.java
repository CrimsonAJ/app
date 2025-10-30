package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0537x extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9767a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.x] */
    public static C0537x a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.w] */
    public static C0536w b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.x] */
    public static C0537x c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.x] */
    public static C0537x d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.x] */
    public static C0537x e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
