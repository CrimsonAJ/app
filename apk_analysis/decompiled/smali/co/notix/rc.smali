.class public final Lco/notix/rc;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:Lco/notix/lsi/LockScreenInterstitialActivity;


# direct methods
.method public constructor <init>(Lco/notix/lsi/LockScreenInterstitialActivity;)V
    .locals 0

    iput-object p1, p0, Lco/notix/rc;->a:Lco/notix/lsi/LockScreenInterstitialActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/notix/rc;->a:Lco/notix/lsi/LockScreenInterstitialActivity;

    .line 2
    .line 3
    iget-object v0, v0, Lco/notix/lsi/LockScreenInterstitialActivity;->z:Lco/notix/tc;

    .line 4
    .line 5
    iget-object v0, v0, Lco/notix/tc;->a:Lco/notix/lsi/LockScreenInterstitialCallback;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lco/notix/lsi/LockScreenInterstitialCallback;->onAdClicked()V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, LA7/n;->a:LA7/n;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
