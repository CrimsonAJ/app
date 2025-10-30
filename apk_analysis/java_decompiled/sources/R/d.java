package R;

import C3.v;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import s4.i;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, v vVar) {
        super(inputConnection, false);
        this.f6461a = vVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        i iVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            iVar = new i(new f(inputContentInfo));
        }
        if (this.f6461a.e(iVar, i9, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i9, bundle);
    }
}
