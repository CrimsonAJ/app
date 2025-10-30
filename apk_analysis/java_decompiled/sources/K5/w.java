package K5;

import P.Q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f4418a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f4419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f4420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i9, String[] strArr) {
        super(context, i9, strArr);
        this.f4420c = xVar;
        a();
    }

    public final void a() {
        boolean z9;
        ColorStateList colorStateList;
        x xVar = this.f4420c;
        ColorStateList colorStateList2 = xVar.f4427l;
        if (colorStateList2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z9) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f4419b = colorStateList;
        if (xVar.f4426k != 0 && xVar.f4427l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{H.a.f(xVar.f4427l.getColorForState(iArr3, 0), xVar.f4426k), H.a.f(xVar.f4427l.getColorForState(iArr2, 0), xVar.f4426k), xVar.f4426k});
        }
        this.f4418a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i9, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f4420c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f4426k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f4426k);
                if (this.f4419b != null) {
                    colorDrawable.setTintList(this.f4418a);
                    drawable = new RippleDrawable(this.f4419b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = Q.f5546a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
