package F4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import co.notix.R;
import java.util.Locale;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C1939i f2434a = new C1939i(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f2435b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = M4.c.a(context).f4790a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i9) {
        Resources resources = context.getResources();
        String a5 = a(context);
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        if (i9 != 7) {
                            if (i9 != 9) {
                                if (i9 != 20) {
                                    switch (i9) {
                                        case 16:
                                            return d(context, "common_google_play_services_api_unavailable_text", a5);
                                        case 17:
                                            return d(context, "common_google_play_services_sign_in_failed_text", a5);
                                        case 18:
                                            return resources.getString(R.string.common_google_play_services_updating_text, a5);
                                        default:
                                            return resources.getString(R.string.common_google_play_services_unknown_issue, a5);
                                    }
                                }
                                return d(context, "common_google_play_services_restricted_profile_text", a5);
                            }
                            return resources.getString(R.string.common_google_play_services_unsupported_text, a5);
                        }
                        return d(context, "common_google_play_services_network_error_text", a5);
                    }
                    return d(context, "common_google_play_services_invalid_account_text", a5);
                }
                return resources.getString(R.string.common_google_play_services_enable_text, a5);
            }
            if (K4.b.f(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(R.string.common_google_play_services_update_text, a5);
        }
        return resources.getString(R.string.common_google_play_services_install_text, a5);
    }

    public static String c(Context context, int i9) {
        Resources resources = context.getResources();
        switch (i9) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case R.styleable.GradientColor_android_endX /* 10 */:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case R.styleable.GradientColor_android_endY /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i9);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e8 = e(context, str);
        if (e8 == null) {
            e8 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e8, str2);
    }

    public static String e(Context context, String str) {
        L.g a5;
        Resources resources;
        C1939i c1939i = f2434a;
        synchronized (c1939i) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (Build.VERSION.SDK_INT >= 24) {
                    a5 = new L.g(new L.j(L.d.d(configuration)));
                } else {
                    a5 = L.g.a(configuration.locale);
                }
                Locale locale = a5.f4447a.get(0);
                if (!locale.equals(f2435b)) {
                    c1939i.clear();
                    f2435b = locale;
                }
                String str2 = (String) c1939i.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i9 = B4.h.f702e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                        } else {
                            f2434a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
