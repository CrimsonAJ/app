package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new x(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f9280a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9281b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9282c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9283d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9284e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9285f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f9286g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9287h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9288i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f9289k;

    /* renamed from: l, reason: collision with root package name */
    public PlaybackState f9290l;

    public PlaybackStateCompat(int i9, long j, long j4, float f9, long j9, int i10, CharSequence charSequence, long j10, ArrayList arrayList, long j11, Bundle bundle) {
        this.f9280a = i9;
        this.f9281b = j;
        this.f9282c = j4;
        this.f9283d = f9;
        this.f9284e = j9;
        this.f9285f = i10;
        this.f9286g = charSequence;
        this.f9287h = j10;
        this.f9288i = new ArrayList(arrayList);
        this.j = j11;
        this.f9289k = bundle;
    }

    public static PlaybackStateCompat a(PlaybackState playbackState) {
        ArrayList arrayList;
        CustomAction customAction;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> j = z.j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            for (PlaybackState.CustomAction customAction2 : j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l9 = z.l(customAction3);
                    y.E(l9);
                    customAction = new CustomAction(z.f(customAction3), z.o(customAction3), z.m(customAction3), l9);
                    customAction.f9295e = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a5 = A.a(playbackState);
        y.E(a5);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(z.r(playbackState), z.q(playbackState), z.i(playbackState), z.p(playbackState), z.g(playbackState), 0, z.k(playbackState), z.n(playbackState), arrayList, z.h(playbackState), a5);
        playbackStateCompat.f9290l = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f9280a);
        sb.append(", position=");
        sb.append(this.f9281b);
        sb.append(", buffered position=");
        sb.append(this.f9282c);
        sb.append(", speed=");
        sb.append(this.f9283d);
        sb.append(", updated=");
        sb.append(this.f9287h);
        sb.append(", actions=");
        sb.append(this.f9284e);
        sb.append(", error code=");
        sb.append(this.f9285f);
        sb.append(", error message=");
        sb.append(this.f9286g);
        sb.append(", custom actions=");
        sb.append(this.f9288i);
        sb.append(", active item id=");
        return A0.a.o(sb, this.j, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f9280a);
        parcel.writeLong(this.f9281b);
        parcel.writeFloat(this.f9283d);
        parcel.writeLong(this.f9287h);
        parcel.writeLong(this.f9282c);
        parcel.writeLong(this.f9284e);
        TextUtils.writeToParcel(this.f9286g, parcel, i9);
        parcel.writeTypedList(this.f9288i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.f9289k);
        parcel.writeInt(this.f9285f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final String f9291a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f9292b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9293c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f9294d;

        /* renamed from: e, reason: collision with root package name */
        public PlaybackState.CustomAction f9295e;

        public CustomAction(String str, CharSequence charSequence, int i9, Bundle bundle) {
            this.f9291a = str;
            this.f9292b = charSequence;
            this.f9293c = i9;
            this.f9294d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f9292b) + ", mIcon=" + this.f9293c + ", mExtras=" + this.f9294d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i9) {
            parcel.writeString(this.f9291a);
            TextUtils.writeToParcel(this.f9292b, parcel, i9);
            parcel.writeInt(this.f9293c);
            parcel.writeBundle(this.f9294d);
        }

        public CustomAction(Parcel parcel) {
            this.f9291a = parcel.readString();
            this.f9292b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9293c = parcel.readInt();
            this.f9294d = parcel.readBundle(y.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f9280a = parcel.readInt();
        this.f9281b = parcel.readLong();
        this.f9283d = parcel.readFloat();
        this.f9287h = parcel.readLong();
        this.f9282c = parcel.readLong();
        this.f9284e = parcel.readLong();
        this.f9286g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9288i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.f9289k = parcel.readBundle(y.class.getClassLoader());
        this.f9285f = parcel.readInt();
    }
}
