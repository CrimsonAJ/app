package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1320f {

    /* renamed from: a, reason: collision with root package name */
    public final C1316b f18069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18070b;

    public C1320f(Context context) {
        this(context, DialogInterfaceC1321g.f(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC1321g create() {
        int i9;
        C1316b c1316b = this.f18069a;
        DialogInterfaceC1321g dialogInterfaceC1321g = new DialogInterfaceC1321g(c1316b.f18023a, this.f18070b);
        View view = c1316b.f18027e;
        C1319e c1319e = dialogInterfaceC1321g.f18071f;
        if (view != null) {
            c1319e.f18064v = view;
        } else {
            CharSequence charSequence = c1316b.f18026d;
            if (charSequence != null) {
                c1319e.f18047d = charSequence;
                TextView textView = c1319e.f18062t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1316b.f18025c;
            if (drawable != null) {
                c1319e.f18060r = drawable;
                ImageView imageView = c1319e.f18061s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1319e.f18061s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c1316b.f18028f;
        if (charSequence2 != null) {
            c1319e.c(-1, charSequence2, c1316b.f18029g);
        }
        CharSequence charSequence3 = c1316b.f18030h;
        if (charSequence3 != null) {
            c1319e.c(-2, charSequence3, c1316b.f18031i);
        }
        if (c1316b.f18032k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1316b.f18024b.inflate(c1319e.f18068z, (ViewGroup) null);
            if (c1316b.f18035n) {
                i9 = c1319e.f18039A;
            } else {
                i9 = c1319e.f18040B;
            }
            Object obj = c1316b.f18032k;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new ArrayAdapter(c1316b.f18023a, i9, R.id.text1, (Object[]) null);
            }
            c1319e.f18065w = r82;
            c1319e.f18066x = c1316b.f18036o;
            if (c1316b.f18033l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1315a(c1316b, c1319e));
            }
            if (c1316b.f18035n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1319e.f18048e = alertController$RecycleListView;
        }
        View view2 = c1316b.f18034m;
        if (view2 != null) {
            c1319e.f18049f = view2;
            c1319e.f18050g = false;
        }
        dialogInterfaceC1321g.setCancelable(true);
        dialogInterfaceC1321g.setCanceledOnTouchOutside(true);
        dialogInterfaceC1321g.setOnCancelListener(null);
        dialogInterfaceC1321g.setOnDismissListener(null);
        o.m mVar = c1316b.j;
        if (mVar != null) {
            dialogInterfaceC1321g.setOnKeyListener(mVar);
        }
        return dialogInterfaceC1321g;
    }

    public Context getContext() {
        return this.f18069a.f18023a;
    }

    public C1320f setNegativeButton(int i9, DialogInterface.OnClickListener onClickListener) {
        C1316b c1316b = this.f18069a;
        c1316b.f18030h = c1316b.f18023a.getText(i9);
        c1316b.f18031i = onClickListener;
        return this;
    }

    public C1320f setPositiveButton(int i9, DialogInterface.OnClickListener onClickListener) {
        C1316b c1316b = this.f18069a;
        c1316b.f18028f = c1316b.f18023a.getText(i9);
        c1316b.f18029g = onClickListener;
        return this;
    }

    public C1320f setTitle(CharSequence charSequence) {
        this.f18069a.f18026d = charSequence;
        return this;
    }

    public C1320f setView(View view) {
        this.f18069a.f18034m = view;
        return this;
    }

    public C1320f(Context context, int i9) {
        this.f18069a = new C1316b(new ContextThemeWrapper(context, DialogInterfaceC1321g.f(context, i9)));
        this.f18070b = i9;
    }
}
