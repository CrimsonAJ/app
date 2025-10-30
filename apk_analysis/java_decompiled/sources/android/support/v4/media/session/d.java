package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public interface d extends IInterface {
    void A(RatingCompat ratingCompat);

    void B0(long j);

    void C0(String str, Bundle bundle);

    void D(Uri uri, Bundle bundle);

    void E0(int i9, int i10);

    void F(MediaDescriptionCompat mediaDescriptionCompat);

    ParcelableVolumeInfo F0();

    boolean G();

    void H0();

    void I(MediaDescriptionCompat mediaDescriptionCompat);

    Bundle I0();

    PendingIntent J();

    void K0(Uri uri, Bundle bundle);

    void L();

    void M(int i9);

    void N();

    void N0(long j);

    void O0(int i9);

    void P(String str, Bundle bundle);

    void R();

    String S0();

    void Y0(float f9);

    void Z();

    void b();

    void b0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void d0();

    boolean d1(KeyEvent keyEvent);

    PlaybackStateCompat e();

    void e0(int i9, int i10);

    void g0();

    void h(int i9);

    long i();

    void j();

    CharSequence j0();

    void n0();

    void next();

    MediaMetadataCompat o0();

    void p0(String str, Bundle bundle);

    void previous();

    void q(String str, Bundle bundle);

    Bundle q0();

    void r(InterfaceC0513b interfaceC0513b);

    void r0(InterfaceC0513b interfaceC0513b);

    void s(RatingCompat ratingCompat, Bundle bundle);

    void stop();

    void u(MediaDescriptionCompat mediaDescriptionCompat, int i9);

    void w0(String str, Bundle bundle);

    String x();

    void z(boolean z9);
}
