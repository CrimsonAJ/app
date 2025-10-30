.class public final Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/lsi/NotixLockScreenInterstitialAd;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/lsi/NotixLockScreenInterstitialAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/wg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;

    invoke-direct {v0}, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;-><init>()V

    sput-object v0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$INSTANCE:Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->u()Lco/notix/wg;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$delegate_0:Lco/notix/wg;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation

    iget-object v0, p0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$delegate_0:Lco/notix/wg;

    invoke-virtual {v0}, Lco/notix/wg;->cancel()V

    return-void
.end method

.method public schedule(J)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation

    iget-object v0, p0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$delegate_0:Lco/notix/wg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    sget-object v1, Lco/notix/lsi/LsiInterval$Optimized;->INSTANCE:Lco/notix/lsi/LsiInterval$Optimized;

    invoke-virtual {v0, p1, p2, v1}, Lco/notix/wg;->schedule(JLco/notix/lsi/LsiInterval;)V

    return-void
.end method

.method public schedule(JLco/notix/lsi/LsiInterval;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation

    .line 2
    const-string v0, "interval"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$delegate_0:Lco/notix/wg;

    invoke-virtual {v0, p1, p2, p3}, Lco/notix/wg;->schedule(JLco/notix/lsi/LsiInterval;)V

    return-void
.end method

.method public setCallbacks(Lco/notix/lsi/LockScreenInterstitialCallback;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lco/notix/utils/ExperimentalNotixApi;
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/lsi/NotixLockScreenInterstitialAd$Companion;->$$delegate_0:Lco/notix/wg;

    invoke-virtual {v0, p1}, Lco/notix/wg;->setCallbacks(Lco/notix/lsi/LockScreenInterstitialCallback;)V

    return-void
.end method
