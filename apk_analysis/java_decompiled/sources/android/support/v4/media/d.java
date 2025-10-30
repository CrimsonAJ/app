package android.support.v4.media;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import s.C1935e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f9259a;

    public d(Bundle bundle) {
        if (bundle != null) {
            this.f9259a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static boolean k(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String n(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public boolean a(String str) {
        String i9 = i(str);
        if (!"1".equals(i9) && !Boolean.parseBoolean(i9)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String i9 = i(str);
        if (!TextUtils.isEmpty(i9)) {
            try {
                return Integer.valueOf(Integer.parseInt(i9));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + n(str) + "(" + i9 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        String i9 = i(str);
        if (!TextUtils.isEmpty(i9)) {
            try {
                return new JSONArray(i9);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + n(str) + ": " + i9 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public int[] d() {
        JSONArray c3 = c("gcm.n.light_settings");
        if (c3 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c3.length() == 3) {
                int parseColor = Color.parseColor(c3.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = c3.optInt(1);
                    iArr[2] = c3.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e8) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c3 + ". " + e8.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c3 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] e(String str) {
        JSONArray c3 = c(str.concat("_loc_args"));
        if (c3 == null) {
            return null;
        }
        int length = c3.length();
        String[] strArr = new String[length];
        for (int i9 = 0; i9 < length; i9++) {
            strArr[i9] = c3.optString(i9);
        }
        return strArr;
    }

    public String f(String str) {
        return i(str.concat("_loc_key"));
    }

    public Long g() {
        String i9 = i("gcm.n.event_time");
        if (!TextUtils.isEmpty(i9)) {
            try {
                return Long.valueOf(Long.parseLong(i9));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + n("gcm.n.event_time") + "(" + i9 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String h(Resources resources, String str, String str2) {
        String i9 = i(str2);
        if (!TextUtils.isEmpty(i9)) {
            return i9;
        }
        String f9 = f(str2);
        if (!TextUtils.isEmpty(f9)) {
            int identifier = resources.getIdentifier(f9, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", n(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] e8 = e(str2);
            if (e8 == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, e8);
            } catch (MissingFormatArgumentException e9) {
                Log.w("NotificationParams", "Missing format argument for " + n(str2) + ": " + Arrays.toString(e8) + " Default value will be used.", e9);
            }
        }
        return null;
    }

    public String i(String str) {
        String replace;
        Bundle bundle = this.f9259a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] j() {
        JSONArray c3 = c("gcm.n.vibrate_timings");
        if (c3 == null) {
            return null;
        }
        try {
            if (c3.length() > 1) {
                int length = c3.length();
                long[] jArr = new long[length];
                for (int i9 = 0; i9 < length; i9++) {
                    jArr[i9] = c3.optLong(i9);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c3 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle l() {
        Bundle bundle = this.f9259a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void m(String str, String str2) {
        C1935e c1935e = MediaMetadataCompat.f9249d;
        if (c1935e.containsKey(str) && ((Integer) c1935e.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(A0.a.n("The ", str, " key cannot be used to put a String"));
        }
        this.f9259a.putCharSequence(str, str2);
    }

    public d() {
        this.f9259a = new Bundle();
    }

    public d(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.f9253a);
        this.f9259a = bundle;
        y.E(bundle);
    }
}
