package i;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import co.notix.R;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC1321g extends y implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C1319e f18071f;

    public DialogInterfaceC1321g(ContextThemeWrapper contextThemeWrapper, int i9) {
        super(contextThemeWrapper, f(contextThemeWrapper, i9));
        this.f18071f = new C1319e(getContext(), this, getWindow());
    }

    public static int f(Context context, int i9) {
        if (((i9 >>> 24) & 255) >= 1) {
            return i9;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02be  */
    @Override // i.y, d.DialogC1072m, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.DialogInterfaceC1321g.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f18071f.f18059q;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f18071f.f18059q;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // i.y, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C1319e c1319e = this.f18071f;
        c1319e.f18047d = charSequence;
        TextView textView = c1319e.f18062t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
