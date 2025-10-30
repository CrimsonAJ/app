package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new x(2);

    /* renamed from: b, reason: collision with root package name */
    public final Object f9272b;

    /* renamed from: c, reason: collision with root package name */
    public d f9273c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9271a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Z0.d f9274d = null;

    public MediaSessionCompat$Token(Object obj, s sVar) {
        this.f9272b = obj;
        this.f9273c = sVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f9271a) {
            dVar = this.f9273c;
        }
        return dVar;
    }

    public final void d(d dVar) {
        synchronized (this.f9271a) {
            this.f9273c = dVar;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f9272b;
        if (obj2 == null) {
            if (mediaSessionCompat$Token.f9272b == null) {
                return true;
            }
            return false;
        }
        Object obj3 = mediaSessionCompat$Token.f9272b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final void f(Z0.d dVar) {
        synchronized (this.f9271a) {
            this.f9274d = dVar;
        }
    }

    public final int hashCode() {
        Object obj = this.f9272b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable((Parcelable) this.f9272b, i9);
    }
}
