.class public interface abstract Lco/notix/lsi/NotixLockScreenInterstitialAd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$INSTANCE:Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;

    sput-object v0, Lco/notix/lsi/NotixLockScreenInterstitialAd;->Companion:Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;

    return-void
.end method


# virtual methods
.method public abstract cancel()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation
.end method

.method public abstract schedule(J)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation
.end method

.method public abstract schedule(JLco/notix/lsi/LsiInterval;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation
.end method

.method public abstract setCallbacks(Lco/notix/lsi/LockScreenInterstitialCallback;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation
.end method
