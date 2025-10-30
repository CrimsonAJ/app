package N1;

import android.os.Bundle;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.k0;
import c2.C0758d;
import c2.C0766l;
import co.notix.R;
import com.anilab.android.ui.changePassword.ChangePasswordFragment;
import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.editProfile.EditProfileFragment;
import com.anilab.android.ui.filter.FilterFragment;
import com.anilab.android.ui.helpCenter.HelpCenterFragment;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.android.ui.loginWithEmail.LoginWithEmailFragment;
import com.anilab.android.ui.main.HostFragment;
import com.anilab.android.ui.mal.MalSyncFragment;
import com.anilab.android.ui.movieDetail.FullDetailDialog;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i9, Object obj) {
        super(0);
        this.f4867d = i9;
        this.f4868e = obj;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f4867d) {
            case 0:
                return (k0) ((q) this.f4868e).invoke();
            case 1:
                return (ChangePasswordFragment) this.f4868e;
            case 2:
                return (k0) ((r) this.f4868e).invoke();
            case 3:
                return (CommentListFragment) this.f4868e;
            case 4:
                return (k0) ((r) this.f4868e).invoke();
            case 5:
                return (k0) ((R1.r) this.f4868e).invoke();
            case 6:
                return (EditProfileFragment) this.f4868e;
            case 7:
                return (k0) ((r) this.f4868e).invoke();
            case 8:
                return (k0) ((T1.j) this.f4868e).invoke();
            case 9:
                return (k0) ((T1.y) this.f4868e).invoke();
            case R.styleable.GradientColor_android_endX /* 10 */:
                return (FilterFragment) this.f4868e;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return (k0) ((r) this.f4868e).invoke();
            case 12:
                return (k0) ((V1.j) this.f4868e).invoke();
            case 13:
                return (HelpCenterFragment) this.f4868e;
            case 14:
                return (k0) ((r) this.f4868e).invoke();
            case 15:
                return (HomeFragment) this.f4868e;
            case 16:
                return (k0) ((r) this.f4868e).invoke();
            case 17:
                return (k0) ((Y1.e) this.f4868e).invoke();
            case 18:
                return (LoginWithEmailFragment) this.f4868e;
            case 19:
                return (k0) ((r) this.f4868e).invoke();
            case 20:
                return (k0) ((a2.h) this.f4868e).invoke();
            case 21:
                return (a0) new android.support.v4.media.session.y((k0) this.f4868e, new X(0)).K(a0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 22:
                return (HostFragment) this.f4868e;
            case 23:
                return (k0) ((r) this.f4868e).invoke();
            case 24:
                return ((C0758d) this.f4868e).f11611b.Y();
            case 25:
                return ((C0766l) ((B2.i) this.f4868e).f630b).Y();
            case 26:
                return (MalSyncFragment) this.f4868e;
            case 27:
                return (k0) ((r) this.f4868e).invoke();
            default:
                FullDetailDialog fullDetailDialog = (FullDetailDialog) this.f4868e;
                Bundle bundle = fullDetailDialog.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + fullDetailDialog + " has null arguments");
        }
    }
}
