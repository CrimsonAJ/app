package i;

import Q2.U;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import co.notix.R;
import h.AbstractC1260a;
import java.lang.ref.WeakReference;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319e {

    /* renamed from: A, reason: collision with root package name */
    public final int f18039A;

    /* renamed from: B, reason: collision with root package name */
    public final int f18040B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f18041C;

    /* renamed from: D, reason: collision with root package name */
    public final HandlerC1317c f18042D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18044a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1321g f18045b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f18046c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f18047d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f18048e;

    /* renamed from: f, reason: collision with root package name */
    public View f18049f;

    /* renamed from: h, reason: collision with root package name */
    public Button f18051h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f18052i;
    public Message j;

    /* renamed from: k, reason: collision with root package name */
    public Button f18053k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f18054l;

    /* renamed from: m, reason: collision with root package name */
    public Message f18055m;

    /* renamed from: n, reason: collision with root package name */
    public Button f18056n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f18057o;

    /* renamed from: p, reason: collision with root package name */
    public Message f18058p;

    /* renamed from: q, reason: collision with root package name */
    public NestedScrollView f18059q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f18060r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f18061s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f18062t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f18063u;

    /* renamed from: v, reason: collision with root package name */
    public View f18064v;

    /* renamed from: w, reason: collision with root package name */
    public ListAdapter f18065w;

    /* renamed from: y, reason: collision with root package name */
    public final int f18067y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18068z;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18050g = false;

    /* renamed from: x, reason: collision with root package name */
    public int f18066x = -1;

    /* renamed from: E, reason: collision with root package name */
    public final U f18043E = new U(2, this);

    public C1319e(Context context, DialogInterfaceC1321g dialogInterfaceC1321g, Window window) {
        this.f18044a = context;
        this.f18045b = dialogInterfaceC1321g;
        this.f18046c = window;
        HandlerC1317c handlerC1317c = new HandlerC1317c();
        handlerC1317c.f18038b = new WeakReference(dialogInterfaceC1321g);
        this.f18042D = handlerC1317c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1260a.f17809e, R.attr.alertDialogStyle, 0);
        this.f18067y = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f18068z = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f18039A = obtainStyledAttributes.getResourceId(7, 0);
        this.f18040B = obtainStyledAttributes.getResourceId(3, 0);
        this.f18041C = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC1321g.d().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i9, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.f18042D.obtainMessage(i9, onClickListener);
        } else {
            message = null;
        }
        if (i9 != -3) {
            if (i9 != -2) {
                if (i9 == -1) {
                    this.f18052i = charSequence;
                    this.j = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f18054l = charSequence;
            this.f18055m = message;
            return;
        }
        this.f18057o = charSequence;
        this.f18058p = message;
    }
}
