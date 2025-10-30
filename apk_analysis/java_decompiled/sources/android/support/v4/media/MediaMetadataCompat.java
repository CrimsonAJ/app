package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Log;
import s.C1935e;
import s.C1939i;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final C1935e f9249d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f9250e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f9251f;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f9252g;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f9253a;

    /* renamed from: b, reason: collision with root package name */
    public MediaMetadata f9254b;

    /* renamed from: c, reason: collision with root package name */
    public MediaDescriptionCompat f9255c;

    /* JADX WARN: Type inference failed for: r0v0, types: [s.e, s.i] */
    static {
        ?? c1939i = new C1939i(0);
        f9249d = c1939i;
        c1939i.put("android.media.metadata.TITLE", 1);
        c1939i.put("android.media.metadata.ARTIST", 1);
        c1939i.put("android.media.metadata.DURATION", 0);
        c1939i.put("android.media.metadata.ALBUM", 1);
        c1939i.put("android.media.metadata.AUTHOR", 1);
        c1939i.put("android.media.metadata.WRITER", 1);
        c1939i.put("android.media.metadata.COMPOSER", 1);
        c1939i.put("android.media.metadata.COMPILATION", 1);
        c1939i.put("android.media.metadata.DATE", 1);
        c1939i.put("android.media.metadata.YEAR", 0);
        c1939i.put("android.media.metadata.GENRE", 1);
        c1939i.put("android.media.metadata.TRACK_NUMBER", 0);
        c1939i.put("android.media.metadata.NUM_TRACKS", 0);
        c1939i.put("android.media.metadata.DISC_NUMBER", 0);
        c1939i.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1939i.put("android.media.metadata.ART", 2);
        c1939i.put("android.media.metadata.ART_URI", 1);
        c1939i.put("android.media.metadata.ALBUM_ART", 2);
        c1939i.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1939i.put("android.media.metadata.USER_RATING", 3);
        c1939i.put("android.media.metadata.RATING", 3);
        c1939i.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1939i.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1939i.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1939i.put("android.media.metadata.DISPLAY_ICON", 2);
        c1939i.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1939i.put("android.media.metadata.MEDIA_ID", 1);
        c1939i.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1939i.put("android.media.metadata.MEDIA_URI", 1);
        c1939i.put("android.media.metadata.ADVERTISEMENT", 0);
        c1939i.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f9250e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f9251f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f9252g = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a(2);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f9253a = bundle2;
        y.E(bundle2);
    }

    public final MediaDescriptionCompat a() {
        String str;
        Bitmap bitmap;
        Uri uri;
        String str2;
        Uri uri2;
        Bundle bundle;
        String str3;
        MediaDescriptionCompat mediaDescriptionCompat = this.f9255c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        Bundle bundle2 = this.f9253a;
        CharSequence charSequence = bundle2.getCharSequence("android.media.metadata.MEDIA_ID");
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence2 = bundle2.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(charSequence2)) {
            charSequenceArr[0] = charSequence2;
            charSequenceArr[1] = bundle2.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle2.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i9 = 0;
            int i10 = 0;
            while (i9 < 3) {
                String[] strArr = f9250e;
                if (i10 >= strArr.length) {
                    break;
                }
                int i11 = i10 + 1;
                CharSequence charSequence3 = bundle2.getCharSequence(strArr[i10]);
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequenceArr[i9] = charSequence3;
                    i9++;
                }
                i10 = i11;
            }
        }
        int i12 = 0;
        while (true) {
            String[] strArr2 = f9251f;
            if (i12 < strArr2.length) {
                try {
                    bitmap = (Bitmap) bundle2.getParcelable(strArr2[i12]);
                } catch (Exception e8) {
                    Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e8);
                    bitmap = null;
                }
                if (bitmap != null) {
                    break;
                }
                i12++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i13 = 0;
        while (true) {
            String[] strArr3 = f9252g;
            if (i13 < strArr3.length) {
                CharSequence charSequence4 = bundle2.getCharSequence(strArr3[i13]);
                if (charSequence4 != null) {
                    str3 = charSequence4.toString();
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    uri = Uri.parse(str3);
                    break;
                }
                i13++;
            } else {
                uri = null;
                break;
            }
        }
        CharSequence charSequence5 = bundle2.getCharSequence("android.media.metadata.MEDIA_URI");
        if (charSequence5 != null) {
            str2 = charSequence5.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            uri2 = Uri.parse(str2);
        } else {
            uri2 = null;
        }
        CharSequence charSequence6 = charSequenceArr[0];
        CharSequence charSequence7 = charSequenceArr[1];
        CharSequence charSequence8 = charSequenceArr[2];
        Bundle bundle3 = new Bundle();
        if (bundle2.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle3.putLong("android.media.extra.BT_FOLDER_TYPE", bundle2.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle2.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle3.putLong("android.media.extra.DOWNLOAD_STATUS", bundle2.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        if (!bundle3.isEmpty()) {
            bundle = bundle3;
        } else {
            bundle = null;
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(str, charSequence6, charSequence7, charSequence8, bitmap, uri, bundle, uri2);
        this.f9255c = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeBundle(this.f9253a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f9253a = parcel.readBundle(y.class.getClassLoader());
    }
}
