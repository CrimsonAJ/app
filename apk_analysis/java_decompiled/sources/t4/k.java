package t4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b5.G1;
import i5.C1381b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z4.AbstractC2247a;

/* loaded from: classes.dex */
public final class k extends G4.a {

    /* renamed from: e, reason: collision with root package name */
    public static final G1 f23196e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23197a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f23198b;

    /* renamed from: c, reason: collision with root package name */
    public int f23199c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f23195d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<k> CREATOR = new C1381b(20);

    static {
        G1 g12 = new G1(27);
        g12.B("com.google.android.gms.cast.metadata.CREATION_DATE", 4, "creationDateTime");
        g12.B("com.google.android.gms.cast.metadata.RELEASE_DATE", 4, "releaseDate");
        g12.B("com.google.android.gms.cast.metadata.BROADCAST_DATE", 4, "originalAirdate");
        g12.B("com.google.android.gms.cast.metadata.TITLE", 1, "title");
        g12.B("com.google.android.gms.cast.metadata.SUBTITLE", 1, "subtitle");
        g12.B("com.google.android.gms.cast.metadata.ARTIST", 1, "artist");
        g12.B("com.google.android.gms.cast.metadata.ALBUM_ARTIST", 1, "albumArtist");
        g12.B("com.google.android.gms.cast.metadata.ALBUM_TITLE", 1, "albumName");
        g12.B("com.google.android.gms.cast.metadata.COMPOSER", 1, "composer");
        g12.B("com.google.android.gms.cast.metadata.DISC_NUMBER", 2, "discNumber");
        g12.B("com.google.android.gms.cast.metadata.TRACK_NUMBER", 2, "trackNumber");
        g12.B("com.google.android.gms.cast.metadata.SEASON_NUMBER", 2, "season");
        g12.B("com.google.android.gms.cast.metadata.EPISODE_NUMBER", 2, "episode");
        g12.B("com.google.android.gms.cast.metadata.SERIES_TITLE", 1, "seriesTitle");
        g12.B("com.google.android.gms.cast.metadata.STUDIO", 1, "studio");
        g12.B("com.google.android.gms.cast.metadata.WIDTH", 2, "width");
        g12.B("com.google.android.gms.cast.metadata.HEIGHT", 2, "height");
        g12.B("com.google.android.gms.cast.metadata.LOCATION_NAME", 1, "location");
        g12.B("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", 3, "latitude");
        g12.B("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", 3, "longitude");
        g12.B("com.google.android.gms.cast.metadata.SECTION_DURATION", 5, "sectionDuration");
        g12.B("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", 5, "sectionStartTimeInMedia");
        g12.B("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", 5, "sectionStartAbsoluteTime");
        g12.B("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", 5, "sectionStartTimeInContainer");
        g12.B("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", 2, "queueItemId");
        g12.B("com.google.android.gms.cast.metadata.BOOK_TITLE", 1, "bookTitle");
        g12.B("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", 2, "chapterNumber");
        g12.B("com.google.android.gms.cast.metadata.CHAPTER_TITLE", 1, "chapterTitle");
        f23196e = g12;
    }

    public k(ArrayList arrayList, Bundle bundle, int i9) {
        this.f23197a = arrayList;
        this.f23198b = bundle;
        this.f23199c = i9;
    }

    public static void i(int i9, String str) {
        int i10;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) f23196e.f10719d).get(str);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 != i9 && i10 != 0) {
                throw new IllegalArgumentException("Value for " + str + " must be a " + f23195d[i9]);
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public static boolean p(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || p((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (p(this.f23198b, kVar.f23198b) && this.f23197a.equals(kVar.f23197a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final String f(String str) {
        i(1, str);
        return this.f23198b.getString(str);
    }

    public final void g(String str, String str2) {
        i(1, str);
        this.f23198b.putString(str, str2);
    }

    public final int hashCode() {
        int i9;
        int i10 = 17;
        Bundle bundle = this.f23198b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                int i11 = i10 * 31;
                if (obj != null) {
                    i9 = obj.hashCode();
                } else {
                    i9 = 0;
                }
                i10 = i11 + i9;
            }
        }
        return this.f23197a.hashCode() + (i10 * 31);
    }

    public final JSONObject k() {
        Bundle bundle;
        int i9;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f23199c);
        } catch (JSONException unused) {
        }
        JSONArray b9 = AbstractC2247a.b(this.f23197a);
        if (b9.length() != 0) {
            try {
                jSONObject.put("images", b9);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.f23199c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                bundle = this.f23198b;
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    G1 g12 = f23196e;
                    String str2 = (String) ((HashMap) g12.f10717b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) g12.f10719d).get(str);
                        if (num != null) {
                            i9 = num.intValue();
                        } else {
                            i9 = 0;
                        }
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 != 4) {
                                        if (i9 == 5) {
                                            long j = bundle.getLong(str);
                                            Pattern pattern = y4.a.f24915a;
                                            jSONObject.put(str2, j / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void o(JSONObject jSONObject) {
        HashSet hashSet;
        int i9;
        Bundle bundle = this.f23198b;
        bundle.clear();
        ArrayList arrayList = this.f23197a;
        arrayList.clear();
        int i10 = 0;
        this.f23199c = 0;
        try {
            this.f23199c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            AbstractC2247a.c(arrayList, optJSONArray);
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f23199c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList2);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    G1 g12 = f23196e;
                    String str = (String) ((HashMap) g12.f10718c).get(next);
                    if (str != null) {
                        if (hashSet2.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) g12.f10719d).get(str);
                                    if (num != null) {
                                        i9 = num.intValue();
                                    } else {
                                        i9 = i10;
                                    }
                                    if (i9 != 1) {
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                if (i9 != 4) {
                                                    if (i9 == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = y4.a.f24915a;
                                                        hashSet = hashSet2;
                                                        try {
                                                            bundle.putLong(str, optLong * 1000);
                                                        } catch (JSONException unused2) {
                                                        }
                                                    }
                                                } else {
                                                    hashSet = hashSet2;
                                                    if (obj instanceof String) {
                                                        String str2 = (String) obj;
                                                        if (AbstractC2247a.a(str2) != null) {
                                                            bundle.putString(str, str2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                            if (obj instanceof Integer) {
                                                bundle.putInt(str, ((Integer) obj).intValue());
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        if (obj instanceof String) {
                                            bundle.putString(str, (String) obj);
                                        }
                                    }
                                }
                            } catch (JSONException unused3) {
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                    hashSet2 = hashSet;
                    i10 = 0;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.P(parcel, 2, this.f23197a);
        s8.n.F(parcel, 3, this.f23198b);
        int i10 = this.f23199c;
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(i10);
        s8.n.U(parcel, R2);
    }

    public k(int i9) {
        this(new ArrayList(), new Bundle(), i9);
    }
}
