package R;

import C3.v;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import s4.i;

/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, v vVar) {
        super(inputConnection, false);
        this.f6462a = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Object[] objArr;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        v vVar = this.f6462a;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                objArr = true;
            }
            if (objArr != false) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (objArr != false) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                try {
                    Uri uri = (Uri) bundle.getParcelable(str3);
                    if (objArr != false) {
                        str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    } else {
                        str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                    if (objArr != false) {
                        str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    } else {
                        str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    Uri uri2 = (Uri) bundle.getParcelable(str5);
                    if (objArr != false) {
                        str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    } else {
                        str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    int i9 = bundle.getInt(str6);
                    if (objArr != false) {
                        str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    } else {
                        str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                    if (uri != null && clipDescription != null) {
                        z9 = vVar.e(new i(uri, clipDescription, uri2), i9, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(z9 ? 1 : 0, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        if (z9) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
